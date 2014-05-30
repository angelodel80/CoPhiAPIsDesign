package eu.cophi.api.example.inheritance;

import java.io.Serializable;

public class Super implements Serializable{
	// Broken - constructor invokes an overridable method
	public Super()  {
		//overrideMe();
		helperMethod();
		
	}

	public void overrideMe() {
		helperMethod();
	}
	
	private void helperMethod(){
		System.err.println("ciao");
	}
}
