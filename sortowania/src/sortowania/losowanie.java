package sortowania;

import java.util.Arrays;
import java.util.Random;

public class losowanie {

	public static void main(String[] args) {

		Random r = new Random();
		int[] t = new int[10];
		
		for (int i = 0; i < t.length; i++) {
			//t[i] = i;
			t[i] = r.nextInt();
			System.out.println(t[i]);
		}
		System.out.println("program start");

		int[] a = new int[t.length];
		int[] b = new int[t.length];
		int[] c = new int[t.length];
		int[] d = new int[t.length];
		int[] e = new int[t.length];
		int[] f = new int[t.length];
		for (int i = 0; i < a.length; i++) {

			a[i] = t[i];
			b[i] = t[i];
			c[i] = t[i];
			d[i] = t[i];
			e[i] = t[i];
			f[i] = t[i];

		}
		//////////////Java//////////////////////////////////
		System.out.println("przed sortowaniem");
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
		long java = System.nanoTime();
		Arrays.sort(t);
		long java2 = System.nanoTime();
		System.out.println("po sortowaniu");
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
		/////////////Selection////////////////////////////////////////
		System.out.println("przed sortowaniem");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		long selection = System.nanoTime();
		SelectionSort ss = new SelectionSort();
		ss.solution(a);
		long selection2 = System.nanoTime();
		System.out.println("po sortowaniu");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		/////////////Bubble/////////////////////////////////////////////
		System.out.println("przed sortowaniem");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		long bubble = System.nanoTime();
		BubbleSort bs = new BubbleSort();
		bs.solution(b);
		long bubble2 = System.nanoTime();
		System.out.println("po sortowaniu");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		////////////Insertion/////////////////////////////////////////////////
		System.out.println("przed sortowaniem");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		long insert = System.nanoTime();
		InsertionSort is = new InsertionSort();
		is.solution(c);
		long insert2 = System.nanoTime();
		System.out.println("po sortowaniu");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		/////////////Quick/////////////////////////////////////////////////////
		System.out.println("przed sortowaniem");
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		long quick = System.nanoTime();
		QuickSort qs = new QuickSort();
		qs.solution(0, d.length - 1, d);
		long quick2 = System.nanoTime();
		System.out.println("po sortowaniu");
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		////////////Heapsort////////////////////////////////////////////////////
		System.out.println("przed sortowaniem");
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
		long heap = System.nanoTime();
		Heapsort hs = new Heapsort();
		hs.sort(e);
		long heap2 = System.nanoTime();
		System.out.println("po sortowaniu");
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
		/////////////MergeSort//////////////////////////////////////////////////
		System.out.println("przed sortowaniem");
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
		long merge = System.nanoTime();
		Mergesort ms = new Mergesort();
		ms.mergeSort(f);
		long merge2 = System.nanoTime();
		System.out.println("po sortowaniu");
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
		////////////////////////////////////////////////////////
		System.out.println("Czas wykonania funkcji Javy:\t" + (java2 - java) + "\nCzas wykonania Bubble Sort:\t"
				+ (bubble2 - bubble) + "\nCzas wykonania SelectionSort:\t" + (selection2 - selection)
				+ "\nCzas wykonania InsertionSort:\t" + (insert2 - insert) + "\nCzas wykonania QuickSort:\t"
				+ (quick2 - quick) + "\nCzas wykonania Heapsort:\t" + (heap2 - heap) + "\nCzas wykonania Mergesort:\t"
				+ (merge2 - merge));

	}
}