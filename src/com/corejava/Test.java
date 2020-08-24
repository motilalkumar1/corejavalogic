package com.corejava;

public class Test {

	public static void main(String[] args) {
		a.b.c = c.b.a;
		System.out.println(a.b.c);
	}
}

class a {
	static class b {
		static int c;
	}
}

class c {
	static class b {
		static int a = 10;
	}
}
