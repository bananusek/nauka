package sortowania;

public class BubbleSort {

	public int solution(int[] A) {
		{
			boolean flaga = true;
			int temp;
			while (flaga) {
				flaga = false;
				for (int i = 0; i < A.length - 1; i++) {
					if (A[i] > A[i + 1]) {
						temp = A[i];
						A[i] = A[i + 1];
						A[i + 1] = temp;
						flaga = true;
					}
				}
			}
			return 1;
		}
	}
}