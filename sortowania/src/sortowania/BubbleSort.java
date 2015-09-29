package sortowania;

public class BubbleSort {
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int lol = bs.solution(new int[] {});
		System.out.println(lol);
	}

	public int solution(int[] A) {
		int a = 0;
		if(A.length==0){
			return 0;
		}
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = 0; j < A.length - 1; j++) {

				if (A[j] > A[j + 1]) {
					a = A[j + 1];
					A[j + 1] = A[j];
					A[j] = a;
				}
			}
		}
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}

		return 1;
	}
}