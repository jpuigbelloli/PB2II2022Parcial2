package ar.edu.unlam.pb2.excepciones;

@SuppressWarnings("serial")
public class NoCoincideTitularException extends Exception {

	public NoCoincideTitularException() {
		super();
	}

	public NoCoincideTitularException(String mensaje) {
		super(mensaje);
	}
}
