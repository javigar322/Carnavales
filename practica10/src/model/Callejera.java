package model;
/**
 * 
 * @author javi
 * interfaz callejera
 */
public interface Callejera {
/**
 * metodo amo escucha
 * @return un string que dice amo escucha
 */
	public default String amoAescucha() {
		return "Amo escucha";
	}
	
}
