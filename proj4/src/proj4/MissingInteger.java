package proj4;

public class MissingInteger {

	public static void main(String[] args) {

		MissingInteger pme = new MissingInteger();
		int perm = pme.solution(new int[] {-5,-4,-3,-2});
		System.out.println(perm);

	}


	    public int solution(int[] A) {
	      java.util.Arrays.sort(A);
	
			int brakujaca = 0;
			for (int i = 0; i < A.length - 1;) {
			
				if (A[i + 1] == A[i] + 1) {
					
					i++;

				} else if (A[i + 1] == A[i]) {
					
					i++;
				} else {

					brakujaca = A[i] + 1;
				
					

				}

			}

			if (brakujaca < 0) {

				brakujaca = 1;

			}
			
			else if(brakujaca==0){
			
				brakujaca=A[A.length-1]+1;
			}
			
			return brakujaca;
		}


	}