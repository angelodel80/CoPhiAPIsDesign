/**
 * 
 */
package eu.cophi.api.utils;

/**
 * @author Angelo Del Grosso
 *
 */
public class ContentUtils {

	/**
	 * 
	 */
	private ContentUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static String generateContent(int lenght){
		StringBuffer sb = new StringBuffer();
		int count = 0;
		while(count < lenght){
			sb.append("content ");
			count++;
		}
		return sb.toString();
	}

}
