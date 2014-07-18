/**
 * 
 */
package eu.cophi.api.model.impl;

import java.util.ArrayList;
import java.util.List;

import eu.cophi.api.example.CophiWitness;
import eu.cophi.api.model.Apparatus;
import eu.cophi.api.model.Collatio;
import eu.cophi.api.model.Content;
import eu.cophi.api.model.Edition;
import eu.cophi.api.model.Granularity;
import eu.cophi.api.model.InfoUnit;
import eu.cophi.api.model.Layer;
import eu.cophi.api.model.Position;
import eu.cophi.api.model.Reading;
import eu.cophi.api.model.Recensio;
import eu.cophi.api.model.StemmaCodicum;
import eu.cophi.api.model.Tradition;
import eu.cophi.api.model.Version;
import eu.cophi.api.model.Witness;

/**
 * @author Angelo Del Grosso
 *
 */
public class BasicContent implements Content {

	/**
	 * 
	 */
	public BasicContent() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see eu.cophi.api.model.Content#getType()
	 */
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Basic Content";
	}

	@Override
	public InfoUnit getInfoUnit(Version v, Granularity g, Layer l, Position p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Recensio getRecensio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tradition getTradition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collatio getCollatio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StemmaCodicum getStemmaCodicum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Edition getEdition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Apparatus getApparatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Witness> getWitnesses() {
		// TODO Auto-generated method stub
		ArrayList<Witness> witnesses = new ArrayList<Witness>();
		witnesses.add(new CophiWitness());
		return witnesses;
	}

	@Override
	public List<Reading> getGuideErrors() {
		// TODO Auto-generated method stub
		return null;
	}

}
