package model.comp;

import java.util.Comparator;

import model.Agrupacion;

public class compNombre implements Comparator<Agrupacion>{

	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
