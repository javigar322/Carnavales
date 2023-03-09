package model.comp;

import java.util.Comparator;

import model.Agrupacion;

public class compAutor implements Comparator<Agrupacion>{
/**
 * compara dos agrupaciones por el autor
 */
	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		return o1.getAutor().compareTo(o2.getAutor());
	}

}
