package examenfinalenero_mayo2022;
import java.util.Iterator;
/**Tania Ariadna Dominguez Palma
 *Clave Unica: 200267
 * Solucion a los problemas 1 y 2 
 */
public class ExamenFinalenero_mayo2022 {

    private static boolean consultaExistencia(Iterator<ProductoLacteo> it, double canGram, String tipo, double cantidad){
        if(!it.hasNext()){
            return canGram >= cantidad;
        }
        else{
            ProductoLacteo pL = it.next();
            if(pL.getClass().getSimpleName().equals("Queso")){
                if(((Queso)pL).getTipo().equals(tipo)){
                    canGram += pL.getPresentacion();
                }
            }
            return consultaExistencia(it, canGram, tipo, cantidad);
        }
    }
    
    public static boolean consultaExistencia(ConjuntoADT<ProductoLacteo> productos, String tipo, double cantidad){
        boolean res = false;
        
        if(productos != null){
            Iterator<ProductoLacteo> it = productos.iterator();
            res = consultaExistencia(it, 0, tipo, cantidad);
        }
        return res;
    }
    
    public static boolean esPalindromo(String cadena){
        boolean res = true;
        String cad;
        ColaA<Character> colPal = new ColaA();
        PilaA<Character> pilPal = new PilaA();
        
        cad = cadena.toLowerCase();
        for(int i = 0; i < cad.length(); i++){
            if(cad.charAt(i) != ' '){
                colPal.agrega(cad.charAt(i));
                pilPal.push(cad.charAt(i));
            }
        }
        while(!colPal.estaVacia() && res){
            res = colPal.quita().equals(pilPal.pop());
        }
        return res;
    }
    
    public static void main(String[] args) {
        //Prueba Problema1
        /*ConjuntoADT<ProductoLacteo> productos = new ConjuntoA();
        ConjuntoADT<ProductoLacteo> productos1 = new ConjuntoA();
        ConjuntoADT<ProductoLacteo> productos2 = new ConjuntoA();
        ConjuntoADT<ProductoLacteo> productos3 = new ConjuntoA();
        ConjuntoADT<ProductoLacteo> productos4 = null;

        productos.agrega(new Queso("roquefort", "D", 50.2, 5000));
        productos.agrega(new Queso("roquefort", "D", 50.2, 100));
        productos.agrega(new Yogurt(5, "D", 50.2, 500));
        productos2.agrega(new Queso("R", "D", 50.2, 5000));
        productos2.agrega(new Queso("R", "D", 50.2, 100));
        productos2.agrega(new Yogurt(5, "D", 50.2, 500));
        productos3.agrega(new Queso("R", "D", 50.2, 5000));
        productos3.agrega(new Queso("R", "D", 50.2, 100));
        productos3.agrega(new Queso("roquefort", "D", 50.2, 100));
        productos3.agrega(new Queso("roquefort", "D", 50.2, 100));
        productos3.agrega(new Queso("roquefort", "D", 50.2, 100));
        productos3.agrega(new Queso("R", "D", 50.2, 100));
        System.out.println(consultaExistencia(productos, "roquefort", 50000));
        System.out.println(consultaExistencia(productos, "roquefort", 5100));
        System.out.println(consultaExistencia(productos1, "roquefort", 5100));
        System.out.println(consultaExistencia(productos2, "roquefort", 5100));
        System.out.println(consultaExistencia(productos3, "roquefort", 200));
        System.out.println(consultaExistencia(productos4, "roquefort", 200));*S/
        
        //Prueba Problema2
        /*System.out.println(esPalindromo("3025"));
        System.out.println(esPalindromo("Anita lava la tina"));
        System.out.println(esPalindromo("12321"));
        System.out.println(esPalindromo("Neuquen"));
        System.out.println(esPalindromo("Dabale arroz a la zorra el abad"));
        System.out.println(esPalindromo("Dabale arrom a la zorra el abad"));/*
        
        //Prueba Problema3
        /*ListaDesordenada<Integer> lis = new ListaDesordenada();
        ListaDesordenada<Integer> lis1 = new ListaDesordenada();
        ListaDesordenada<Integer> lis2 = new ListaDesordenada();
        ListaDesordenada<Integer> lis3 = new ListaDesordenada();
        ListaDesordenada<Integer> lis4 = new ListaDesordenada();
        
        lis.agregaFinal(6);
        lis.agregaFinal(7);
        lis.agregaFinal(8);
        lis.agregaFinal(9);
        lis.agregaFinal(10);
        lis.agregaFinal(4);
        lis2.agregaFinal(8);
        lis3.agregaFinal(6);
        lis3.agregaFinal(7);
        lis3.agregaFinal(8);
        lis3.agregaFinal(9);
        lis3.agregaFinal(8);
        lis3.agregaFinal(4);
        lis3.agregaFinal(8);
        lis3.agregaFinal(8);
        lis3.agregaFinal(2);
        lis4.agregaFinal(8);
        lis4.agregaFinal(6);
        lis4.agregaFinal(8);
        lis4.agregaFinal(8);
        lis4.agregaFinal(7);
        lis4.agregaFinal(8);
        lis4.agregaFinal(9);
        lis4.agregaFinal(8);
        lis4.agregaFinal(4);
        lis4.agregaFinal(8);
        lis4.agregaFinal(8);
        lis4.agregaFinal(2);
        lis4.agregaFinal(8);
        lis.ordenaConDato(8);
        lis1.ordenaConDato(8);
        lis2.ordenaConDato(8);
        lis3.ordenaConDato(8);
        lis4.ordenaConDato(8);
        System.out.println(lis);
        System.out.println(lis1);
        System.out.println(lis2);
        System.out.println(lis3);
        System.out.println(lis4);*/
    }
    
}
