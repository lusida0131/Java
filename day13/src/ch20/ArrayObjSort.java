package ch20;

import java.util.Arrays;

class Person implements Comparable {
	private String name;
	private int age;	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	@Override
//	public int compareTo(Object o) {
//		Person p = (Person)o;
//		if (this.age > p.age)
//			return 1;
//		else if (this.age < p.age)
//			return -1;
//		else
//			return 0;
//	}
	
	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		return this.age - p.age;
	}
	
	@Override
	public String toString() {
		return name + ":" + age;
	}
}

class ArrayObjSort {
	public static void main(String[] args) {
		Person[] ar = new Person[6];
		ar[0] = new Person("Lee", 29);
		ar[1] = new Person("Goo", 15);
		ar[2] = new Person("Soo", 37);
		ar[3] = new Person("Lee", 9);
		ar[4] = new Person("Goo", 5);
		ar[5] = new Person("Soo", 7);
		Arrays.sort(ar);
		for(Person p : ar)
			System.out.println(p);
	}
}
