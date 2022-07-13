package ar.edu.unlam.pb2.excepciones;

@SuppressWarnings("serial")
public class CuitInvalidoException extends Exception {

	public CuitInvalidoException() {
		super();
	}

	public CuitInvalidoException(String mensaje) {
		super(mensaje);
	}
}
