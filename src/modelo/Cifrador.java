package modelo;

import java.util.ArrayList;

public abstract class Cifrador {
	public abstract String codificar(String pTexto);
	public abstract String decodificar(String pTexto);
	public abstract boolean necesitaParams();
	public abstract ArrayList<String> getListParams();
	public abstract void setListParams(ArrayList<String> pParams);
}
