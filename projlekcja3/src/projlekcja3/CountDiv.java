package projlekcja3;

public class CountDiv {

	public static void main(String[] args) {
		CountDiv dv = new CountDiv();
		int div = dv.solution(0,1, 11);
		System.out.println( div );
	}

	public int solution(int A, int B, int K) {
		int ile = 0;
		
		
		int[] tab = new int[B];
		for (int i = A; i <=B; i++) {

			tab[i] = i ; /// to powinno nadac od 1,2,3,4,5,6,7,8,9,10,11
			System.out.println("tablica to " + tab[i]+ " dla i = "+i);
		}

		for (int j = A ; j <=B; j++) {
			if (tab[j] % K == 0) {
				ile = ile + 1;
				System.out.println("podzielna to   " + tab[j] );
			}

		}
		return ile;

	}

}
