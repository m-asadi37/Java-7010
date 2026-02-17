public class Main {

    public static void main(String[] args) {
        User user1 = new User("user1234", "4321");
        BankAccount bankAccount1 = new BankAccount(1, "1012-1012", 1500);
        BankAccount bankAccount2 = new BankAccount(2, "9810-8745");

        int[] arr1 = new int[10];
        int[] arr2 = {1, 2, 3, 4};

//        BankAccount[] arr = {bankAccount1, bankAccount2};
//        user1.setBankAccount(arr);

        BankAccount bankAccount3 = new BankAccount(3, "7612-8712", 1270);
//        arr = new BankAccount[]{bankAccount1, bankAccount2, bankAccount3};
//        user1.setBankAccount(arr);

        user1.addBankAccount(bankAccount1);
        user1.addBankAccount(bankAccount2);
        user1.addBankAccount(bankAccount3);

        user1.removeBankAccount(bankAccount2);

        user1.showInfo();
    }

    public static void main1(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }

        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }
        System.out.println(sum);

        BankAccount[] arr = new BankAccount[3];
        arr[0] = new BankAccount(1000);
        arr[1] = new BankAccount(200);
        arr[2] = new BankAccount(30);
        double total = 0.0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].getBalance();
        }
        System.out.println(total);

    }
}
