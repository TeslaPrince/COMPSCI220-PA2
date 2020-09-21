package PA2;
public class MaxAndCount{
	private static int [] array;
	public MaxAndCount(final int [] array) {
		this.array = array;
	}
	public final int findMax(int left, int right) {
		if(left < 0 || right >= array.length || right < left) {
			return Integer.MIN_VALUE;
		}
		int maximum = left;
		for (int i = left + 1; i <= right; i++) {
			if (array[i] > array[maximum]) {
				maximum = i;
			}
		}
		return array[maximum];
	}
	public final int findMax() {
		return findMax(0, array.length-1);
	}
	public static final int countKey(int left, int right, int key) {
		if(left < 0 || right >= array.length - 1) {
			return -1;
		}
		int counter = 0;
		for(int i = left; i <= right; i++) {
			if(key == array[i]) {
				counter++;
			}
		}
		return counter;
	}
	public static final int countKey(int key) {
		return countKey(0, array.length - 1, key);
	}
}
