package sortowania;

import java.util.Arrays;

public class Mergesort {

	void mergeSort(int[] A) {
		if (A.length > 1) {
			int q = A.length / 2;
			int[] leftArray = Arrays.copyOfRange(A, 0, q);
			int[] rightArray = Arrays.copyOfRange(A, q + 1, A.length);
			mergeSort(leftArray);
			mergeSort(rightArray);
			A = merge(leftArray, rightArray);
		}
	}

	static int[] merge(int[] l, int[] r) {
		int totElem = l.length + r.length;
		int[] a = new int[totElem];
		int i, li, ri;
		i = li = ri = 0;
		while (i < totElem) {
			if ((li < l.length) && (ri < r.length)) {
				if (l[li] < r[ri]) {
					a[i] = l[li];
					i++;
					li++;
				} else {
					a[i] = r[ri];
					i++;
					ri++;
				}
			} else {
				if (li >= l.length) {
					while (ri < r.length) {
						a[i] = r[ri];
						i++;
						ri++;
					}
				}
				if (ri >= r.length) {
					while (li < l.length) {
						a[i] = l[li];
						li++;
						i++;
					}
				}
			}
		}
		return a;
	}
}
