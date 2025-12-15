public class brocode {
    public static void main(String[] args) {
        car car = new car();
        car car2 = new car();

//        System.out.println(car.make);
//        System.out.println(car.model);
//        System.out.println(car.year);
//        System.out.println(car.isRunning);

        System.out.println(car.make + " " + car.model);
        System.out.println(car2.make + " " + car2.model);

        car.drive();
    }
}
