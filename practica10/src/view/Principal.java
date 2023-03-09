
package view;

import controller.Coac;
import model.Agrupacion;

/**
 * <h2>Vista principal</h2>
 * @version 1.1
 * @author javi
 *
 */

public class Principal {

	public static Coac coac = new Coac();
	
	public static void main(String[] args) {
		
		GestionAgrupaciones.gestionPrograma();

	}

	public static void finDelPrograma() {
		Util.escribir("\nFin del programa.");
		System.exit(0);
	}
	public static Agrupacion listar_Comparsas() {
		for (int i = 0; i < 10; i++) {
			return coac.listar_Comparsas(i);
		}
		return null;
	}

	public static Agrupacion listar_Cuartetos() {
		for (int i = 0; i < 10; i++) {
			return coac.listar_Cuartetos(i);
		}
		return null;
	}

	public static Agrupacion listar_Coros() {
		for (int i = 0; i < 10; i++) {
			return coac.listar_Coros(i);
		}
		return null;
	}

	public static Agrupacion listar_chirigotas() {
		for (int i = 0; i < 10; i++) {
			return coac.listar_chirigotas(i);
		}
		return null;
	}

	public static Agrupacion listar_todas() {
		for (int i = 0; i < 10; i++) {
			return coac.listar_todas(i);
		}
		return null;
	}

	public static Agrupacion listar_romancero() {
		for (int i = 0; i < 10; i++) {
			return coac.listar_romancero(i);
		}
		return null;
	}

	
}
