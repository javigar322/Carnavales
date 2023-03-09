package model;

public class Cuarteto extends AgrupacionOficial implements Callejera{

	private Integer numeroMiembros;


	public Cuarteto() {
		setNombre(getNombre());
		setTipo(getTipo());
	}

	

	public Integer getNumeroMiembros() {
		return numeroMiembros;
	}

	public void setNumeroMiembros(Integer numeroMiembros) {
		this.numeroMiembros = numeroMiembros;
	}


	public String cantarPresentacion() {
		 return "Cantando la presentación " + getNombre();
	 }
	
	 public String hacerTipo() {
		 return "El " + getNombre() + " va de " + getTipo();
	 }
	
	 public String caminitoDelFalla() {
		 return "El " + getNombre() + " va caminito de la falla ";
	 }
	 @Override
		public String amoAescucha() {
			return "amó a escucha " + getNombre();
		}
}
