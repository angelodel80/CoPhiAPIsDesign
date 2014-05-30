package eu.cophi.api.example;

import eu.cophi.api.ApiJunk;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.AbstractList;




public class Junk extends ApiJunk{

	private static boolean  TEST = true;
	
	public Junk() {
		// TODO Auto-generated constructor stub
		System.err.println(pMethods());
		System.err.println(super.pMethods());
	}

	@Override
	protected String pMethods() {
		return "Metodo protetto della classe derivata";
	};
	
	private static void run2(){
		AbstractList<String> li = new AbstractList<String>() {
			
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String get(int index) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		li.clear();
	}
	
	private static void run(){
		AbstractCollection<String> coll = new AbstractCollection<String>() {
			
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 1;
			}
			
			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<String>() {

					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						boolean ret = TEST;
						TEST = false;
						System.err.println(ret);
						return ret;
					}

					@Override
					public String next() {
						// TODO Auto-generated method stub
						System.err.println(String.valueOf("CIAO"));
						return "CIAO";
					}

					@Override
					public void remove() {
						// TODO Auto-generated method stub
						
					}

				};
			}
		};
		//coll.clear();
		System.out.println(coll.toString());
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//run();
		ApiJunk test = new Junk();
		System.err.println(test.nopMethods());
	}

}
