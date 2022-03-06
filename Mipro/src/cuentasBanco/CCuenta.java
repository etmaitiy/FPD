package cuentasBanco;

/**
 * @author youness etmaiti
 * @version 1.0.1
 *@since 01-03-2022
 */
public class CCuenta {

	/**
	 * Atributo que almacena titular de la cuenta bancaria
	 */
	private String nombre;
	/**
	 * Atributo que almacena nombre de la cuenta bancaria
	 */
	private String cuenta;
	/**
	 * Atributo que almacena saldo de la cuenta bancaria
	 */
	private double saldo;
	/**
	 * Atributo que almacena tipo de interés de la cuenta bancaria
	 */
	private double tipoInterés;

	public CCuenta() {
	}

	/**
	 * Defini los datos de la cuenta bancaria.
	 * @param nom Parametro que contiene el valor del nombre del titular de la cuenta bancaria.
	 * @param cue Parametro que contiene el valor del nombre de la cuenta bancaria.
	 * @param sal Parametro que contiene el valor del saldo de la cuenta bancaria.
	 * @param tipo Parametro que contiene el valor tipo de interés de la cuenta bancaria.
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}

	/** 
	 * @return devuelve saldo de la cuenta bancaria.  
	 */
	public double estado() {
		return getSaldo();
	}

	/**
	 * Defini las condiciones de ingreasr dinero en la cuenta bancaria.
	 * @param cantidad Parametro que contiene el valor del saldo a ingresar en la cuenta bancaria.
	 * @throws Exception Parámetro que contiene el valor de una excepcion, no se puede ingrear una cantidad negativa.
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}

	/**
	 * Defini las condiciones de retirar dinero de la cuenta bancaria.
	 * @param cantidad Parametro que contiene el valor del saldo a retirar de la cuenta bancaria.
	 * @throws Exception Parámetro que contiene el valor de una excepcion, no se puede retirar una cantidad negativa o no hay sufeciente saldo.
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
