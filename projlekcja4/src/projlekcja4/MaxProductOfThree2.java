package projlekcja4;

public class MaxProductOfThree2 {
	public static void main(String[] args) {
		MaxProductOfThree2 mp = new MaxProductOfThree2();
		int lol = mp.solution(new int[] { -5, 5, -5, 4 });
		System.out.println(lol);
	}

	public int solution(int[] A) {
		java.util.Arrays.sort(A);
		int a = 0;
		int ost = A[A.length - 1];
		int przed = A[A.length - 2];
		int przed2 = A[A.length - 3];
		a = ost * przed * przed2;
		int pier = A[0];
		int druga = A[1];

		if (Math.abs(pier) >= ost && Math.abs(druga) >= przed) {
			a = pier * druga * przed2;
		}

		return a;
	}
}
