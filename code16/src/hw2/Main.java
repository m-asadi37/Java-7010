package hw2;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver("ali","ahmadi","09876543211",100000);
        System.out.println(driver.getId());

        Driver driver2 = new Driver("reza","rezaee","09876543211",100000);
        System.out.println(driver2.getId());

        driver.equals(driver2);
    }
}
