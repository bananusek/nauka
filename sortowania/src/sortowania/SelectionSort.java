package sortowania;

public class SelectionSort {

	public int solution(int[] A) {
		for (int i = 0; i < A.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < A.length; j++) {
				if (A[minIndex] > A[j]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {

				int a = A[i];
				A[i] = A[minIndex];
				A[minIndex] = a;
			}
		}
		return 1;
	}
}
