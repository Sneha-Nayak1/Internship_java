package List_and_set_interface;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		LinkedList list1=new LinkedList();
		list1.add(1);
		list1.add(12);
		list1.add(13);
		list.add(1);
		list.add(12);
		list.add(13);
		list.add(17);
		System.out.println(list);
		list.addFirst(122);
		list.addLast(1000);
		System.out.println(list);
		list.add(1, list1);
		System.out.println(list);
		
	

	}

}
