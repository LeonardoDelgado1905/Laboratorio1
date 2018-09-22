

public class Cotizacion {
    private int subTotal;
    private int descuento;

    public Cotizacion(int descuento) {
        this.descuento = descuento;
    }
    
    
    public void addLibro(Libro libro){
        subTotal += libro.getPrecio();
    }
    public int calcularTotal(){
        return subTotal * descuento;
    }
}
