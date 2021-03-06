package ch22;
class Box<T> {
	protected T ob;
	public void set(T o) { ob = o;}
	public T get() {return ob; }
	
	@Override
	public String toString() {
		return ob.toString();
	}
}
class Unboxer {
	public static void peekBox(Box<? extends Number> box) {
		System.out.println(box);
	}
}
class SteelBox<T> extends Box<T> {
	public SteelBox(T o) {
		ob= o;
	}
}
class GenericInheritance {

	public static void main(String[] args) {
		Box<Integer> iBox = new SteelBox<>(7659);
		Box<String> sBox = new SteelBox<>("Simple");
		System.out.println(iBox.get());
		System.out.println(sBox.get());
	}

}
