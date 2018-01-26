package añadirlibrerias;

import com.otros.milibreria.MisMetodos;
import com.juan.dialogos.Devolver;
import com.juan.dialogos.Introducir;
/**
 *
 * @author Arturo
 */
public class AñadirLibrerias{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        System.out.println(MisMetodos.unMetodo(77));
        Devolver.mostrarFloat(7.7f);
        Devolver.mostrarInt(8);
        Introducir.introducirNombre("Dame tu nombre");
    }
}
