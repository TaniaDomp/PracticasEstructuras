package cola_01;

import java.util.ArrayList;

/**Tania Ariadna Dominguez Palma
 * 19/04/2022
 * Clase que prueba la clase ColaA
 */
public class Cola_01 {
    
    public static void main(String[] args) {
        ColaADT<String> col1 = new ColaA();
        ColaADT<String> col2 = new ColaA();
        ColaADT<String> col3 = new ColaA();
        ColaADT<String> col4 = new ColaA();
        ColaADT<String> col5 = new ColaA(3);
        ColaADT<String> col6 = new ColaA();
        ArrayList<String> lista = new ArrayList();
        
        col1.agrega("A");
        col1.agrega("A");
        col1.agrega("A");
        col1.agrega("B");
        col1.agrega("B");
        col1.agrega("C");
        col1.agrega("D");
        col1.agrega("D");
        col1.agrega("D");
        /*col3.agrega("A");
        col3.agrega("B");
        col3.agrega("C");
        col3.agrega("D");
        col2.agrega("A");
        col2.agrega("J");
        col2.agrega("C");
        col2.agrega("D");
        col4.agrega("1");
        col4.agrega("1");
        col4.agrega("2");
        col4.agrega("3");
        col4.agrega("3");
        col4.agrega("4");
        col4.agrega("4");
        col4.agrega("4");
        col1.quita();
        col1.agrega("J");*/
        col5.agrega("M");
        col5.agrega("A");
        col5.agrega("J");
        col5.quita();
        col5.agrega("M");
        /*col6.agrega("A");
        col6.agrega("A");
        col6.agrega("B");
        col6.agrega("A");
        col6.agrega("F");
        col6.agrega("G");
        col6.agrega("A");*/
        /*System.out.println(col1.equals(col2));
        System.out.println(col1.equals(col1));
        System.out.println(col3.equals(col1));
        System.out.println(MetodosExt.equals(col1, col2));
        System.out.println(MetodosExt.equals(col1, col3));
        System.out.println(MetodosExt.equals(col1, col1));*/
        /*System.out.println(col1.toString());
        col1 = MetodosExt.invierte(col1);
        System.out.println(col1.toString());*/
        /*System.out.println(col4.toString());
        col4 = MetodosExt.invierteEst(col4);
        System.out.println(col4.toString());*/
        /*System.out.println(col4.toString());
        MetodosExt.quitaRepetidos(col4);
        System.out.println(col4.toString());*/
        /*System.out.println(col1.toString());
        MetodosExt.quitaRepetidos(col1);
        System.out.println(col1.toString());*/
        //System.out.println(col1.toString());
        //System.out.println(col5.toString());
        /*System.out.println(col6.toString());
        MetodosExt.quitaOcurrencias(col6, "A");
        System.out.println(col6.toString());
        MetodosExt.quitaOcuRec(col6, "A");
        System.out.println(col6.toString());*/
        //consulta final 
        /*System.out.println(col1.consultaFinal());
        System.out.println(col5.consultaFinal());*/
        //cuenta elementos
        /*System.out.println(col1.cuentaElementos());
        System.out.println(col5.cuentaElementos());*/
        lista = col1.multiQuita(5);
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        //System.out.println("\n" + col1.toString());
        System.out.println();
        lista = col1.multiQuita(11);
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
    
}
