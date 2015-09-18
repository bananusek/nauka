package projlekcja4;

public class MaxProductOfThree2 {
	public static void main(String[] args) {
		MaxProductOfThree2 mp = new MaxProductOfThree2();
		int lol = mp.solution(new int[] { -3, 4, 2, -2, 8, 6 });
		System.out.println(lol);
	}
	public int solution(int[] A) {
		java.util.Arrays.sort(A);
		int a=0;
		a=A[A.length-1]*A[A.length-2]*A[A.length-3];
		return a;
	}
}
