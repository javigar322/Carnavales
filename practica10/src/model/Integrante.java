package model;

public class Integrante {

	private static Integer numeroParticipante;
	private Integer numero;
	private String nombre;
	private String edad;
	
	public Integrante() {
		numeroParticipante++;
		setNumero(numero);
	}

	public Integer getNumero() {
		return numero;
	}

	private void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}
	
}
