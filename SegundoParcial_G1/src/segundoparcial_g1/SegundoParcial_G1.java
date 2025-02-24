package segundoparcial_g1;
import java.util.Iterator;
/**Tania Ariadna Dominguez Palma
 * CU: 200267
 * 28/04/2022
 * Segundo Examen parcial, Estructura de Datos
 * Preguntas 2, 3
 */
public class SegundoParcial_G1 {

    public static int cadenasMayProm(ConjuntoADT<String> conj){
        Iterator<String> it, it2;
        String dat;
        int suma = 0, prom, cont = 0;
        
        if(conj != null && !conj.estaVacio()){
            it = conj.iterator();
            it2 = conj.iterator();
            while(it.hasNext()){
                dat = it.next();
                suma += dat.length();
            }
            prom = suma/conj.getCardinalidad();
            while(it2.hasNext()){
                if(prom < it2.next().length()){
                    cont++;
                }
            }
        }
        return cont;
    }
    
    public static void copiaColas(ColaADT<Yogurt> urgeVender, ColaADT<Yogurt> aux){
        while(!urgeVender.estaVacia()){
            aux.agrega(urgeVender.quita());
        }
        while(!aux.estaVacia()){
            urgeVender.agrega(aux.quita());
        }
    }
    
    public static boolean ventasUrgentes(ColaADT<Yogurt> urgeVender, int mesVen){
        ColaADT<Yogurt> aux = new ColaArreglo();
        Yogurt dat;
        boolean uV = true;
        
        while(!urgeVender.estaVacia() && uV){
            dat = urgeVender.quita();
            uV = dat.getMesVencimiento() < mesVen;
            aux.agrega(dat);
        }
        copiaColas(urgeVender, aux);
        return uV;
    }
    
    public static void main(String[] args) {
        //Prueba primero
        /*ConjuntoADT<Integer> c1 = new ConjuntoArreglo();
        ConjuntoADT<Integer> c2 = new ConjuntoArreglo();
        ConjuntoADT<Integer> c3 = new ConjuntoArreglo();
        ConjuntoADT<String> c4 = new ConjuntoArreglo();
        ConjuntoADT<String> c5 = new ConjuntoArreglo();
        ConjuntoADT<String> c6 = new ConjuntoArreglo();
        ConjuntoADT<String> c7 = new ConjuntoArreglo();
        
        c1.agrega(23);
        c1.agrega(45);
        c1.agrega(18);
        c1.agrega(4);
        c1.agrega(56);
        c1.agrega(31);
        c2.agrega(18);
        c2.agrega(23);
        c2.agrega(56);
        c3.agrega(18);
        c3.agrega(23);
        c3.agrega(52);
        c4.agrega("A");
        c4.agrega("B");
        c4.agrega("C");
        c4.agrega("D");
        c4.agrega("E");
        c5.agrega("A");
        c5.agrega("B");
        c5.agrega("C");
        c5.agrega("D");
        c5.agrega("E");
        c6.agrega("M");
        c6.agrega("J");
        c6.agrega("I");
        c7.agrega("B");
        System.out.println(c1.esSuperConjuntoDe(c2));
        System.out.println(c1.esSuperConjuntoDe(c3));
        System.out.println(c4.esSuperConjuntoDe(c5));
        System.out.println(c4.esSuperConjuntoDe(c6));
        System.out.println(c3.esSuperConjuntoDe(c1));
        System.out.println(c5.esSuperConjuntoDe(c7));*/
       
        //Prueba segundo
        /*ConjuntoADT<String> cad1 = new ConjuntoArreglo();
        ConjuntoADT<String> cad2 = new ConjuntoArreglo();
        ConjuntoADT<String> cad3 = new ConjuntoArreglo();
        
        cad1.agrega("hoy hace calor");
        cad1.agrega("los autos son muy chicos");
        cad1.agrega("¡silencio!");
        System.out.println(cadenasMayProm(cad1));
        cad2.agrega("AB");
        cad2.agrega("AB");
        cad2.agrega("AB");
        cad2.agrega("AB");
        System.out.println(cadenasMayProm(cad2));
        cad3.agrega("AB");
        cad3.agrega("AB");
        cad3.agrega("AB");
        cad3.agrega("ABC");
        System.out.println(cadenasMayProm(cad3));*/
        
        //Prueba tercero
        ColaADT<Yogurt> urgeVender = new ColaArreglo();
        ColaADT<Yogurt> urgeVender1 = new ColaArreglo();
        
        urgeVender.agrega(new Yogurt(001, 25, 2));
        urgeVender.agrega(new Yogurt(002, 25, 1));
        urgeVender.agrega(new Yogurt(003, 25, 3));
        urgeVender.agrega(new Yogurt(004, 25, 3));
        urgeVender.agrega(new Yogurt(005, 25, 2));
        urgeVender.agrega(new Yogurt(006, 25, 3));
        //urgeVender1 = null;
        System.out.println(urgeVender.toString());
        System.out.println(ventasUrgentes(urgeVender, 4));
        System.out.println(urgeVender.toString());
        System.out.println(ventasUrgentes(urgeVender, 3));
        System.out.println(urgeVender.toString());
        //System.out.println(urgeVender.consultaPrimero());
        System.out.println(ventasUrgentes(urgeVender, 2));
        System.out.println(urgeVender.toString());
        System.out.println();
    }
    
}
