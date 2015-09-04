package proj4;



public class PermCheck {

	public static void main(String[] args) {

		PermCheck pme = new PermCheck();
		int perm = pme.solution(new int[] { 4, 3, 2 });// powinno wyjsc 0
		System.out.println("czy jest? " + perm);

	}

	int solution(int A[]) {

		java.util.Arrays.sort(A);

		
		for (int i = 0; i < A.length - 1; i++) {
			
			if (A[i + 1] != A[i] + 1) {

				return 0;
			}

		}

		return j;

	}

}
