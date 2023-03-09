package model;

public class Comparsa extends AgrupacionOficial {

	private String nombre;
	private String autor;
	private String autorMusica;
	private String autorLetras;
	private String tipo;
	private Integer numeroAtrezzo;
	private Integer puntosObtenidos;

	public Comparsa() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutorMusica() {
		return autorMusica;
	}

	public void setAutorMusica(String autorMusica) {
		this.autorMusica = autorMusica;
	}

	public String getAutorLetras() {
		return autorLetras;
	}

	public void setAutorLetras(String autorLetras) {
		this.autorLetras = autorLetras;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getNumeroAtrezzo() {
		return numeroAtrezzo;
	}

	public void setNumeroAtrezzo(Integer numeroAtrezzo) {
		this.numeroAtrezzo = numeroAtrezzo;
	}

	public Integer getPuntosObtenidos() {
		return puntosObtenidos;
	}

	public void setPuntosObtenidos(Integer puntosObtenidos) {
		this.puntosObtenidos = puntosObtenidos;
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
