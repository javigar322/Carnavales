package model;

/**
 * 
 * @author javi clase integrante
 */
public class Integrante {

	private static Integer numeroParticipante;
	private Integer numero;
	private String nombre;
	private String edad;

	/**
	 * constructor por defecto
	 */
	public Integrante() {
		numeroParticipante++;
		setNumero(numero);
	}

	/**
	 * getter del numero
	 * 
	 * @return numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * setter del numero
	 * 
	 * @param numero
	 */
	private void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * getter del nombre
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * setter del nombre
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * getter de la edad
	 * 
	 * @return edad
	 */
	public String getEdad() {
		return edad;
	}

	/**
	 * setter de la edad
	 * 
	 * @param edad
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}

}
