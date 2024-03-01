package List_and_set_interface;
import java.util.*;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t= new TreeSet();
		t.add(12);
		t.add(122);
		t.add(162);
		t.add(1452);
		t.add(1);
		System.out.println(t);
		System.out.println(t.contains(1));
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println(t.headSet(111));
		System.out.println(t.tailSet(111));
		System.out.println(t.subSet(32, 789));
		

	}

}
