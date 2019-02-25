
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FoodChain cadenaAlimenticia =new FoodChain();
        MateriaPrima materia1 = new MateriaPrima("huevo");
        MateriaPrima materia2 = new MateriaPrima("leche");
        
        ArrayList <MateriaPrima> materias = new ArrayList<>();
        materias.add(materia1);
        materias.add(materia2);
        
        Granja granja = new Granja(materias, "Paquito´s farm", "la mejor granja del mundo");
        
        Fabrica fabrica = new Fabrica("Juano´s fabric", "fabricamos tu alimento");
    }
    
}
