/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author santi
 */
import java.util.*;
public class Ejecutable {
    Scanner bf = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
    public void addCotizacion(){
        int descuento = bf.nextInt();
        Cotizacion cot = new Cotizacion(descuento);
        int opcion;
        do{
            
            System.out.println("Titulo: ");
            String titulo = bf.next();
            System.out.println("Editorial: ");
            String editorial = bf.next();
            System.out.println("Categoria: ");
            String categoria = bf.next();
            System.out.println("Tipo: ");
            String tipo = bf.next();
            System.out.println("Estante: ");
            int estante = bf.nextInt();
            System.out.println("Precio: ");
            int precio = bf.nextInt();
            Libro l = new Libro(titulo, editorial, categoria, tipo, estante, precio);
            cot.addLibro(l);
            opcion = bf.nextInt();
            System.out.println("1. Agregar a la cotización");
            System.out.println("0. Salir");
        }while(opcion != 0);
        System.out.println("Valor cotizacion: " + cot.calcularTotal());
    }
}
