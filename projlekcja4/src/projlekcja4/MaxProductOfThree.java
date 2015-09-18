package projlekcja4;

public class MaxProductOfThree {
	public static void main(String[] args) {
		MaxProductOfThree mp = new MaxProductOfThree();
		int lol = mp.solution(new int[] { -3, 1, 2, -2, 5, 6 });
		System.out.println(lol);
	}

	public int solution(int[] A) {
		int max = 0;
		int max2 = 0;
		int max3 = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > max) {
				max = A[i];
			}
			for (int j = 0; A[j] < A.length; j++) {
				if (A[j] > max2) {
					if (A[j] == max) {
						j++;
					}
					max2 = A[j];
					for (int k = 0; A[k] < A.length; k++) {
						if (A[k] > max3) {
							if (A[k] == max || A[k] == max2) {
								k++;
							}
							max3 = A[k];
						}
					}
				}
			}
		}
		return max3;
	}
}
