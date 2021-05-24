package ch18;
class Point implements Cloneable {
	private int xPos;
	private int yPos;
	
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}
	@Override
	public Point clone() throws CloneNotSupportedException {
		return (Point)(super.clone());
	}
}

class InstanceCloning {
	public static void main(String[] args) {
		Point org = new Point(3, 5);
		Point cpy;
		
		try {
			cpy = org.clone();
			org.showPosition();
			cpy.showPosition();
			
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
