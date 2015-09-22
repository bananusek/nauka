package projlekcja4;

public class Distinct {
	public static void main(String[] args) {
		Distinct di = new Distinct();
		int lol = di.solution(new int[] { 2, 1, 1, 2, 3, 1 });
		System.out.println(lol);
	}

	public int solution(int[] A) {
		java.util.Arrays.sort(A);
		int ile = 1;
		for (int i = 0; i < A.length-1; i++) {
			if (A[i] < A[i + 1]) {
				ile = ile + 1;
			}

		}

		return ile;
	}
}