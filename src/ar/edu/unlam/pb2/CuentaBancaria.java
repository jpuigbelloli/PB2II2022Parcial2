package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.excepciones.CBUInvalidoException;

public class CuentaBancaria extends Cuenta implements Transferible {

	private String cbu;

	public CuentaBancaria(String cbu, String entidad, String titular) throws CBUInvalidoException {
		super(entidad, titular);
		if (cbu.length() != 20) {
			throw new CBUInvalidoException("El CBU es invalido, debe tener 20 digitos.");
		}
		this.cbu = cbu;
	}

	public String getCbu() {
		return cbu;
	}

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}

	@Override
	public String getId() {
		return getCbu();
	}

}
