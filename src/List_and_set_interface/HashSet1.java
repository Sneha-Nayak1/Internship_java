package List_and_set_interface;
import java.util.*;
public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h1=new HashSet();
		h1.add(11);
		h1.add(12);
		h1.add(3);
		h1.add(411);
		System.out.println(h1);
		h1.remove(411);
		System.out.println(h1);
		Iterator i=h1.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+ " ");
		}
		System.out.println();
		h1.clear();
		System.out.println(h1);
		
//		ArrayList<Integer> a1=new ArrayList();
//		a1.add(10);
//		a1.add(100);
//		a1.add(130);
//		a1.add(310);
//		System.out.println(a1);
//		HashSet<Integer> h = new HashSet();
//		
//		a1.forEach(val->{h.add(val);});
//		for(int val: h) {
//			System.out.println(val);
//		
//		}
		

	}

}
