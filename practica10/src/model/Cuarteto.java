package model;

/**
 * 
 * @author javi clase cuarteto
 */
public class Cuarteto extends AgrupacionOficial implements Callejera {

	private Integer numeroMiembros;

	/**
	 * clase constructor por defecto
	 */
	public Cuarteto() {
		setNombre(getNombre());
		setTipo(getTipo());
	}

	/**
	 * getter numero de miembros
	 * 
	 * @return numero de miembros
	 */
	public Integer getNumeroMiembros() {
		return numeroMiembros;
	}

	/**
	 * 
	 * setter numero de miembros
	 * 
	 * @param numeroMiembros
	 */
	public void setNumeroMiembros(Integer numeroMiembros) {
		this.numeroMiembros = numeroMiembros;
	}

	/**
	 * string cantar presentacion
	 */
	public String cantarPresentacion() {
		return "Cantando la presentación " + getNombre();
	}

	/**
	 * string de hacen tipo
	 */
	public String hacerTipo() {
		return "El " + getNombre() + " va de " + getTipo();
	}

	/**
	 * string de caminito del falla
	 * 
	 * @return el nombre mas caminito del falla
	 */
	public String caminitoDelFalla() {
		return "El " + getNombre() + " va caminito de la falla ";
	}

	@Override
	public String amoAescucha() {
		return "amó a escucha " + getNombre();
	}
}
