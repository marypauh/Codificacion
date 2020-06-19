package modelo;

import java.util.ArrayList;

import util.Utilitario;

public abstract class Sustitucion extends Cifrador {
	public Utilitario util = new Utilitario();
	public boolean esCodificar;
	
	protected String sustituirTexto(String pTexto){
	  String textoCifrado = "";
	  String[] palabras = pTexto.split("\\s+");// para dividir el texto en las palabras  
	  for(String p: palabras){
	    textoCifrado += intercambiarPalabra(p)+" ";
	   }
		return textoCifrado;
	}
		  
	protected abstract String intercambiarPalabra(String pPalabra);

	@Override
	public boolean necesitaParams() {
		return true;
	}
	
	public String codificar(String pTexto) {
		this.esCodificar = true;
		return sustituirTexto(pTexto);
	}
	
	public String decodificar(String pTexto) {
		this.esCodificar = false;
		return sustituirTexto(pTexto);		
	}
}
