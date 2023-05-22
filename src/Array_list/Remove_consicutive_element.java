package Array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class  Remove_consicutive_element {
	
	public static ArrayList<Integer>Remove(int arr[]){
		
		ArrayList<Integer> result = new ArrayList<>();
		
		result.add(arr[0]);
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]!=arr[i-1]) {
				
				result.add(arr[i]);
			}
		}
	 	
	return result;	
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		for(int i=0;i<n;i++) {
			
			arr[i] = sc.nextInt();
		}
		// call the function
		
		ArrayList<Integer>result = Remove(arr);
		
		for(int i : result) {
			System.out.print(i+" ");
		}
		
		
	}
}
