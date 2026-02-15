package pack2;

public class Car {

    private int capacity;
    private int fuelLevel;
    private Engine engine;

    public Car(int capacity, int fuelLevel, Engine engine) {
        this.capacity = capacity;
        this.fuelLevel = fuelLevel;
        this.engine = engine;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void move() {
        engine.start();
        fuelLevel -= 1;
        engine.off();
    }

    @Override
    public String toString() {
        return "Car{" +
                "capacity=" + capacity +
                ", fuelLevel=" + fuelLevel +
                ", engine=" + engine.getModel() +
                '}';
    }
}
