package conjuntos;
import java.util.Iterator;
/**
 *
 * @author tania
 */
public class Conjuntos {

    public static void main(String[] args) {
        ConjuntoADT<Integer> c1 = new ConjuntoA();
        ConjuntoADT<Rectangulo> c2 = new ConjuntoA(); 
        ConjuntoADT<Integer> c3 = new ConjuntoA();
        ConjuntoADT<Integer> c4 = new ConjuntoA();
        
        c1.agrega(2);
        c1.agrega(8);
        c1.agrega(7);
        c1.agrega(1);
        /*System.out.println("Luego de insertar numeros \n" + c1);
        c1.agrega(2);
        System.out.println("Luego de intentar repetido \n" + c1);*/
        /*c2.agrega(new Rectangulo(4, 2));
        c2.agrega(new Rectangulo(6, 2));
        c2.agrega(new Rectangulo(5.2, 3));
        c2.agrega(new Rectangulo(4, 3.8));*/
        //System.out.println("Conjunto de rectangulos \n" + c2.toString());
        
        //ejemplo uso iterador
        /*double suma = 0, prom;
        int cont = 0;
        Rectangulo r;
        Iterator<Rectangulo> it = c2.iterator();
        while(it.hasNext()){
            suma += it.next().calculaArea();
            cont++;
        }
        prom = suma / cont;
        System.out.println("Promedio: " + suma);
        //union
        System.out.println("Prueba union con un conjunto vacio: \n" + c1.union(c3));*/
        c3.agrega(2);
        c3.agrega(81);
        c3.agrega(77);
        c3.agrega(10);
        c3.agrega(1);
        //System.out.println("Union con otro conjunto: \n" + c1.union(c3));
        //interseccion
        //System.out.println("Interseccion con otro conjunto: \n" + c1.interseccion(c3));
        //elimina
        /*System.out.println(c3.elimina(3));
        System.out.println(c3.elimina(81));
        System.out.println(c3);*/
        System.out.println("Diferencia de conjuntos \n" + c1.diferencia(c3));
        c4.agrega(2);
        c4.agrega(8);
        c4.agrega(7);
        c4.agrega(1);
        
        
        /*System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c1));
        System.out.println(c1.equals(c4));
        System.out.println(MetEst.equals(c1, c3));
        System.out.println(MetEst.equals(c1, c1));
        System.out.println(MetEst.equals(c4, c1));*/
    }
    
}
