package sortowania;

public class BubbleSort {

	public int solution(int[] A) {
		int a = 0;
		if (A.length == 0) {
			return 0;
		}

		for (int i = 0; i < A.length - 1; i++) {

			if (A[i] > A[i + 1]) {
				a = A[i + 1];
				A[i + 1] = A[i];
				A[i] = a;
			}
		}

		return 1;
	}
}