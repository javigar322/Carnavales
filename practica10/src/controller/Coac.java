package controller;

/**
 * <h2>Controlador</h2>
 * @author javi
 */

import java.util.Arrays;

import model.*;
import model.comp.*;

public class Coac {

	private Agrupacion[] coac;

	public Coac() {
		Agrupacion[] coac = new Agrupacion[10];
	}

	/**
	 * 
	 * @param agrupacion
	 * @return crea el array de la agrupacion
	 */

	public boolean inscribir_agrupacion(Agrupacion agrupacion) {
		boolean added = false;
		for (int i = 0; i < coac.length; i++) {
			if (coac[i] == null) {
				coac[i] = agrupacion;
				added = true;
				break;
			}
		}
		return added;

	}

	/**
	 * 
	 * @param agrupacion
	 * @return metodo que añade agrupaciones
	 */

	public boolean eliminar_agrupacion(Agrupacion agrupacion) {
		boolean deleted = false;
		for (int i = 0; i < coac.length; i++) {
			if (coac[i] != null && coac[i] == agrupacion) {
				coac[i] = agrupacion;
				deleted = true;
				break;
			}
		}
		return deleted;
	}

	/**
	 * 
	 * @param i
	 * @return elimina agrupaciones
	 */

	public Agrupacion listar_Comparsas(int i) {
		if (coac[i] instanceof Comparsa) {
			return coac[i];

		}
		return null;

	}

	/**
	 * 
	 * @param i
	 * @return lista las comparsas
	 */

	public Agrupacion listar_Cuartetos(int i) {
		if (coac[i] instanceof Cuarteto) {
			return coac[i];

		}
		return null;

	}

	/**
	 * 
	 * @param i
	 * @return lista los cuartetos
	 */

	public Agrupacion listar_Coros(int i) {
		if (coac[i] instanceof Coro) {
			return coac[i];

		}
		return null;

	}

	/**
	 * 
	 * @param i
	 * @return lista los coros
	 */

	public Agrupacion listar_chirigotas(int i) {
		if (coac[i] instanceof Chirigota) {
			return coac[i];

		}
		return null;

	}

	/**
	 * 
	 * @param i
	 * @return lista las chirigotas
	 */
	public Agrupacion listar_todas(int i) {
		return coac[i];
	}

	/**
	 * 
	 * @param i
	 * @return lista todo
	 */
	public Agrupacion listar_romancero(int i) {
		if (coac[i] instanceof Romancero) {
			return coac[i];

		}
		return null;

	}

	/**
	 * 
	 * @param i
	 * @return lista los romanceros
	 */
	public void ordenar_por_nombre() {
		Arrays.sort(coac, new compNombre());
	}

	/**
	 * @return ordena por nombre
	 */

	public void ordenar_por_autor() {
		Arrays.sort(coac, new compAutor());
	}

	/**
	 * @return ordena por autor
	 */

	public void ordenar_por_autor_musica_letra() {
		Arrays.sort(coac, new compMusica());
	}

	/**
	 * @return ordena por musica
	 */

	public void ordenar_por_puntos() {
		// Arrays.sort(coac, compPuntos());

	}

	/**
	 * @return ordena por puntos
	 */

	public void asignarPuntos(int i) {
		if (coac[i] instanceof AgrupacionOficial) {
			((AgrupacionOficial) coac[i]).setPuntosObtenidos(((AgrupacionOficial) coac[i]).getPuntosObtenidos() + 1);
		}
	}
	/**
	 * @param i
	 * @return asigna puntos
	 */

}
