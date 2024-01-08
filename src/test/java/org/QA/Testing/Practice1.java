package org.QA.Testing;


public class Practice1 {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		for (int i = 0; i < 100; i++) {
			int c = a + b;

			System.out.println(a);
			a = b;
			b = c;
		}
	}
}
