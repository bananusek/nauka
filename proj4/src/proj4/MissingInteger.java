package proj4;

public class MissingInteger {

	public static void main(String[] args) {

		MissingInteger pme = new MissingInteger();
		int perm = pme.solution(new int[] { 1, 2, 3, 4, 5, 5, 767, 56, 345 });
		System.out.println(perm);

	}

	public int solution(int[] A) {
		java.util.Arrays.sort(A);

		int brakujaca = 0;

		int niezerowa = 0;

		for (int j = 0; j < A.length - 1; j++) {
			if (A[j] > 0) {

				niezerowa = j;
				break;
			}
		}
		if (A[niezerowa] != 1) {
			return 1;
		}

		System.out.println("niezerowa  " + niezerowa);
		int i = niezerowa;

		for (; i < A.length - 1;) {

			if (A[i + 1] == A[i] + 1) {

				i++;

			} else if (A[i + 1] == A[i]) {

				i++;

			} else {

				brakujaca = A[i] + 1;

				break;

			}
		}
		System.out.println("brakujaca " + brakujaca);
		if (brakujaca == 0) {

			brakujaca = A[A.length - 1] + 1;

		}
		if (brakujaca <= 0) {

			brakujaca = 1;

		}

		return brakujaca;

	}
}
