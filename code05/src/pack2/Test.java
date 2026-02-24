package pack2;

//final : property - method - class
public class Test {

    //way 1 : initialize in ALL constructors
    public Test(int id, int finalId) {
        this.id = id;
        this.finalId = finalId;
    }

    public Test(int id) {
        this.id = id;
        this.finalId = -id;
    }

    //way 2 : initialize in-line
    private int id;
    private final int finalId;
    private final int finalId2 = 100;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFinalId() {
        return finalId;
    }

    public int getFinalId2() {
        return finalId2;
    }

    //    public void setFinalId(int finalId) {
//        this.finalId = finalId;
//    }
}
