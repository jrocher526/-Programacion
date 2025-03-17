package ejercicio4_11;

public class Libro {

	// Atributos
	String titulo;
	String autor;
	String isbn;
	int anioPulicacion;
	
	// Contructor para inicializar los atributos
	public Libro(String titulo, String autor, String isbn, int anioPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.anioPulicacion = anioPublicacion;
	}

	@Override
	public String toString() {
		return "Titulo:" + titulo + ", autor: " + autor + ", isbn: " + isbn + ", anioPulicacion: " + anioPulicacion;
		}
	
	@Override
	public boolean equals(Object obj) {
        if (this == obj) {
            return true;  // Retorna true si son el mismo
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;  // Retorna si son nulos o de otra clase
        }
        Libro otroLibro = (Libro) obj;
        return this.isbn.equals(otroLibro.isbn);  // Compara los isbn
	}
	
	// GET y SET
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo() {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor() {
		this.autor = autor;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn() {
		this.isbn = isbn;
	}
	
	public int getAnioPulicacion() {
		return anioPulicacion;
	}
	
	public void setAnioPulicacion() {
		this.anioPulicacion = anioPulicacion;
	}
}

