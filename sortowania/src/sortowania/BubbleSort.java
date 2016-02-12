package sortowania;

public class BubbleSort {

	public int solution(int[] A) {
		int a = 0;
		if (A.length == 0) {
			return 0;
		}
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i; j < A.length - 1; j++) {
				int swap=0;
				if (A[j] > A[j + 1]) {
					a = A[j + 1];
					A[j + 1] = A[j];
					A[j] = a;
					swap = 1;
				}
				if (swap==0){
					return 1;
				}
			}
		}

		return 1;
	}
}