public class exp extends exp2{
   String name;
   
   // Polymorphism (overloading)
   public void sayName() {
     System.out.println("My Name!");
   }
   public void sayName(String name) {
     System.out.println("My name is" + name);
   }

   // Overwriting
   public void sayHi() {

   }
   public static void main(String[] args) {
    exp e1 = new exp();
    e1.sayHi();
   }
}
