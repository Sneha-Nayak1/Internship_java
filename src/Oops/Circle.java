package Oops;

public class Circle extends Shape{
   public void display() {
	   System.out.println("cicle");
   }
   public static void main(String []args) {
	   Shape c= new Circle();
	   c.display();
	   c.student();
   }
}
