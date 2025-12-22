public class Main {

    static void myMethod() {
        System.out.println("Hello World!");
    }

    int x;
    int y;
    final int z = 10;
    String a;
    int b;

    //Constructor
    public Main(String name) {
        x = 5;
        y = z;
        a = name;
    }

    public static void main(String[] args) {
        myMethod();
        Main myObj = new Main("Testing");
        Main myObj2 = new Main("Kuranglebih");
        Main myObj3 = new Main("Testan");
        System.out.println(myObj3.a + " " + myObj3.x);
        myObj3.a = "main";
        myObj3.b = 12;
        System.out.println(myObj3.a + " " + myObj3.b);
        System.out.println(myObj.x);
        System.out.println(myObj2.y); // Outputs 10 as z = 10
    }
}

