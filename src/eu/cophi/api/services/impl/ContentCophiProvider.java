/**
 * 
 */
package eu.cophi.api.services.impl;

import eu.cophi.api.model.impl.BasicContent;
import eu.cophi.api.services.ContentProvider;
import eu.cophi.api.services.ContentService;

/**
 * @author Angelo Del Grosso
 *
 */
public class ContentCophiProvider implements ContentProvider {

	/**
	 * 
	 */
	public ContentCophiProvider() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see eu.cophi.api.services.ContentProvider#newContentService()
	 */
	@Override
	public ContentService newContentService() {
		// TODO Auto-generated method stub
		return new ContentCophiService();
	}

}
