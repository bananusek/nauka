package proj4;

public class MissingInteger {

	public static void main(String[] args) {

		MissingInteger pme = new MissingInteger();
		int perm = pme.solution(new int[] {-1});
		System.out.println(perm);

	}

	public int solution(int[] A) {
		java.util.Arrays.sort(A);

		int brakujaca = 0;
		
		int i = 0; 
		
		while(A[i]<0) i ++;{
		
		for ( ;i < A.length -1;) {
			
			if (A[i + 1] == A[i] + 1) {

				i++;

			} else if (A[i + 1] == A[i]) {

				i++;

			} else {

				brakujaca = A[i] + 1;

				break;

			}
		}/// jak usuwam tego whila to jest okej i zwraca dla -1  jedynkê
		
		System.out.println(brakujaca);
		if (brakujaca == 0) {

			brakujaca = A[A.length - 1] + 1;

		}
		if (brakujaca <= 0) {

			brakujaca = 1;

		}
	

		return brakujaca;
	}
	}
}
