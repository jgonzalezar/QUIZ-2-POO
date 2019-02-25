
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
public class Producto {
    private String nombreProducto;
    private int lote;
    private ArrayList<Granja> materia;

    public Producto(String nombreProducto, int lote, ArrayList<Granja> materia) {
        this.nombreProducto = nombreProducto;
        this.lote = lote;
        this.materia = materia;
    }

   

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }
    
    
}
