package model.comp;

import java.util.Comparator;

import model.AgrupacionOficial;

public class compPuntos implements Comparator<AgrupacionOficial>{
/**
 * compara dos agrupaciones por los puntos
 */
	@Override
	public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
		return o1.getPuntosObtenidos().compareTo(o2.getPuntosObtenidos());
	}

}
