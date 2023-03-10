package model;

/**
 * clase chirigotas
 */
public class Chirigota extends AgrupacionOficial implements Callejera {

	private Integer numeroCuples;
	private Integer puntosObtenidos;

	/**
	 * clase constructor con un setter de nombre y tipo por defecto
	 */
	public Chirigota() {
		setNombre(getNombre());
		setTipo(getTipo());
	}

	/**
	 * 
	 * @return el numero de cuples
	 */
	public Integer getNumeroCuples() {
		return numeroCuples;
	}

	/**
	 * 
	 * @param numeroCuples setter de numero cuples
	 */
	public void setNumeroCuples(Integer numeroCuples) {
		this.numeroCuples = numeroCuples;
	}

	/**
	 * @return devuelve los puntos obtenidos
	 */
	public Integer getPuntosObtenidos() {
		return puntosObtenidos;
	}

	/**
	 * @param puntosObtenidos
	 */
	public void setPuntosObtenidos(Integer puntosObtenidos) {
		this.puntosObtenidos = puntosObtenidos;
	}

	/**
	 * @return un string cantar presentacion
	 * 
	 */
	public String cantarPresentacion() {
		return "Cantando la presentación chirigota";
	}

	/**
	 * @return hacen tipo
	 */
	public String hacerTipo() {
		return "La " + getNombre() + " va de " + getTipo();
	}

	/**
	 * 
	 * @return caminito del falla
	 */
	public String caminitoDelFalla() {
		return "El " + getNombre() + " va caminito de la falla ";
	}

	@Override
	public String amoAescucha() {
		return "amó a escucha " + getNombre();
	}
}
