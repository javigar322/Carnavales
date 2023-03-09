package model;

public class Romancero extends Agrupacion implements Callejera{

	private String nombre;
	private String autor;
	private String autorMusica;
	private String autorLetras;
	private String tipo;
	private String tematicaCartelon;

	public Romancero() {

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

	public String getTematicaCartelon() {
		return tematicaCartelon;
	}

	public void setTematicaCartelon(String tematicaCartelon) {
		this.tematicaCartelon = tematicaCartelon;
	}

	 public String cantarPresentacion() {
		 return "Cantando la presentación " + getNombre();
	 }
	
	 public String hacerTipo() {
		 return "La " + getNombre() + " va de " + getTipo();
	 }

	@Override
	public String amoAescucha() {
		return "amó a escucha " + getNombre();
	}
	 
	 
	 
}
