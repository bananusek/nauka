package projlekcja3;

public class CountDiv {

	public static void main(String[] args) {
		CountDiv dv = new CountDiv();
		int div = dv.solution(6, 11, 3);
		System.out.println("w przedziale od A do B  " + div + " jest podzielnych przez K");
	}

	public int solution(int A, int B, int K) {
		int ile = 0;
		int C = B - A;// 11-6=5
		System.out.println(C);
		int[] tab = new int[C];
		System.out.println(tab);
		for (int i = 0; i <= C; i++) {

			tab[i] = C + 1;
		}

		System.out.println(tab);

		for (int j = 0; j < tab.length; j++) {
			if (tab[j] % K == 0) {
				ile = ile + 1;
			}
		}

		return ile;

	}

}
