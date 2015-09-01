package proj4;

public class MissingInteger {

	public static void main(String[] args) {

		MissingInteger pme = new MissingInteger();
		int perm = pme.solution(new int[] { 1, 2, 3, 4 });
		System.out.println("ktora-->" + perm);

	}

	int solution(int[] A) {
		java.util.Arrays.sort(A); // {1,1,2,3,4,6}

		int brakujaca = 0;
		for (int i = 0; i < A.length - 1;) { // 2==1+1 to i=3, 3==2+1 to i=4,
												// 4==3+1 to i==5,
			System.out.println(A[i]);
			if (A[i + 1] == A[i] + 1) {

				i++;

			} else if (A[i + 1] == A[i]) { // 1. 1==1 to i=2,

				i++;
			} else { // 6!=4+1 wtedy

				brakujaca = A[i] + 1;

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