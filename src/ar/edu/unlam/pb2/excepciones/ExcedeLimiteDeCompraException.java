package ar.edu.unlam.pb2.excepciones;

@SuppressWarnings("serial")
public class ExcedeLimiteDeCompraException extends Exception {

	public ExcedeLimiteDeCompraException() {
		super();
	}

	public ExcedeLimiteDeCompraException(String mensaje) {
		super(mensaje);
	}
}
