package model;

public abstract class AgrupacionOficial extends Agrupacion {

	private Integer puntosObtenidos;
	private Integrante integrante[];
	
	public AgrupacionOficial () {
		integrante = new Integrante[10];
	}
	
	public boolean insertarIntegrante(Integrante i) {
		return false;
		
	}
	public boolean eliminarIntegrante(Integrante i) {
		return false;
	}

	public Integer getPuntosObtenidos() {
		return puntosObtenidos;
	}

	public void setPuntosObtenidos(Integer puntosObtenidos) {
		this.puntosObtenidos = puntosObtenidos;
	}

	
	
}
