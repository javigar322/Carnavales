package model;
/**
 * 
 * @author javi
 * <h2>interfaz callejera</h2>
 */
public interface Callejera {
/**
 * <h2>metodo amo escucha</h2>
 * @return un string que dice amo escucha
 */
	public default String amoAescucha() {
		return "Amo escucha";
	}
	
}
