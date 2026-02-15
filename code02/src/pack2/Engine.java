package pack2;

public class Engine {

    private int power;
    private String model;

    public Engine(int power, String model) {
        this.power = power;
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void start(){
        System.out.println("engine starting...");
    }

    public void off() {
        System.out.println("engine turning off...");
    }
}
