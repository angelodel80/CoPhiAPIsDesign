package eu.cophi.api.example.inheritance;

import java.util.Date;

public final class Sub extends Super {
	private final Date date; // Blank final, set by constructor

	Sub() {
		date = new Date();
	}

	// Overriding method invoked by superclass constructor
	@Override
	public void overrideMe() {
		System.out.println(date);
	}
	
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		Sub sub = new Sub();
		sub.overrideMe();
		Object o = new Object();
		Class<?> cl = Class.forName("java.lang.Object");
		System.out.println(cl.toString());
	}
}
