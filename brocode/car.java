public class car {
    //Attributes
    String make = "Volvo";
    String model = "xc60";
    int year = 2013;
    double price = 20000;
    boolean isStarting = false;
    boolean isRunning = false;

    void start() {
        isStarting = true;
        System.out.println("You start the engine");
    }
    void stop() {
        isStarting = false;
        System.out.println("You stop the engine");
    }
    void drive() {
        isRunning = true;
        System.out.println("You drive the car. The car you used is: " + model);
    }
}


