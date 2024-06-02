package lab4.prob5;

public class ApplianceTest {
    public static void main(String[] args) {
        Electronic[] appliances = {
                new WashingMachine(7),
                new Refrigerator(4),
                new Microwave(800)
        };
        for (Electronic appliance : appliances) {
            appliance.performFunction();
        }
    }
}
