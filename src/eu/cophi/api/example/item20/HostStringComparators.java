package eu.cophi.api.example.item20;

import java.io.Serializable;
import java.util.Comparator;

public class HostStringComparators {

	private HostStringComparators() {
	}
	
	private static class StrLenComp implements Comparator<String>, Serializable{
		@Override
		public int compare(String s1, String s2) {
			// TODO Auto-generated method stub
			return s1.length() - s2.length();
		}
		
	}
	
	private static class StrLenCompInv implements Comparator<String>, Serializable{

		@Override
		public int compare(String s1, String s2) {
			// TODO Auto-generated method stub
			return s2.length() - s1.length();
		}
		
	}
	
	public static final Comparator<String> STRING_LENGHT_COMPARATOR = new StrLenComp();
	public static final Comparator<String> STRING_LENGHT_COMPARATOR_INVERTED = new StrLenCompInv();

}
