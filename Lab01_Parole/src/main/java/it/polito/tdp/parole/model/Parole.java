package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	TreeMap<String,String> words;
		
	public Parole() {
		words= new TreeMap<String,String>();
	}
	
	public void addParola(String p) {
		//TODO
		if(p!= null) {
			words.put(p,p);
		}
	}
	
	public List<String> getElenco() {
		if(words.size()!=0) {
			LinkedList<String> alfa= new LinkedList<String>(words.keySet());
			return alfa;
		}
		return null;
	}
	
	public void reset() {
		words.clear();
	}

}
