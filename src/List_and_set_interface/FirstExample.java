package List_and_set_interface;
import java.util.*;

public class FirstExample {

	public static void main(String[] args) {
	List l1= new ArrayList();
	l1.add(10);
	l1.add(12);
	System.out.println(l1);
	
	List l2=new ArrayList();
	l2.add(5);
	l2.add(10);
	l2.add(33);
	l2.add(90);
	l1.addAll(1,l2);
	System.out.println(l1);
	 l1.remove(5);
	 System.out.println(l1);
	 
	 List l3= new ArrayList();
		l3.add(10);
		l3.add(12);
		System.out.println(l3);
		
		List l4=new ArrayList();
		l4.add(10);
		l4.add(12);
		l4.add(12);
		l4.add(10);
		l3.addAll(1,l4);
		System.out.println(l3);
		System.out.println(l3.indexOf(12));
		System.out.println(l3.lastIndexOf(10));
		
		List l5=new ArrayList();
		l5=l3.subList(1, 4);
		System.out.println(l5);
	
	}

}
