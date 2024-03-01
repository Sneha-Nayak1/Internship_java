package Arrays;
import java.util.Scanner;

public class Array_parameter {
	
	public static void Array(int arr[]) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
	}
		
			System.out.println(max);
		}
	
	
	public static int[] getArray() {
		return new int[] {1,2,3,4};
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= {1,2,3,4,5};
		
//		System.out.println("Enter array values");
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
		Array_parameter.Array(arr);
		
		
		int arr2[]= Array_parameter.getArray();
		System.out.println(arr2[1]);
	

	}

}
