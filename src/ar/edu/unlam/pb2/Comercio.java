package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.excepciones.CuitInvalidoException;

public class Comercio {

	private Long cuit;
	private String nombre;

	/*
	 * public Comercio(Long cuit, String nombre) throws CuitInvalidoException {
	 * super(); // OPCION 1 if (Long.toString(cuit).length() == 11 &&
	 * Long.toString(cuit).charAt(0) == 3 && Long.toString(cuit).charAt(1) == 0) {
	 * this.nombre = nombre; this.cuit = cuit; } else { throw new
	 * CuitInvalidoException("El CUIT no posee 11 digitos o en su defecto, no comienza con '30'."
	 * ); } /* OPCION 2 if (Long.toString(cuit).length() != 11 &&
	 * Long.toString(cuit).charAt(0) != 3 && Long.toString(cuit).charAt(1) != 0) {
	 * throw new
	 * CuitInvalidoException("El CUIT no posee 11 digitos o en su defecto, no comienza con '30'."
	 * ); } else { this.nombre = nombre; this.cuit = cuit; }
	 * }
	 */

	public Comercio(Long cuit, String nombre) throws CuitInvalidoException {
		super();
		long miCuit = cuit.longValue();
		String cuitEnString = String.valueOf(miCuit);
		if (cuitEnString.length() == 11 && cuitEnString.charAt(0) == '3' && cuitEnString.charAt(1) == '0') {
			this.cuit = cuit;
			this.nombre = nombre;
		} else {
			throw new CuitInvalidoException("El CUIT no posee 11 digitos o en su defecto, no comienza con '30'.");
		}
	}

	public Long getCuit() {
		return cuit;
	}

	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cuit == null) ? 0 : cuit.hashCode());
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			Comercio comercio = (Comercio) obj;
			if (comercio.getCuit().longValue() != getCuit().longValue()) {
				return false;
			}
		}
		return true;

	}

}
