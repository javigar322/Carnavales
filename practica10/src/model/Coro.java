package model;

public class Coro extends AgrupacionOficial {

	private Integer numeroBandurrias;
	private Integer númeroGuitarras;

	public Coro() {
		setNombre(getNombre());
		setTipo(getTipo());
	}

	public Integer getNumeroBandurrias() {
		return numeroBandurrias;
	}

	public void setNumeroBandurrias(Integer numeroBandurrias) {
		this.numeroBandurrias = numeroBandurrias;
	}

	public Integer getNúmeroGuitarras() {
		return númeroGuitarras;
	}

	public void setNúmeroGuitarras(Integer númeroGuitarras) {
		this.númeroGuitarras = númeroGuitarras;
	}

	

	public String cantarPresentacion() {
		return "Cantando la presentación " + getNombre();
	}

	public String hacerTipo() {
		return "La " + getNombre() + " va de " + getTipo();
	}

	public String caminitoDelFalla() {
		return "El " + getNombre() + " va caminito de la falla ";
	}
}
