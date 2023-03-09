package model;

public class Chirigota extends AgrupacionOficial implements Callejera {

	
	private Integer numeroCuples;
	private Integer puntosObtenidos;

	public Chirigota() {
		setNombre(getNombre());
		setTipo(getTipo());
	}


	public Integer getNumeroCuples() {
		return numeroCuples;
	}

	public void setNumeroCuples(Integer numeroCuples) {
		this.numeroCuples = numeroCuples;
	}

	public Integer getPuntosObtenidos() {
		return puntosObtenidos;
	}

	public void setPuntosObtenidos(Integer puntosObtenidos) {
		this.puntosObtenidos = puntosObtenidos;
	}

	public String cantarPresentacion() {
		 return "Cantando la presentación chirigota" ;
	 }
	
	 public String hacerTipo() {
		 return "La " + getNombre() + " va de " + getTipo();
	 }
	 public String caminitoDelFalla() {
		 return "El " + getNombre() + " va caminito de la falla ";
	 }
	 @Override
		public String amoAescucha() {
			return "amó a escucha " + getNombre();
		}
}
