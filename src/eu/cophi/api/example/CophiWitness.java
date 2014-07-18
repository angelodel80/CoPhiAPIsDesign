/**
 * 
 */
package eu.cophi.api.example;

import eu.cophi.api.model.Witness;
import eu.cophi.api.utils.ContentUtils;

/**
 * @author Angelo Del Grosso
 *
 */
public class CophiWitness implements Witness {

	/**
	 * 
	 */
	public CophiWitness() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return ContentUtils.generateContent(23);
	}

}
