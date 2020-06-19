package modelo;

import java.util.ArrayList;

public abstract class Transposicion extends Cifrador {
	@Override
	public boolean necesitaParams() {
		return false;
	}

	@Override
	public ArrayList<String> getListParams() {
		return null;
	}

	@Override
	public void setListParams(ArrayList<String> pParams) {		
	}
	
	@Override
	public String codificar(String pTexto) {
		return invertir(pTexto);
	}

	@Override
	public String decodificar(String pTexto) {
		return invertir(pTexto);
	}
	
	public abstract String invertir(String pTexto);
	
	public String invertirUnTexto(String texto){
		String textoInvertido = "";
		for (int i = texto.length()-1; i >= 0; i--){
		  textoInvertido += texto.charAt(i);
		}
		 return textoInvertido;
		}
}
