package pack2;

//final : property - method - class
public class Test {

    public Test(int id, int finalId) {
        this.id = id;
        this.finalId = finalId;
    }

    private int id;
    private final int finalId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFinalId() {
        return finalId;
    }

//    public void setFinalId(int finalId) {
//        this.finalId = finalId;
//    }
}
