package proj4;

public class MissingInteger {

	public static void main(String[] args) {

		MissingInteger pme = new MissingInteger();
		int perm = pme.solution(new int[] { -6,-5,-3 });
		System.out.println(perm);

	}

	int solution(int[] A) {
		java.util.Arrays.sort(A); // {1,1,2,3,4,6}

		int brakujaca = 0;
		for (int i = 0; i < A.length - 1;) { 
			System.out.println(A[i]);
			if (A[i + 1] == A[i] + 1) {

				i++;

			} else if (A[i + 1] == A[i]) { 

				i++;
			} else { 

				brakujaca = A[i] + 1;
				System.out.println("brakujaca to:");
				break;// ; //
			}

		}
		if (brakujaca == 0) {

			System.out.println("nie ma brakujacej");
			
			return 0;
		}
		return brakujaca;
	}
}