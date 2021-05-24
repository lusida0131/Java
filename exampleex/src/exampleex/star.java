package exampleex;

import java.util.Scanner;

public class star {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			for(int j = a - 1; 0 < j ; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < a; j++) {
				System.out.print("*");
			}
		}
		
	}
}