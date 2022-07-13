package ar.edu.unlam.pb2.excepciones;

@SuppressWarnings("serial")
public class CBUInvalidoException extends Exception {

	public CBUInvalidoException() {
		super();
	}

	public CBUInvalidoException(String mensaje) {
		super(mensaje);
	}
}
