package Collection;
import java.util.*;

public class ListIterator_First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		for(int i=0;i<10;i++) {
			al.add(i);
		}
		System.out.println(al);
		ListIterator ltr=al.listIterator();
		while(ltr.hasNext()) {
			int i=(Integer) ltr.next();
			System.out.print(i+ " ");
			if(i%2==0) {
				i++;
				ltr.set(i);
				ltr.add(i);
			}
		}
		
		
		System.out.println();
		System.out.println(al);

	}

}
