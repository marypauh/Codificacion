package main;

import java.util.ArrayList;

import factory.CifradorFactory;
import modelo.Cifrador;
import modelo.Cesar;
import modelo.Llave;
import modelo.Telefonico;
import modelo.TransMensaje;
import modelo.TransPalabra;
import modelo.Vigenere;
import servicio.ServicioCifrador;
import modelo.Binario;

public class main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	pruebaSustitucion();
			  }
			    
			  private static void pruebaSustitucion() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
				  
				ServicioCifrador servicio = new ServicioCifrador();
				CifradorFactory factory = new CifradorFactory();
				  
				//Cifrador cifrador = servicio.crearCifrado("Cesar");
				Cifrador cifrador = factory.crearCifrador("Cesar");
				Cifrador cifrador2 = factory.crearCifrador("Binario");

				
				pedirParams(cifrador);
				pedirParams(cifrador2);
				

				
			   /* Cifrador cifradoCesar = new Cesar();
			    Cifrador cifradoVigenere = new Vigenere();
			    Cifrador cifradoLlave = new Llave();
			    ArrayList<String> params = new ArrayList<String>();
			    //cesar
			    String fraseCesar = "tarea de encriptacion";
			    System.out.println(cifradoCesar.getListParams().get(0));
			    params.add("2");
			    cifradoCesar.setListParams(params);
			    System.out.println(cifradoCesar);
			    String fraseCodificadaCesar = cifradoCesar.codificar(fraseCesar);
			    String fraseDecodificadaCesar = cifradoCesar.decodificar(fraseCodificadaCesar);
			    fraseDecodificadaCesar = removeLastChar(fraseDecodificadaCesar);
			    
			    System.out.println("CESAR");
			    System.out.println(fraseCesar);
			    System.out.println(fraseCodificadaCesar);
			    System.out.println(fraseDecodificadaCesar);
			    System.out.println(fraseCesar.equals(fraseDecodificadaCesar));
			    System.out.println();
			    

			    String fraseVigenere = "tarea programada criptografia de datos";
			    System.out.println(cifradoVigenere.getListParams().toString());
			    params.remove(0);
			    params.add("23");
			    cifradoVigenere.setListParams(params);
			    String fraseCodificadaVigenere = cifradoVigenere.codificar(fraseVigenere);
			    String fraseDecodificadaVigenere = cifradoVigenere.decodificar(fraseCodificadaVigenere);
			    fraseDecodificadaVigenere = removeLastChar(fraseDecodificadaVigenere);
			    
			    System.out.println("VIGENERE");
			    System.out.println(fraseVigenere);
			    System.out.println(fraseCodificadaVigenere);
			    System.out.println(fraseDecodificadaVigenere);
			    System.out.println(fraseVigenere.equals(fraseDecodificadaVigenere));
			    System.out.println();

			    String fraseLlave = "tarea programada de codificacion";
			    System.out.println(cifradoLlave.getListParams().get(0));
			    params.remove(0);
			    params.add("tango");
			    cifradoLlave.setListParams(params);
			    String fraseCodificadaLlave = cifradoLlave.codificar(fraseLlave);
			    String fraseDecodificadaLLave = cifradoLlave.decodificar(fraseCodificadaLlave);
			    fraseDecodificadaLLave = removeLastChar(fraseDecodificadaLLave);
			    
			    System.out.println("LLAVE");
			    System.out.println(fraseLlave);
			    System.out.println(fraseCodificadaLlave);
			    System.out.println(fraseDecodificadaLLave);
			    System.out.println(fraseLlave.equals(fraseDecodificadaLLave));
			    System.out.println();
			  
			   Cifrador transPalabra = new TransPalabra();
			   Cifrador transFrase = new TransMensaje();
			        
			    String palabra = "esto es un secreto no lo puedo decir aserpros";
			    String palabraCodificada = transPalabra.codificar(palabra);
			    String palabraDecodificada = transPalabra.codificar(palabraCodificada);
			    palabraDecodificada = removeLastChar(palabraDecodificada);
			    
			    System.out.println("PALABRA");
			    System.out.println(palabra);
			    System.out.println(palabraCodificada);
			    System.out.println(palabraDecodificada);
			    System.out.println(palabra.equals(palabraDecodificada));
			    System.out.println();
			    

			   String frase = "Hola mi nombre es Python";
			    String fraseCodificada = transFrase.codificar(frase);
			    String fraseDecodificada = transFrase.decodificar(fraseCodificada);
			    fraseDecodificada = removeLastChar(fraseDecodificada);
			         
			    System.out.println("FRASE");
			    System.out.println(frase);
			    System.out.println(fraseCodificada);
			    System.out.println(fraseDecodificada);  
			    System.out.println(frase.equals(fraseDecodificada));
			    System.out.println();
			    
			    
			    Cifrador codificacionBinaria = new Binario();
				  
			     palabra = "tarea programada criptografia de datos zygalski henryk";
			     palabraCodificada = codificacionBinaria.codificar(palabra);
			     palabraDecodificada = codificacionBinaria.decodificar(palabraCodificada);
			    
			    System.out.println("CODIGO BINARIO");
			    System.out.println(palabra);
			    System.out.println(palabraCodificada);
			    System.out.println(palabraDecodificada); 
			    System.out.println(palabra.equals(palabraDecodificada));
			    System.out.println();
			    
			    Cifrador cifradoTelefonico = new Telefonico();

			     palabra = "tarea programada criptografia de datos zygalski henryk";
			     palabraCodificada = cifradoTelefonico.codificar(palabra);
			     palabraDecodificada = cifradoTelefonico.decodificar(palabraCodificada);	  
			    
			    System.out.println("CODIGO TELEFONICO");
			    System.out.println(palabra);
			    System.out.println(palabraCodificada);
			    System.out.println(palabraDecodificada);
			    System.out.println(palabra.equals(palabraDecodificada));
			    System.out.println();*/
				
			  }
			  
			  private static String removeLastChar(String str) {
				    return str.substring(0, str.length() - 1);
				}
			  
			  private static void pedirParams(Cifrador cifrador) {
					if (cifrador.getListParams()== null) {
					    System.out.println("Digite el texto");
						
					}else {
						ArrayList<String> parametros = new ArrayList<String>();
						for(int i = 0; cifrador.getListParams().size() > i; i++) {
						    System.out.println("Digite el " + cifrador.getListParams().get(i) );
						    // string param = sacarParametroEatson
						    //parametros.add(params)	
						}
						// cifrador.setListParams(param);
					    	
					}
			  }
			  

}

