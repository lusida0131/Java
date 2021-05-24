package exampleex;

public class aaaa {

	public static void main(String[] args) {
		int arr[] = new int[100];
		boolean gre[] = new boolean[100];
		
		arr [0] = 1;
		arr [1] = 2;
		arr [2] = 3;
		arr [3] = 1;
		arr [4] = 1;
		arr [5] = 2;
		arr [6] = 3;
		arr [7] = 4;
		arr [8] = 5;
		arr [9] = 5;
			for(int i = 0; i <= 100; i++) {
				gre[arr[i]] = true;
				
			}
		
		
			for(int i = 1; i <= 100; i++) {
				if(gre[i]) {
					System.out.println(i + " ");
				}
				
			}
	
	}

}
