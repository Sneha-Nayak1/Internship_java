package Collection;
import java.util.*;

public class Iterator_First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a1=new ArrayList();
		for(int i=0;i<10;i++) {
			a1.add(i);
		}
		System.out.println(a1);
		Iterator itr=a1.iterator();
		 while(itr.hasNext()) {
			 int i=(Integer) itr.next();
			 System.out.print(i+" ");
		
			 if(i%2!=0) {
				 itr.remove();
			 }
		
		 }
		 System.out.println();
		 System.out.println(a1);

	}

}
