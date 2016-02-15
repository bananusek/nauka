package proj1;

import java.util.Arrays;
import java.util.Random;

public class quicksort {
	public static void main(String[] args) {

		Random r = new Random();
		int[] t = new int[10];
		//int j = 9;
		for (int i = 0; i < t.length; i++) {
			//t[i] = j;
			// t[i] = i;
			 t[i] = r.nextInt(100);

			//j--;
		}
		for (int i = 0; i < t.length; i++) {
			System.out.println("tablicy element="+t[i]);
		}
		quicksort qs = new quicksort();
		qs.solution(0, t.length - 1, t);

		System.out.println("po sortowaniu quick");
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}

	}

	public void solution(int l, int p, int[] tab) {
		int piwot = tab[p];
		int i = l;
		int j = p;
		int temp;
		do {
			while (tab[i] < piwot)
				i = i + 1;
			System.out.println("i while="+i);
			while (tab[j] > piwot)
				j = j - 1;
			System.out.println("j while="+j);
			System.out.println("piwot ="+piwot);
			if (i <= j) {
				temp = tab[i];
				tab[i] = tab[j];
				tab[j] = temp;
				i = i + 1;
				j = j - 1;
				System.out.println("i=" + i);
				System.out.println("j=" + j);
				System.out.println("temp=" + temp);
				System.out.println("piwot ="+piwot);
				System.out.println("//////////////////////////////////");
				for (int k = 0; k < tab.length; k++) {
					System.out.println(tab[k]);
				}
			}
		} while (i <= j);
		if (l < j)
			solution(l, j, tab);
		if (i < p)
			solution(i, p, tab);
	}

}
