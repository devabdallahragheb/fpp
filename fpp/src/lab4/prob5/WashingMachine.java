package lab4.prob5;

public class WashingMachine implements Electronic{
    private int loadCapacity;

    public WashingMachine(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void performFunction() {
        System.out.println("Starting wash cycle with load capacity: " + loadCapacity + " kg.");
    }
}
