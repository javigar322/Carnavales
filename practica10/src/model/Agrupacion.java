package model;

/**
 * 
 * @author javi clase de agrupacion
 */
public abstract class Agrupacion {
	/**
	 * string del nombre, autor, autor de la musica, autor de la letra y el tipo
	 */
	private String nombre;
	private String autor;
	private String autorMusica;
	private String autorLetras;
	private String tipo;

	abstract public String cantarPresentacion();

	abstract public String hacerTipo();

	/**
	 * 
	 * @return retorno el nombre del getter nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return el autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * 
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * 
	 * @return el autor de la musica
	 */
	public String getAutorMusica() {
		return autorMusica;
	}

	/**
	 * 
	 * @param autorMusica setter autor musica
	 */
	public void setAutorMusica(String autorMusica) {
		this.autorMusica = autorMusica;
	}

	/**
	 * 
	 * @return autor de las letras
	 */
	public String getAutorLetras() {
		return autorLetras;
	}

	/**
	 * 
	 * @param autorLetras
	 */
	public void setAutorLetras(String autorLetras) {
		this.autorLetras = autorLetras;
	}

	/**
	 * 
	 * @return tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * 
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
