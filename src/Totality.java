
public class Totality {
	public int sum(int[] a, String stype) {
		int start;
		int step;
		int sum = 0;
		
		if (stype.equals("odd")) {
			start = 1;
			step = 2;
		} else if (stype.equals("even")) {
			start = 0;
			step = 2;
		} else {
			start = 0;
			step = 1;
		}
		
		for (int i = start; i < a.length; i += step) {
			sum += a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Totality totality = new Totality();
		int[] a = {1, 2, 3, 4, 5};
		int sumTest = totality.sum(a, "all");
		System.out.println(sumTest);
	}
}
