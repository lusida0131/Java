package ch31;

import java.time.LocalDate;
import java.time.Period;

class LocalDateDemo2 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);
		
		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("Xmas: " + xmas);
		Period left =Period.between(today, xmas);
		System.out.println("Xmas까지 앞으로 " + left.getMonths() + "월 " + left.getDays() + "일");
		LocalDate x = LocalDate.of(2018, 4, 17);
		Period leave =Period.between(x, today);
		System.out.println("전역하고 지난날: " + leave.getYears() + "년 " + leave.getMonths() +"월 " + leave.getDays() + "일");
	}
}