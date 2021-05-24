package exampleex;

import java.util.Scanner;

public class day {
	public static int getNum (int i) {
		int j = 0;
		
		while(i > 0) {
			if(i % 3 == 0 | i % 6 == 0 | i % 9 == 0) {
				j++;
			}
			i /= 10;
		}
		return j;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i < n; i++ ) {
			int cnt = getNum(i);
			if(cnt == 0) {
				System.out.println(i + " ");
			}
			else {
				for(int l = 0; l < cnt; l++) {
					System.out.print("짝");
				}
				System.out.println();
			}
		}
	}

}
