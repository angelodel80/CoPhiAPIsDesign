/**
 * 
 */
package eu.cophi.api.model;

import java.util.List;

/**
 * @author Angelo Del Grosso
 *
 */
public interface Content {
	 String getType();
	
	/**
	 * L'unità di base indicizzabile e analizzabile. E' vista come una quadrupla di valori.
	 * Versione: tiene conto del tempo
	 * Granularità: tiene conto dello spazio
	 * Layer: tiene conto dei livelli di analisi e di annotazione
	 * Position: tiene conto della sequenzialità
	 */
	InfoUnit getInfoUnit(Version v, Granularity g, Layer l, Position p);
	
	/**
	 * Elenco dei testimoni che tramandano per intero o in parte,, in modo diretto o indiretto, la tradizione.
	 * @return Recensio
	 * */
	Recensio getRecensio();
	
	/**
	 * La tradizione di un testo
	 * @return tradition
	 */
	Tradition getTradition();
	
	/**
	 * Confronto dei testimoni
	 * @return Collatio
	 */
	Collatio getCollatio();
	
	/**
	 * rappresentazione grafica dei rapporti genetici tra i testimoni
	 * @return StemmaCodicum
	 */
	StemmaCodicum getStemmaCodicum();
	
	
	/**
	 * L'editore ricostruisce il testo ipoteticamente più vicino al pensiero dell'autore. Le letture accolte oppure quelle congetturate costituiscono il testo dell'edizione.
	 * @return Edition
	 */
	Edition getEdition();
	
	/**
	 * L'apparato critico dal quale si evincono le lezioni alternative a quelle accolte
	 * @return Apparatus
	 */
	Apparatus getApparatus(); // forse parte dell'edizione
	
	List<Witness> getWitnesses();
	List<Reading> getGuideErrors(); // ci sarebbe il DataType Error, verificare, così come bisogna valutare la possibilie differenza di tipi delle varianti!
	
}
