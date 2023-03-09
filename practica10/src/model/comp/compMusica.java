package model.comp;

import java.util.Comparator;

import model.Agrupacion;

public class compMusica implements Comparator<Agrupacion>{
/**
 * compara dos agrupaciones por el autor de la musica
 */
	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		return o1.getAutorMusica().compareTo(o2.getAutorMusica());
	}

}
