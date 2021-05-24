package exampleex;

import java.util.Scanner;

public class Eng {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		char []arr;
		arr = s.toCharArray();
		int i = 0;
		
		
		for(i = 0; i <arr.length; i++) {
			if(arr[i] >= 'a' && arr[i] <='z') {
				arr[i] = (char)(arr[i] + ('A'-'a'));
			}
			else {
				arr[i]	=  (char)(arr[i] -('A'-'a'));
			}
		}
		System.out.println(arr);
	}

}
