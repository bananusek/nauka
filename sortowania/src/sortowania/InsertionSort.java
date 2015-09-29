package sortowania;

public class InsertionSort {
	public static void main(String[] args) {
		InsertionSort bs = new InsertionSort();
		int lol = bs.solution(new int[] { 5, 5, 8, -4, 4, 9 });
		System.out.println(lol);
	}

	public int solution(int[] A) {
		if (A.length == 0) {
			return 0;
		}
		for (int i = 0; i < A.length; i++) {
			int a = A[i];
			int j = i;
			while (j > 0 && A[j - 1] > a) {
				A[j] = A[j - 1];
				j = j - 1;
			}
			A[j] = a;
		}
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		return 1;
	}
}