package exampleex;


import java.util.Arrays;
import java.util.Scanner;

public class while1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
			
		for(int s : arr) {
			s = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr);
		
//		int max = array[s];
//		for(int s = 0; s < arr.length; s++) {
//			if(arr[s] > max) {
//				max = arr[s];
//			}
//		}

		
	}
}
