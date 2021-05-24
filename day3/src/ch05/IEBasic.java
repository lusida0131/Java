package ch05;

public class IEBasic {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 7;
		
	
		if(n1<n2) {
			System.out.println("n1<n2 is true");
		
		}
		if (n1>n2) {
			System.out.println("n1>n2 is false");       
		}
	
		if (n1 == n2) {
			System.out.println("n1== n2 is true");
		}
		else {
			System.out.println("n1 == n2 is false");
		}
		if (n1>n2) {
			System.out.println("n1>n2 is true");
		}
		else {
			System.out.println("n1>n2 is false");
			
		}
		
		int a = 91;
		if (a > 90) {
			System.out.println("a�� ������ A�Դϴ�.");
		}
		else if (a>80) {
			System.out.println("a�� ������ B�Դϴ�.");
		}
		else  {
			System.out.println("a�� ������ F�Դϴ�.");
		}
	}

}

