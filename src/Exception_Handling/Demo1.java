package Exception_Handling;

class NegativeRadiusException extends Exception{
	public String toString()
	{
		return "wrong radius";
		
	}
	
	public String getMessage()
	{
		return "wrong radius";
		
	}
	
}
public class Demo1 {
	public static double area(int r) throws NegativeRadiusException{
		if(r<0) {
			throw new NegativeRadiusException();
		}
		double res=Math.PI*r*r;
		return res;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			try {
////				int val=100;
////				int res=val/0;
////				System.out.println(res);
//				
//				String s=null;
//				System.out.println(s.length());
//			   }
//			catch (Exception e){
//				System.out.println("invlid");
//				e.printStackTrace();
//			}
		  		
		try {
			double ar=area(-1);
			System.out.println(ar);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
			
	}

}
