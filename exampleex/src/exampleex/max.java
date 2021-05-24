package exampleex;

import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int max = num1;
		int min = num2;
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		int gcd = 1;
		
		for(int i = 1; i <= min; i++) {
			if(max % i == 0 && min % i == 0 ) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}

}
