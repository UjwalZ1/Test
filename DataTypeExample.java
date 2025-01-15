package com.exponant;

public class DataTypeExample {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean flag;
	String str;

	public void m1() {
		byte b = 101;
		short s = 324;
		int i = 1001;
		long l = 12345;
		float f = 202.2f;
		double d = 101.11;
		char c = 'u';
		boolean flag = true;
		String str = "Ujwal";
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(flag);
		System.out.println(str);

	}

	public static void main(String[] args) {

		DataTypeExample ex = new DataTypeExample();

		System.out.println("global data type-->variable");
		System.out.println(ex.b);
		System.out.println(ex.s);
		System.out.println(ex.i);
		System.out.println(ex.l);
		System.out.println(ex.f);
		System.out.println(ex.d);
		System.out.println(ex.c);
		System.out.println(ex.flag);
		System.out.println(ex.str);

		System.out.println("local data type-->variable");
		ex.m1();

	}

}
