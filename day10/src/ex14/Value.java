package ex14;

class Value {
	public static void main(java.lang.String[] args) {
		
		int[] arr = {120, 5, 9, 65, 70};
		System.out.println("최솟값 = " + minValue(arr));
		System.out.println("최댓값 = " + maxValue(arr));
	}
	
	public static int minValue(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(min > arr[i]) {
			   min = arr[i];
			}
		}
		return min;
	}
	
	public static int maxValue(int[] arr) {
		int max = arr[0];
		for (int e : arr) {
			if (e > max) {
				max = e;
			}					
		}
		return max;
	}
}	
