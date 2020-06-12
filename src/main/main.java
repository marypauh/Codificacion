package main;

import modelo.Cifrador;
import transposicion.InvertirPalabra;
import transposicion.InvertirMensaje;

public class main {

	public static void main(String[] args) {
		
	Cifrador palabraInversa = new InvertirPalabra();

	System.out.println(palabraInversa.codificar("Macarena"));
	System.out.println(palabraInversa.decodificar("olev"));
	
	Cifrador mensajeInverso = new InvertirMensaje();
	
	System.out.println(mensajeInverso.codificar("Hola buenos dias"));
	System.out.println(mensajeInverso.decodificar("said soneub aloH"));
	}

}
