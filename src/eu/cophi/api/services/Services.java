/**
 * 
 */
package eu.cophi.api.services;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import eu.cophi.api.model.Content;

/**
 * @author Angelo Del Grosso
 *
 */
public class Services {
	private Services(){};
	
	private static final Map<String, ContentProvider> ContentProviders = new ConcurrentHashMap<String, ContentProvider>();
	public static final String DEFAULT_CONTENT_PROVIDER_NAME = "cophiContent";
	
	public static void registerDefaultContentProvider(ContentProvider p){
		registerContentProvider(DEFAULT_CONTENT_PROVIDER_NAME,p);
	}
	
	public static  void registerContentProvider(String name, ContentProvider p){
		ContentProviders.put(name, p);
	}

}
