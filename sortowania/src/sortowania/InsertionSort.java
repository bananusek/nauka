package sortowania;
import sortowania.losowanie;
public class InsertionSort {
	
	public int solution(int[] t) {
		if (t.length == 0) {
			return 0;
		}
		for (int i = 0; i < t.length; i++) {
			int a = t[i];
			int j = i;
			while (j > 0 && t[j - 1] > a) {
				t[j] = t[j - 1];
				j = j - 1;
			}
			t[j] = a;
		}
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
		return 1;
	}
}