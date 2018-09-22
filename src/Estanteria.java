
import java.util.*;



public class Estanteria {
    private String categoria;
    private String tipo;
    private boolean lleno;
    private ArrayList <Libro> coleccionLibros;

    public Estanteria(String categoria, String tipo, boolean lleno) {
        this.categoria = categoria;
        this.tipo = tipo;
        this.lleno = lleno;
        this.coleccionLibros = new ArrayList <>();
    }
    
    public void addColeccionLibros(Libro libro) {
        coleccionLibros.add(libro);
    }
    
    public String getCategoria() {
        return categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getLleno() {
        return lleno;
    }

    public ArrayList<Libro> getColeccionLibros() {
        return coleccionLibros;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }
    
}
