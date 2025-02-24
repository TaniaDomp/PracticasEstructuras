import Queues.*;

public class Proble1 {

    public static void main(String[] args) {
        System.out.println("Proble1: Raul Isaac Resendiz Zayas 190629");
        CircularArrayQueue<Object> cola1=new CircularArrayQueue();
        CircularArrayQueue<Integer> cola2=new CircularArrayQueue();
        CircularArrayQueue<Character> cola3=new CircularArrayQueue();
        CircularArrayQueue<Double> cola4=new CircularArrayQueue();
        CircularArrayQueue<Object> cola5=null;
        
        cola1.enqueue(new String("hola"));
        cola1.enqueue(new Integer(3));
        cola1.enqueue(new Double(3.1416));
        cola1.enqueue(new Integer(-17));
        // Debería imprimir: { hola 3 3.1416 -17 }
        System.out.println("Cola 1 inicial: " + imprimeCola(cola1));
        // Debería imprimir: 3
        System.out.println("Primera prueba...se eliminó: " + eliminaSegundo(cola1));
        // Debería imprimir: { hola 3.1416 -17 }
        System.out.println("Cola 1 resultante: " + imprimeCola(cola1));
        
        System.out.println("\nCola 2 inicial: " + imprimeCola(cola2));
        // Debería imprimir: null
        System.out.println("Segunda prueba...se eliminó: " + eliminaSegundo(cola2));
        // Debería imprimir: (nada, cola vacía)
        System.out.println("Cola 2 resultante: " + imprimeCola(cola2));
        
        cola3.enqueue(new Character('A'));
        cola3.enqueue(new Character('Z'));
        System.out.println("\nCola 3 inicial: " + imprimeCola(cola3));
        // Debería imprimir: Z
        System.out.println("Tercera prueba...se eliminó: " + eliminaSegundo(cola3));
        // Debería imprimir: A
        System.out.println("Cola 3 resultante: " + imprimeCola(cola3));
        
        cola4.enqueue(new Double(3.1416));
        System.out.println("\nCola 4 inicial: " + imprimeCola(cola4));
        // Debería imprimir: null
        System.out.println("Cuarta prueba...se eliminó: " + eliminaSegundo(cola4));
        // Debería imprimir: 3.1416
        System.out.println("Cola 4 resultante: " + imprimeCola(cola4));
        
        System.out.println("\nCola 5 inicial: " + imprimeCola(cola5));
        // Debería imprimir: null
        System.out.println("Quinta prueba...se eliminó: " + eliminaSegundo(cola5));
        // Debería imprimir: (nada, cola vacía)
        System.out.println("Cola 5 resultante: " + imprimeCola(cola5));
    }
    
    // Metodos del examen
    public static <T> T eliminaSegundo(CircularArrayQueue<T> cola) {
        // CircularArrayQueue: no hay size(), pero si isEmpty(),
        // metodos fundamentales y colas auxiliares
        T elem2elim= null;
        CircularArrayQueue<T> aux = new CircularArrayQueue();
        int i = 0;
        
        while( !cola.isEmpty()){
            aux.enqueue(cola.dequeue());
            i++;
        }
        
        if(cola == null){
            elem2elim = null;
        }
        
        if ( i == 1){
            elem2elim = null;
        }
        
        if( i == 2){
            cola.enqueue(aux.dequeue());
            elem2elim = aux.dequeue();
        }
        
        if( i > 2){
            cola.enqueue(aux.dequeue());
            elem2elim = aux.dequeue();
            while( !aux.isEmpty()){
                cola.enqueue(aux.dequeue());
            }
        }
        
        return elem2elim;
    }
    
    public static <T> String imprimeCola(CircularArrayQueue<T> cola) {
        // CircularArrayQueue: no hay size(), pero si isEmpty(),
        // metodos fundamentales y colas auxiliares
        // puede usar otro imprimeCola(...) recursivo
        //cade= cola.toString();
        String cade= "{";
         CircularArrayQueue<T> aux = new CircularArrayQueue();
        int i = 0;
        
        if( !cola.isEmpty()){
            aux.enqueue(cola.dequeue());
            i++;
        }
        
        if( (cola!=null) && !cola.isEmpty() ) {
            cade= imprimeColas(cola, i);
        }
        cade= cade + " }";
        
        return cade;
    }
    
    public static <T> String imprimeColas(CircularArrayQueue<T> cola, int n){
        String cade = " { ";
        CircularArrayQueue<T> aux = new CircularArrayQueue();
        
        if( !cola.isEmpty()){
            aux.enqueue(cola.dequeue());
        }
        
        if(n >0){
            if( !aux.isEmpty()){
                cade =  aux.dequeue() + " ";
            }
            n--;
        }
        return cade;
    }
}
