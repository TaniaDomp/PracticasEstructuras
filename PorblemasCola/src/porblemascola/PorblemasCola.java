package porblemascola;
import cola_01.ColaA;
import cola_01.ColaADT;
/**
 *
 * @author tania
 */
public class PorblemasCola {

    public static void main(String[] args) {
        Persona p1 = new Persona("Yoli", "001", 15);
        Persona p7 = new Persona("Andrea", "006", 7);
        Persona p2 = new Persona("Ivan", "002", 25);
        Persona p3 = new Persona("Mar", "003", 9);
        Persona p4 = new Persona("Joaquin", "004", 5);
        Persona p5 = new Persona("Carlos", "005", 21);
        Persona p6 = new Persona("Andrea", "006", 7);
        ColaADT<Persona> col = new ColaA();
        
        col.agrega(p1);
        col.agrega(p2);
        col.agrega(p3);
        col.agrega(p4);
        col.agrega(p5);
        col.agrega(p6);
        col.agrega(p7);
        Aeropuerto.ordenaCola(col);
        System.out.println(col.toString());
    }
    
}
