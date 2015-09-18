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
				max = i;
			}
			for (int j = 0; A[j] < max; j++) {
				if (A[j] > max2) {
					max2 = j;

				}
			}
		}

		return max2;
	}
}
 