package model;

/**
 * 
 * @author javi 
 * <h2>clase romancero</h2>
 */
public class Romancero extends Agrupacion implements Callejera {

	private String nombre;
	private String autor;
	private String autorMusica;
	private String autorLetras;
	private String tipo;
	private String tematicaCartelon;

	/**
	 * <h2>constructor por defecto</h2>
	 */
	public Romancero() {

	}

	/**
	 * getter del nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * setter del nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * getter del autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * setter del autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * getter del autor de la musica
	 */
	public String getAutorMusica() {
		return autorMusica;
	}

	/**
	 * setter del autor de la musica
	 */
	public void setAutorMusica(String autorMusica) {
		this.autorMusica = autorMusica;
	}

	/**
	 * getter del autor de las letras
	 */
	public String getAutorLetras() {
		return autorLetras;
	}

	/**
	 * setter del autor de las letras
	 */
	public void setAutorLetras(String autorLetras) {
		this.autorLetras = autorLetras;
	}

	/**
	 * getter del tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * setter del tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * getter de la tematica cartelon
	 * 
	 * @return tematica cartelon
	 */
	public String getTematicaCartelon() {
		return tematicaCartelon;
	}

	/**
	 * setter tematica cartelon
	 * 
	 * @param tematicaCartelon
	 */
	public void setTematicaCartelon(String tematicaCartelon) {
		this.tematicaCartelon = tematicaCartelon;
	}

	/**
	 * string cantar presentacion
	 */
	public String cantarPresentacion() {
		return "Cantando la presentación " + getNombre();
	}

	/**
	 * string hacen tipo
	 */
	public String hacerTipo() {
		return "La " + getNombre() + " va de " + getTipo();
	}

	@Override
	public String amoAescucha() {
		return "amó a escucha " + getNombre();
	}

}
