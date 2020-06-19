package modelo;

public class CifradorFactory {
	public Cifrador crearCifrador(String pTipo) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Cifrador cifrador = null;
		cifrador = (Cifrador)Class.forName("modelo." + pTipo).newInstance();
		return cifrador;
	}
}
