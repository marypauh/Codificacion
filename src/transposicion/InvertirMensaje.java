package transposicion;

public class InvertirMensaje extends Transposicion{


	@Override
	public String codificar(String pTexto) {
		return darVueltaMensaje(pTexto);
	}

	@Override
	public String decodificar(String pTexto) {
		return darVueltaMensaje(pTexto);
	}
	
	private String darVueltaMensaje(String pMensaje){
	    String mensajeInvertido = "";
	    String[] palabras = pMensaje.split("\\s+");
	      
	    for(int i = palabras.length-1; i >= 0; i--){
	      mensajeInvertido += invertirTexto(palabras[i])+" ";
	    }
	    return mensajeInvertido;
	  }

}
