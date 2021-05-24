package exampleex;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student st1 = new Student("박현성", "201511");
		Student st2 = new Student("코딩", "201512");
		Student st3 = new Student("선생님", "201513");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		for(Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());	
		}
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("계속 검색하려면 y 종료하려면 n");
			String input = sc.next();
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				String name = sc.next();
				
				for(Student stu : list) {
					if(stu.getName().equals(name)) {
						System.out.println(stu.getNo());
					}
				}
			}
		}
	
	
	}
}