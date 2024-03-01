package Maps;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap h1=new HashMap();
		h1.put("a",1);
		h1.put("b",2);
		h1.put("c",3);
		h1.put("d",4);
		h1.put("e",5);
		System.out.println(h1);
		
		if(h1.containsKey("e")) {
			System.out.println(h1.get("a"));
		}
		
		h1.remove("e");
		System.out.println(h1);
		System.out.println(h1.size());
		System.out.println(h1.isEmpty());
		h1.clear();
		System.out.println(h1);
		

	}

}
