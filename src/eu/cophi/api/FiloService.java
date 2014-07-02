/**
 * 
 */
package eu.cophi.api;

/**
 * @author Angelo Del Grosso
 *
 */
public interface FiloService {
	public String command(String[] params);
	public String serviceName();
	public String[] serviceFeatures();
	public String execute(String function);
}
