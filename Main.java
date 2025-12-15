public class Main {
    int x = 5;
    int y = 5;
    final int z = 10;

    public static void main(String[] args) {
        Main myObj = new Main();
        Main myObj2 = new Main();
        Main myObj3 = new Main();
        myObj2.y = 10;
        System.out.println(myObj.x);
        System.out.println(myObj2.y);
        System.out.println(myObj3.z);
    }
}

