package eu.cophi.api.example;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import eu.cophi.api.example.item20.HostStringComparators;
import eu.cophi.api.example.item20.StringLenComparator;

public class JunkFunctionObj {
	public static void main(String[] args) {
		
		String[] as = {"ciao", "mamma", "vedi", "come", "mi", "diverto"};
		//Arrays.sort(as, StringLenComparator.INSTANCE);
	
		Arrays.sort(as, HostStringComparators.STRING_LENGHT_COMPARATOR);
		
		final List<String> l = Collections.synchronizedList(Arrays.asList(as));
		System.out.println(new AbstractList<String>(){

			@Override
			public String get(int index) {
				// TODO Auto-generated method stub
				return l.get(index);
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return l.size();
			}
			
		}.toString());
		
		Arrays.sort(as, HostStringComparators.STRING_LENGHT_COMPARATOR_INVERTED);
		final List<String> l2 = Collections.synchronizedList(Arrays.asList(as));
		System.out.println(new AbstractList<String>(){

			@Override
			public String get(int index) {
				// TODO Auto-generated method stub
				return l2.get(index);
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return l2.size();
			}
			
		}.toString());

	}
	
	
	

}
