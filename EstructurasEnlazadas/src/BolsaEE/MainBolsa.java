package BolsaEE;
import estructurasenlazadas.Nodo;
import java.util.Iterator;
import java.util.NoSuchElementException;
/**Tania Ariadna Dominguez Palma
 *08/06/2022
 * Clase que describe una Bolsa
 */
public class MainBolsa {
    
    public static int sumaEnteros(Nodo primero){
        int suma = 0;
        Nodo actual = primero;
        
        while(actual != null){
            if(actual.getDato().getClass().getSimpleName().equals("Integer")){
                suma += (Integer)actual.getDato();
            }
            actual = actual.getDireccion();
        }
        if(suma == 0){
            throw new NoSuchElementException();
        }
        return suma;
    }
    
    public static void main(String[] args) {
        Bolsa<Integer> b1 = new Bolsa();
        /*Bolsa<Integer> b2 = new Bolsa();
        Bolsa<Integer> b3 = new Bolsa();
        Iterator<Integer> it;
        int cont = 0;*/
        
        b1.agrega(1);
        b1.agrega(1);
        b1.agrega(2);
        b1.agrega(3);
        b1.agrega(1);
        b1.agrega(4);
        /*b2.agrega(5);
        b2.agrega(6);*/
        //System.out.println(b1);
        //System.out.println(b1.getCantidad());
        /*it = b1.iterator();
        while(it.hasNext()){
            cont++;
            it.next();
        }
        System.out.println(cont);*/
        //System.out.println(b1.contiene(3, 1));
        b1.quita(2);
        System.out.println(b1);
        //System.out.println(b3.junta(b2));
        /*Nodo n1 = new Nodo("L");
        Nodo n2 = new Nodo("P");
        Nodo n3 = new Nodo("M");
        n1.setDireccion(n2);
        n2.setDireccion(n3);
        System.out.println(sumaEnteros(n1));*/
    }
}
