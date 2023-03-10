package model;

/**
 * 
 * @author javi 
 * <h2>clase cuarteto</h2>
 */
public class Cuarteto extends AgrupacionOficial implements Callejera {

	private Integer numeroMiembros;

	/**
	 * <h2>clase constructor por defecto</h2>
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
