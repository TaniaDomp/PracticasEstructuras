package pila_01;
/*Tania Ariadna Dominguez Palma
 *17/02/2022
 * Clase que comprueba la clase Pila
 */
public class Pila_01 {

    public static void main(String[] args) {
        PilaA<String> colores = new PilaA();
        PilaA<Integer> edades = new PilaA();
        PilaA<Double> precios = new PilaA();
        PilaA pila = new PilaA();
        
        //Intenta quitar los elementos de la pila vacia 
        try{
            System.out.println("\nElemento quitado: " + colores.pop());
        }
        catch(Exception e){
            System.out.println("Error" + e);
        }
        //Insera elementos en la pila
        colores.push("Blanco");
        colores.push("verde");
        colores.push("azul");
        colores.push("amarillo");
        colores.push("negro");
        System.out.println("\n Pila de colores: \n" + colores.toString());
        try{ //caso de prueba 3
            System.out.println("\nElemento quitado: " + colores.pop());
        }
        catch(Exception e){
            System.out.println("Error" + e);
        }
        System.out.println("\n Pila de colores: \n" + colores.toString());
        
        pila.push("jueves");
        pila.push(4.5);
        pila.push(10);
        pila.push(true);
        System.out.println("\n Pila mezcla: \n" + pila);
    }
}
