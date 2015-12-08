package sortowania;

import java.util.Random;

public class losowanie {

	public static void main(String[] args) {

		Random r = new Random();
		int[] t = new int[100];
		for (int i = 0; i < t.length; i++) {

			t[i] = r.nextInt();
			System.out.println(t[i]);
		}

	}
}