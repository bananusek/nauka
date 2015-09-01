package proj4;

public class MissingInteger {

	public static void main(String[] args) {

		MissingInteger pme = new MissingInteger();
		int perm = pme.solution(new int[] { 1,2,3,4 });
		System.out.println("ktora-->" + perm);

	}

	int solution(int[] A) {
		java.util.Arrays.sort(A); 

		int brakujaca = 0;
		for (int i = 0; i < A.length - 1;) { 
			System.out.println(A[i]);
			if (A[i + 1] == A[i] + 1 || A[i + 1] == A[i]) {

				i++;

			} else if (A[i + 1] != A[i] + 1) {
				
				brakujaca = A[i] + 1;

				break;

			} else { 
				
				System.out.println("nie ma brakujacej");
				break;
			}

		}
		return brakujaca; //

	}
}
