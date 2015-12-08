package sortowania;

public class SelectionSort {
	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		int lol = ss.solution(new int[] { 5, 5, 8, -4, 4, 9 });
		System.out.println(lol);
	}

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
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		return 1;
	}
}
