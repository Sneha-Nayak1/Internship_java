package Strings;

public class FirstString {
	public static void main(String[] args) {
		String name1="sneha";
		String name2="sneha";
		String name5="SNEHA";
		
		String name3=new String("suraj");
		String name4=new String("sneha");
		
//		System.out.println(name1==name2);
//		System.out.println(name1==name4);
//		
//		System.out.println(name1.equals(name2));
//		System.out.println(name3.equals(name4));
//		System.out.println(name2.equals(name4));
//		System.out.println(name3.equalsIgnoreCase(name5));
//		
//		System.out.println(name1+name2+name3);
//		System.out.println(name1.concat(name3));
		
//		name1="raha";
//		System.out.println(name1);
		
		StringBuffer sb=new StringBuffer("sneha");
//		sb.append("nayak");
//		System.out.println(sb);
		
//		sb.insert(4, "nayak");
//		System.out.println(sb);
		
//		sb.replace(1, 3, "nayak");
//		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		
		
	}
	
	

}
