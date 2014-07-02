package eu.cophi.api;

public class ApiJunk {

	public static final double VER = 0.00;
	
	public ApiJunk() {
		// TODO Auto-generated constructor stub
	}
	
	protected String pMethods(){
		return "This is a protected method!";
	}
	
	public String nopMethods(){
		return "This is not a protected method!";
	}
	
	@Override
	public String toString() {return "Api version: " +VER;};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
