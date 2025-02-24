package ColaEE;
import java.util.ArrayList;
/**Tania Ariadna Dominguez Palma
 *03/05/2022
 * Clase que prueba la clase Cola
 */
public class PruebaColas {
    
    public static void main(String[] args) {
        Cola<Integer> col = new Cola();
        Cola<Integer> col1 = new Cola();
        Cola<String> c = new Cola();
        ArrayList<Integer> list = new ArrayList();
        
        col.agrega(45);
        col.agrega(50);
        col.agrega(74);
        col.agrega(58);
        col.agrega(100);
        col.agrega(562);
        col1.agrega(45);
        col1.agrega(50);
        col1.agrega(74);
        col1.agrega(58);
        col1.agrega(100);
        col1.agrega(562);
        c.agrega("L");
        c.agrega("A");
        c.agrega("P");
        c.agrega("M");
        //System.out.println(col.consultaPrimero());
        //System.out.println(col.consultaFinal());
        //System.out.println(col.cuentaElementos());
        //System.out.println(col.quita());
        //System.out.println(col);
        /*list = col.multiQuita(7);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println(col);*/
        System.out.println(col.equals(c));
        System.out.println(col.equals(col));
        System.out.println(col1.equals(col));
    }
}
