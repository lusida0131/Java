package ch20;

import java.math.BigDecimal;

class DoubleError {

	public static void main(String[] args) {
		double d1 = 1.6;
		double d2 = 0.1;
		System.out.println("덧셈결과: " + (d1 + d2));
		System.out.println("곱셈결과: " + (d1 * d2));
		
		BigDecimal d3 = new BigDecimal("1.6");
		BigDecimal d4 = new BigDecimal("0.1");
		
		System.out.println("덧셈결과: " + d3.add(d4));
		System.out.println("곱셈결과: " + d3.multiply(d4));
	}
}