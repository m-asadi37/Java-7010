package pack1;

import java.util.*;

public class Main {

    public static void main1(String[] args) {
        Scanner input = new Scanner(System.in);

        Payment p1 = new Payment(1000);
        Payment p2 = new Payment(2000);

        System.out.println("amount : ");
        double amount = input.nextDouble();

        System.out.println("status : ");
        String str = input.next();

        for (PaymentStatus status : PaymentStatus.values()) {
            System.out.println(status);
        }

        PaymentStatus status = PaymentStatus.valueOf(str);
        Payment p3 = new Payment(amount, status);

        p1.cancel();

        if (p2.getStatus().equals(PaymentStatus.PENDING)) {
            p2.cancel();
        }

        p2.done();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

    public static void main(String[] args) {
        Payment[] arr = new Payment[10];
        arr[0] = new Payment(1000, PaymentStatus.PENDING);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null){
                arr[i] = new Payment(1000, PaymentStatus.PENDING);
            }
        }

        //polymorphism
        List<Payment> paymentList = new ArrayList<>();
    }
}
