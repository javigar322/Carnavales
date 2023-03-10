package view;

import controller.Coac;
import model.Agrupacion;

/**
 * <h2>Objeto libros</h2>
 * 
 * @author javi
 *
 */
public class GestionAgrupaciones {
	/**
	 * 
	 * muestra la gestion de agrupaciones
	 */
	public static void mostrarMenuPrincipal() {
		Util.escribir("\n");
		Util.escribir("╔═══════════════════════════════════╗");
		Util.escribir("║      GESTION DE AGRUPACIONES      ║");
		Util.escribir("╚═══════════════════════════════════╝");
		Util.escribir("  1. Gestión de Participantes.");
		Util.escribir("  2. Añadir una agrupación.");
		Util.escribir("  3. Eliminar una agrupación.");
		Util.escribir("  4. Editar datos de una agrupación.");
		Util.escribir("  5. Gestión del Concurso.");
		Util.escribir("Listado de agrupaciones:");
		Util.escribir("  6. Listar todas.");
		Util.escribir("  7. Listar Chirigotas.");
		Util.escribir("  8. Listar Coros.");
		Util.escribir("  9. Listar Cuartetos.");
		Util.escribir(" 10. Listar Comparsas.");
		Util.escribir(" 11. Listar Romanceros.");
		Util.escribir("Ordenar el listado:");
		Util.escribir(" 12. Ordenar por el nombre.");
		Util.escribir(" 13. Ordenar por el autor.");
		Util.escribir(" 14. Ordenar por el autor de música/letra.");
	}

	/**
	 * metodo que muestra la gestion del programa
	 */

	public static void gestionPrograma() {
		int opc;
		do {
			mostrarMenuPrincipal();
			opc = Util.leerInt("Opción [0 - Salir] : ");
			switch (opc) {
			case 1 -> opcIntegrantes();
			case 2 -> Principal.coac.inscribir_agrupacion(null);
			case 3 -> Principal.coac.eliminar_agrupacion(null);
			case 4 -> editar_agrupacion(null);
			case 5 -> GestionConcurso.opcConcurso();
			case 6 -> System.out.println(Principal.listar_todas());
			case 7 -> System.out.println(Principal.listar_chirigotas());
			case 8 -> System.out.println(Principal.listar_Coros());
			case 9 -> System.out.println(Principal.listar_Cuartetos());
			case 10 -> System.out.println(Principal.listar_Comparsas());
			case 11 -> System.out.println(Principal.listar_romancero());
			case 12 -> Principal.coac.ordenar_por_nombre();
			case 13 -> Principal.coac.ordenar_por_autor();
			case 14 -> Principal.coac.ordenar_por_autor_musica_letra();
			}
		} while (opc != 0);
		Principal.finDelPrograma();
	}

	/**
	 * 
	 * @param object
	 * @return edita las agrupaciones
	 */

	private static Object editar_agrupacion(Object object) {

		return null;
	}

	public static void opcIntegrantes() {

		int opc;
		do {
			GestionParticipantes.mostrarMenuIntegrantes();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {

			}
		} while (opc != 0);
	}
	/**
	 * el metodo que abre la opcion integrantes
	 */

}
