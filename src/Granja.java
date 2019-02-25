
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
public class Granja extends Eslabon {
    protected ArrayList<MateriaPrima> materias;

    public Granja(ArrayList<MateriaPrima> materias, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.materias = materias;
    }

    public boolean enviarAFabrica (ArrayList<MateriaPrima> materias, String FechaEnvio){
        System.out.println("Las materias primas se han enviado");
        return true;
    }
}
