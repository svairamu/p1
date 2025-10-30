package h2;

public class H2_main {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int k = 30;
		int min = i;
		int max = i;
		if (j > i) {
			max = j;
		} else {
			min = j;
		}
		if (k > max) {
			max = k;
		}
		if (k < min) {
			min = k;
		}
		System.out.println("Min: " + min + " Max: " + max);
	}
}
