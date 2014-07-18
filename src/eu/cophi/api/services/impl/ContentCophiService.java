/**
 * 
 */
package eu.cophi.api.services.impl;

import eu.cophi.api.model.impl.BasicContent;
import eu.cophi.api.services.ContentService;

/**
 * @author Angelo Del Grosso
 *
 */
public class ContentCophiService implements ContentService {

	/**
	 * 
	 */
	public ContentCophiService() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see eu.cophi.api.services.ContentService#getContent()
	 */

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return new BasicContent().getType();
	}

}
