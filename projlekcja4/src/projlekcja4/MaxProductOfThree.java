package projlekcja4;

public class MaxProductOfThree {
	public static void main(String[] args) {
		MaxProductOfThree mp = new MaxProductOfThree();
		int lol = mp.solution(new int[] { -3, 1, 2, -2, 5, 6 });
		System.out.println(lol);
	}

	public int solution(int[] A) {
		java.util.Arrays.sort(A);
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		int a = 0;
		
		a=A[A.length]*A[A.length-1]*A[A.length-3];

		return a;
	}
}
