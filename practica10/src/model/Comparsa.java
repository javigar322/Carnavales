package model;

/**
 * 
 * @author javi 
 * <h2>clase comparsa</h2>
 */
public class Comparsa extends AgrupacionOficial {

	private String nombre;
	private String autor;
	private String autorMusica;
	private String autorLetras;
	private String tipo;
	private Integer numeroAtrezzo;
	private Integer puntosObtenidos;

	/**
	 * <h2>constructor por defecto</h2>
	 */
	public Comparsa() {

	}

	/**
	 * @return getter del nombre
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
	 * getter del autor musica
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
	 * setter autor de las letras
	 */
	public void setAutorLetras(String autorLetras) {
		this.autorLetras = autorLetras;
	}

	/**
	 * @return tipo getter del tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo setter del tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * 
	 * @return numero atrezo getter numero atrezo
	 */
	public Integer getNumeroAtrezzo() {
		return numeroAtrezzo;
	}

	/**
	 * 
	 * @param numeroAtrezzo 
	 */
	public void setNumeroAtrezzo(Integer numeroAtrezzo) {
		this.numeroAtrezzo = numeroAtrezzo;
	}

	/**
	 * getter de los puntos obtenidos
	 */
	public Integer getPuntosObtenidos() {
		return puntosObtenidos;
	}

	/**
	 * setter de los puntos obtenidos
	 */
	public void setPuntosObtenidos(Integer puntosObtenidos) {
		this.puntosObtenidos = puntosObtenidos;
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

	/**
	 * 
	 * @return caminito del falla
	 */
	public String caminitoDelFalla() {
		return "El " + getNombre() + " va caminito de la falla ";
	}
}
