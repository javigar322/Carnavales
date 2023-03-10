package model;
/**
 * 
 * @author javi
 * <h2>clase de agrupaciones oficiales</h2>
 */
public abstract class AgrupacionOficial extends Agrupacion {

	private Integer puntosObtenidos;
	private Integrante integrante[];
	/**
	 * <h2>metodo constructor por defecto
	 * crea un array con 10 integrantes</h2>
	 */
	public AgrupacionOficial () {
		integrante = new Integrante[10];
	}
	/**
	 * 
	 * @param i de integrante
	 * @return un boolean por insertar el integrante
	 */
	public boolean insertarIntegrante(Integrante i) {
		return false;
		
	}
	/**
	 * 
	 * @param i
	 * @return un boolean por eliminar el integrante
	 */
	public boolean eliminarIntegrante(Integrante i) {
		return false;
	}
/**
 * 
 * @return los puntos obtenidos
 */
	public Integer getPuntosObtenidos() {
		return puntosObtenidos;
	}
/**
 * 
 * @param puntosObtenidos setter de puntos obtenidos
 */
	public void setPuntosObtenidos(Integer puntosObtenidos) {
		this.puntosObtenidos = puntosObtenidos;
	}

	
	
}
