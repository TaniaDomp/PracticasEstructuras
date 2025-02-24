package listas;
import java.util.Iterator;
/**Tania Ariadna Dominguez Palma
 *03/05/2022
 * Clase que prueba la clase ListaOrdenada
 */
public class Listas {

    public static void main(String[] args) {
        ListaOrdenada<Integer> l1 = new ListaOrdenada();
        ListaOrdenada<Integer> l2 = new ListaOrdenada();
        ListaOrdenada<String> l3 = new ListaOrdenada();
        int suma = 0;
        
        //CP1: Lista vacia
        //System.out.println("\n lista vacia: " + l1);
        //CP2: se agregan algunos elementos
        //l1.agrega(85);
        l1.agrega(23);
        //System.out.println("Lista 2 elementos" + l1);
        //CP3: agrega al final
        //l1.agrega(100);
        //System.out.println("Lista 3 elementos" + l1);
        //CP4: agrega posicion intermeida
        l1.agrega(49);
        //System.out.println("Lista 4 elementos" + l1);
        //CP4: agrega posicion intermeida
        l1.agrega(85);
        //System.out.println("Lista 5 elementos" + l1);
        /*System.out.println(l1.quitaPrimero());
        System.out.println(l1.quitaUltimo());*/
        /*System.out.println(l1.quita(85));
        System.out.println(l1);*/
        /*for(Integer num: l1){
            suma += num;
        }
        System.out.println("\nSuma de elementosx= de la lista " + suma);
        
        Iterator<Integer> it = l1.iterator();
        boolean encontro = false;
        while(it.hasNext() && !encontro){
            encontro = it.next() == 47;
        }
        if(encontro){
            System.out.println("Está");
        }
        else{
            System.out.println("no está");
        }*/
        //System.out.println(l1);
        /*System.out.println(l1.contiene(102));
        System.out.println(l1.contiene(85));
        System.out.println(l1.contiene(120));*/
        /*System.out.println(l1.quita(101));
        System.out.println(l1.quita(100));
        System.out.println(l1.quita(85));
        System.out.println(l1);*/
        l2.agrega(23);
        l2.agrega(49);
        l2.agrega(85);
        l2.agrega(100);
        l2.agrega(88);
        l3.agrega("M");
        l3.agrega("A");
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l1));
        System.out.println(l1.equals(l3));
        /*System.out.println(l1.equalsRer(l2));
        System.out.println(l1.equalsRer(l1));
        System.out.println(l1.equalsRer(l3));*/
    }
    
}
