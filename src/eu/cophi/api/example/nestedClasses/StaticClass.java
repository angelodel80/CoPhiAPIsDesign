package eu.cophi.api.example.nestedClasses;

public class StaticClass {

	public StaticClass() {
		// TODO Auto-generated constructor stub
	}

	private static void stampaPrivata(){
		System.err.println("stampa privata");
	}
	
	public void stampaPubblica(){
		System.err.println("stampa pubblica");
	}

	public static class NestedStaticClass {
		
		public void neStampaPrivata(){
			stampaPrivata();
		}

	}

	private static class NePrivStaticClass {
		public void StampaInner(){
			System.err.println("stampa inner pivate");
		}

	}


}
