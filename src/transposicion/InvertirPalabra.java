package transposicion;


public class InvertirPalabra extends Transposicion{

	@Override
	public String codificar(String pTexto) {
		return darVueltaPalabra(pTexto);
	}

	@Override
	public String decodificar(String pTexto) {
		return darVueltaPalabra(pTexto);
	}
	
	private String darVueltaPalabra(String pTexto){
	    String invertido = "";
	    String[] palabras = pTexto.split("\\s+");
	      
	    for (String palabra : palabras) {
	      invertido += invertirTexto(palabra) + " ";
	    }
	    return invertido;
	  }

}
