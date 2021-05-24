package exampleex;

import java.util.Scanner;

public class binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int []arr = new int[100];
		int i = 0;
		int mok = a;
		while(mok > 0) {
			arr[i] = mok % 2;
			mok /= 2;
			i++;
		}
		i--;
		for(; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}
}
