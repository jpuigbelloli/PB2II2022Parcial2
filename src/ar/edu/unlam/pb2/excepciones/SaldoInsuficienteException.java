package ar.edu.unlam.pb2.excepciones;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {

	public SaldoInsuficienteException() {
		super();
	}

	public SaldoInsuficienteException(String mensaje) {
		super(mensaje);
	}
}
