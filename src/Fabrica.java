
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgonzalezar
 */
public class Fabrica extends Eslabon{
    
    protected String fechaAdquiere;
    protected ArrayList<Granja> materiaAdquirida;
    protected ArrayList<String> productoCreado;

    public Fabrica(String nombre, String descripcion) {
        super(nombre, descripcion);
        
    }

    public String getFechaAdquiere() {
        return fechaAdquiere;
    }

    public void setFechaAdquiere(String fechaAdquiere) {
        this.fechaAdquiere = fechaAdquiere;
    }

    public ArrayList<Granja> getMateriaAdquirida() {
        return materiaAdquirida;
    }

    public void setMateriaAdquirida(ArrayList<Granja> materiaAdquirida) {
        this.materiaAdquirida = materiaAdquirida;
    }

    public ArrayList<String> getProductoCreado() {
        return productoCreado;
    }

    public void setProductoCreado(ArrayList<String> productoCreado) {
        this.productoCreado = productoCreado;
    }
    
    
    
    
    public void hacerProducto (String nombreproducto, String fechaAdquiere, ArrayList<Granja>materiaAdquirida, int lote){
        //productoCreado =
          
        Producto producto = new Producto(nombreproducto, lote, materiaAdquirida);
        
    }
    
    public boolean enviarADistribuir(String fechaEnvio){
        System.out.println("El o los productos han sido enviados");
        return true;
    }
}
