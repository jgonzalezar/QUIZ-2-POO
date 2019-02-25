
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgonzalezar
 */
public class Cliente {
    private String nombeCliente;
    private ArrayList<Tienda>productosComprados;

    public Cliente(String nombeCliente, ArrayList<Tienda> productosComprados) {
        this.nombeCliente = nombeCliente;
        this.productosComprados = productosComprados;
    }

    public String getNombeCliente() {
        return nombeCliente;
    }

    public void setNombeCliente(String nombeCliente) {
        this.nombeCliente = nombeCliente;
    }

    public ArrayList<Tienda> getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(ArrayList<Tienda> productosComprados) {
        this.productosComprados = productosComprados;
    }
    
    
}
