package eu.cophi.api.example.item20;

import java.util.Comparator;

public class StringLenComparator implements Comparator<String> {

	private StringLenComparator() {
		// TODO Auto-generated constructor stub
	}

	public static final StringLenComparator INSTANCE = new StringLenComparator();
	
	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.length() - s2.length();
	}



}
