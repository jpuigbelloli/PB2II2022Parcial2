package ar.edu.unlam.pb2.excepciones;

public class NumeroDeTarjetaInvalidoException extends Exception {

	public NumeroDeTarjetaInvalidoException() {
		super();
	}

	public NumeroDeTarjetaInvalidoException(String mensaje) {
		super(mensaje);
	}
}
