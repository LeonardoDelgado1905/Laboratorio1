

public class Libro {
    private String titulo;
    private String editorial;
    private String categoria;
    private String tipo;
    private int estante;
    private int precio;

    public Libro(String titulo, String editorial, String categoria, String tipo, int estante, int precio) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.categoria = categoria;
        this.tipo = tipo;
        this.estante = estante;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEstante() {
        return estante;
    }

    public int getPrecio() {
        return precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstante(int estante) {
        this.estante = estante;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
