package List_and_set_interface;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<Integer>();
		
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		System.out.println(li);
		li.remove(1);
		System.out.println(li);
		System.out.println(li.get(2));

	}

}
