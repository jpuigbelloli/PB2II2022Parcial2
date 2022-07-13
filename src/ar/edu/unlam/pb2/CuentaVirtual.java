package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.excepciones.CVUInvalidoException;

public class CuentaVirtual extends Cuenta implements Transferible {

	private String cvu;
	

	public CuentaVirtual(String cvu, String entidad, String titular) throws CVUInvalidoException {
		super(entidad, titular);
		if (cvu.length() != 23) {
			throw new CVUInvalidoException("El CBU es invalido, debe tener 23 digitos.");
		}
		this.cvu = cvu;

	}

	public String getCvu() {
		return cvu;
	}

	public void setCvu(String cvu) {
		this.cvu = cvu;
	}

	@Override
	public String getId() {
		return getCvu();
	}

}
