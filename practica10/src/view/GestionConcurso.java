package view;

import controller.Coac;
/**
 *  <h2> clase de metodos utiles </h2>
 * @author javi
 *
 */
public class GestionConcurso {

	public static void mostrarMenuConcurso() {
		Util.escribir("\n");
		Util.escribir("┌──────────────────────┐");
		Util.escribir("│ GESTION DEL CONCURSO │");
		Util.escribir("└──────────────────────┘");
		Util.escribir("Concurso:");
		Util.escribir("  1. Va camino del Falla.");
		Util.escribir("  2. Hacen el Tipo.");
		Util.escribir("  3. Canta la Presentación.");
		Util.escribir("  4. Asignar puntos.");
		Util.escribir("Listado de agrupaciones participantes:");
		Util.escribir("  5. Listar todos.");
		Util.escribir("  6. Listar Chirigotas.");
		Util.escribir("  7. Listar Coros.");
		Util.escribir("  8. Listar Cuartetos.");
		Util.escribir("  9. Listar Comparsas.");
		Util.escribir("Ordenación del listado:");
		Util.escribir(" 10. Ordenar por puntos.");
		Util.escribir(" 11. Ordenar por el nombre.");
		Util.escribir(" 12. Ordenar por el autor.");
		Util.escribir(" 13. Ordenar por autor de música/letra.");
	}

	public static void opcConcurso() {
		int opc;
		do {
			mostrarMenuConcurso();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> caminoFalla(Principal.coac);
			case 2 -> hacenTipo(null);
			case 3 -> cantan(null);
			case 4 -> asignarPuntos(null);
			case 5 -> System.out.println(Principal.listar_todas());
			case 6 -> System.out.println(Principal.listar_chirigotas());
			case 7 -> System.out.println(Principal.listar_chirigotas());
			case 8 -> System.out.println(Principal.listar_Cuartetos());
			case 9 -> System.out.println(Principal.listar_Comparsas());
			case 10 -> Principal.coac.ordenar_por_puntos();
			case 11 -> Principal.coac.ordenar_por_nombre();
			case 12 -> Principal.coac.ordenar_por_autor();
			case 13 -> Principal.coac.ordenar_por_autor_musica_letra();
			}
		} while (opc != 0);
	}

	private static Object asignarPuntos(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object cantan(Object object) {
		Principal.coac.asignarPuntos(10);
		return null;
	}

	private static Object hacenTipo(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object caminoFalla(Coac coac) {
		// TODO Auto-generated method stub
		return null;
	}



}
