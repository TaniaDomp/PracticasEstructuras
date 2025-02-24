package PilaEE;
/**Tania Ariadna Dominguez Palma
 *19/05/2022
 * Clase que prueba la clase Pila
 */
public class PruebaPilas {
    
    public static void main(String[] args) {
        Pila<Integer> pil = new Pila();
        Pila<Integer> pil1 = new Pila();
        Pila<String> pil2 = new Pila();
        
        //System.out.println(pil.isEmpty());
        pil.push(5);
        pil.push(10);
        pil.push(20);
        pil.push(45);
        pil.push(9);
        pil1.push(5);
        pil1.push(10);
        pil1.push(20);
        pil1.push(45);
        pil1.push(9);
        pil2.push("M");
        pil2.push("A");
        pil2.push("L");
        pil2.push("G");
        /*System.out.println(pil);
        //System.out.println(pil.isEmpty());*/
        //System.out.println(pil.peek());
        /*System.out.println("\n" + pil.pop());
        System.out.println(pil.pop());
        System.out.println(pil);*/
        System.out.println(pil.equals(pil1));
        System.out.println(pil1.equals(pil1));
        System.out.println(pil2.equals(pil1));
    }
    
}
