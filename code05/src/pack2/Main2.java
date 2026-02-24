package pack2;

public class Main2 {

    public static void main(String[] args) {
        Test test = new Test(10, 12);

        System.out.println(test.getId());
        System.out.println(test.getFinalId());

        test.setId(20);
//        test.setFinalId(24);

        System.out.println(test.getId());
        System.out.println(test.getFinalId());

        Test test2 = new Test(1);
        System.out.println(test2.getFinalId());
        System.out.println(test2.getFinalId2());
    }
}
