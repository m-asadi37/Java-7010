import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        Flight[] array = new Flight[10];
//        List<Flight> flightList = new ArrayList<>();

        boolean isExit = false;
        do {
            String command = scanner.nextLine();

            String[] parts = command.split("#");

            switch (parts[0]) {
                case "ADD-FLIGHT" -> {
                    LocalDateTime time = LocalDateTime.parse(parts[4], formatter);
                    Flight flight = new Flight(parts[1], parts[2], parts[3], time, parts[5]);
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] == null) {
                            array[i] = flight;
                            break;
                        }
                    }
                }
                case "UPDATE" -> {
                    for (Flight find : array) {
                        if (find != null && find.getNumber().equals(parts[1])) {
                            find.setStatus(parts[2]);
                            break;
                        }
                    }
                }
                case "INFO" -> {
                    for (Flight find : array) {
                        if (find != null && find.getNumber().equals(parts[1])) {
                            find.info();
                            break;
                        }
                    }
                }
                case "INFO-ALL" -> {
                    for (Flight find : array) {
                        if (find != null) {
                            find.info();
                            break;
                        }
                    }
                }
                case "EXIT" -> isExit = true;
            }
        } while (!isExit);

    }
}
