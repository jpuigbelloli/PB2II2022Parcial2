package ar.edu.unlam.pb2.excepciones;

@SuppressWarnings("serial")
public class CVUInvalidoException extends Exception {

	public CVUInvalidoException() {
		super();
	}

	public CVUInvalidoException(String mensaje) {
		super(mensaje);
	}
}
