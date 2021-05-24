package ch27;
interface Calculate {
	void cal(int a, int b);
}
class TwoParamNoReturn {
	public static void main(String[] args) {
		Calculate c;
		c = (a, b) -> System.out.println("a 더하기 b = " + (a + b));
		c.cal(3, 4);
		c = (a, b) -> System.out.println("a 빼기 b = " + (a - b));
		c.cal(3, 4);
		c = (a, b) -> System.out.println("a 곱하기 b = " + (a * b));
		c.cal(3, 4);
	}

}
