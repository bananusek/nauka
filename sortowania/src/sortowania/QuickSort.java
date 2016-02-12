package sortowania;

public class QuickSort {

	public void solution(int l, int p, int[] tab) {
		int x = tab[(l + p) / 2];
		int i = l;
		int j = p;
		int w;
		do {
			while (tab[i] < x)
				i = i + 1;
			while (x < tab[j])
				j = j - 1;
			if (i <= j) {
				w = tab[i];
				tab[i] = tab[j];
				tab[j] = w;
				i = i + 1;
				j = j - 1;
			}
		} while (i <= j);
		if (l < j)
			solution(l, j, tab);
		if (i < p)
			solution(i, p, tab);
	}
}
