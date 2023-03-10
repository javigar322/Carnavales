package model;

/**
 * 
 * @author javi clase del coro
 */
public class Coro extends AgrupacionOficial {

	private Integer numeroBandurrias;
	private Integer númeroGuitarras;

	/**
	 * constructor por defecto
	 */
	public Coro() {
		setNombre(getNombre());
		setTipo(getTipo());
	}

	/**
	 * getter numero bundurrias
	 * 
	 * @return numero bandurrias
	 */
	public Integer getNumeroBandurrias() {
		return numeroBandurrias;
	}

	/**
	 * setter numero bandurrias
	 * 
	 * @param numeroBandurrias
	 */
	public void setNumeroBandurrias(Integer numeroBandurrias) {
		this.numeroBandurrias = numeroBandurrias;
	}

	/**
	 * getter numero de guitarras
	 * 
	 * @return numero de guitarras
	 */
	public Integer getNúmeroGuitarras() {
		return númeroGuitarras;
	}

	/**
	 * setter numero de guitarras
	 * 
	 * @param númeroGuitarras
	 */
	public void setNúmeroGuitarras(Integer númeroGuitarras) {
		this.númeroGuitarras = númeroGuitarras;
	}

	/**
	 * string cantar presentacion
	 */
	public String cantarPresentacion() {
		return "Cantando la presentación " + getNombre();
	}

	/**
	 * string hacen tipo
	 */
	public String hacerTipo() {
		return "La " + getNombre() + " va de " + getTipo();
	}

	/**
	 * string caminito del falla
	 * 
	 * @return el nombre mas caminito del falla
	 */
	public String caminitoDelFalla() {
		return "El " + getNombre() + " va caminito de la falla ";
	}
}
