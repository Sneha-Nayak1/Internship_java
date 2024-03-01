package Maps;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap h1= new LinkedHashMap();
		h1.put("a",1);
		h1.put("b",2);
		h1.put("c",3);
		h1.put("d",4);
		h1.put("e",5);
		System.out.println(h1);
		
		System.out.println(h1.containsValue(10));
		System.out.println(h1.containsKey("k"));
		h1.remove("b");
		System.out.println(h1);
		

	}

}
