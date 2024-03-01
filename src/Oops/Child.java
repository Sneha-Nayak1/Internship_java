package Oops;

public class Child implements Parent {
	public void child1() {
		System.out.println("child1");
	}
	
public void child2() {
	System.out.println("child2");
		
	}
public void child3() {
	System.out.println("child3");
}
public void family() {
	System.out.println("family");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.child1();
		c.child2();
		c.child3();
		c.family();

	}

}
