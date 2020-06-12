package transposicion;

import modelo.Cifrador;

public abstract class Transposicion implements Cifrador{
	
	protected String invertirTexto(String pTexto) {
		String invertido = "";
		
	    for (int i = pTexto.length()-1; i >= 0; i--){
	      invertido += pTexto.charAt(i);
	    }
	 return invertido;
}
			
}

