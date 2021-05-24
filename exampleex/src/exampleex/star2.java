package exampleex;

import java.util.Scanner;

public class star2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [][]arr = new int [n][n];
		
		int x = 0;
		int y = 0;
		int num = 1;
		for(int i = 0; i < 2 * n - 1; i++) {
			switch(i % 4) {
			case 0:
				for(int k = 0; k < n; k++) {
					arr[y][x] = num;
					x++;
					num++;
				}
				x--;
				y++;
				n--;
				break;
			case 1:
				for(int k = 0; k < n; k++) {
					arr[y][x] = num;
					y++;
					num++;
				}
				y--;
				x--;
				break;
			case 2:
				for(int k = 0; k < n; k++) {
					arr[y][x] = num;
					x--;
					num++;
				}
				y--;
				x--;
				break;
			case 3:
				for(int k = 0; k < n; k++) {
					arr[y][x] = num;
					y--;
					num++;
				}
				y++;
				x++;
				break;
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
		}
	}
}