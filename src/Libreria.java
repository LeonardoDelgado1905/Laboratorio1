
import java.util.ArrayList;

public class Libreria {
    
    private ArrayList <Estanteria> coleccionEstanterias = new ArrayList<>();
    
    public void addEstanteria(Estanteria estanteria){
        coleccionEstanterias.add(estanteria);
    }
    
    public static void main(String[] args) {
        
    }
 
    
    public Libro buscarXtitulo(String categoria, String tipo, String titulo){
        Libro l = new Libro(null, null, null, null, 0, 0);
        for(int i = 0; i < coleccionEstanterias.size(); i++){
            Estanteria est = coleccionEstanterias.get(i);
            if(est.getCategoria() == categoria && est.getTipo() == tipo){
                for(int j = 0; j < est.getColeccionLibros().size(); j++){
                    Libro lib = est.getColeccionLibros().get(j);
                    if(lib.getTitulo() == titulo){
                        l = lib;
                    }
                }
            }
        }
        return l;
    }
    
    public Libro buscarXautor(String categoria, String tipo, String autor){
        Libro l = new Libro(null, null, null, null, 0, 0);
        for(int i = 0; i < coleccionEstanterias.size(); i++){
            Estanteria est = coleccionEstanterias.get(i);
            if(est.getCategoria() == categoria && est.getTipo() == tipo){
                for(int j = 0; j < est.getColeccionLibros().size(); j++){
                    Libro lib = est.getColeccionLibros().get(j);
                    if(lib.getTitulo() == autor){
                        l = lib;
                    }
                }
            }
        }
        return l;
    }    
}
