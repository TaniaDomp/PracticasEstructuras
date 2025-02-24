import Queues.*;
import LinkedStructures.*;
import ADTsException.*;

public class Proble2 {

    public static void main(String[] args) {
        System.out.println("Proble2: Raul Isaac Resendiz Zayas 190629");
        CircularArrayQueue<Integer> cola1=new CircularArrayQueue();
        cola1.enqueue(new Integer(-17));
        cola1.enqueue(new Integer(3));
        cola1.enqueue(new Integer(18));
        
        // Pruebas de toString()
        System.out.println("Cola 1: " + cola1.toString());
        
        CircularArrayQueue<Double> cola2=new CircularArrayQueue();
        cola2.enqueue(new Double(0.5));
        cola2.enqueue(new Double(7));
        cola2.enqueue(new Double(0));
        cola2.enqueue(new Double(-3.14));
        
        // Prueba de toString()
        System.out.println("Cola 2: " + cola2.toString());
        
        CircularArrayQueue<String> cola3= new CircularArrayQueue();      
        // Prueba de toString():
        System.out.println("Cola 3: " + cola3.toString());
        
        LinkedStruct<Object> e1= new LinkedStruct();
        e1.add(cola1,1);
        e1.add(cola2,1);
        e1.add(cola3,1);
        
        // Prueba de toString():
        System.out.println("LinkedStruct e1: " + e1.toString());
        
        LinkedStruct<Object> e2= new LinkedStruct();    
        // Prueba de toString():
        System.out.println("LinkedStruct e2: " + e2.toString());
        
        // Pruebas de queueSize()
        // Aquí debería imprimirse 3, la cantidad de datos que contiene "cola1":
        System.out.println("\nCuenta Cola 1: " + queueSize(cola1));
        // Aquí debería imprimirse 4, la cantidad de datos que contiene "cola2":
        System.out.println("Cuenta Cola 2: " + queueSize(cola2));
        // Aquí debería imprimirse 0, la cantidad de datos que contiene "cola3":
        System.out.println("Cuenta Cola 3: " + queueSize(cola3));
        // Aquí debería imprimirse 0, puesto que no se tienen elementos en una
        // cola inexistente:
        System.out.println("Cuenta Cola 4: " + queueSize(null));

        // Pruebas a intercambiaColasEnLS.
        // Debería imprimir: 3 4 0 (los tamaños de "cola1", "cola2" y "cola3",
        // respectivamente), precedidos de direcciones de memoria:
        intercambiaColasEnLS(e1);
        System.out.println("\ne1 después: " + e1.toString());
        
        // Debería imprimir una línea en blanco, indicando que el parámetro que
        // se envió a "agregaTamanioColas" no contiene datos y por lo tanto no
        // fue alterado por dicho método:
        intercambiaColasEnLS(e2);
        System.out.println("e2 después: " + e2.toString());
        
        // No debería tronar, aunque tampoco debería alterar ninguna de las
        // estructuras enlazadas que se tienen en el programa:
        intercambiaColasEnLS(null);
        
        // Pruebas de suma()
        // Debería imprimir el mensaje del "catch", dado que "e2" no contiene
        // datos y por lo tanto el método "suma" debe lanzar una excepción
        // porque ninguno de los datos en "e2" es numérico:
        try {
            System.out.println("\ne2: " + e2.toString());
            System.out.println( "e2.suma: " + e2.suma() );
        }
        catch(ADTsException e) {
            System.out.println("e2.suma(). " + e.getMessage());
        }
        
        // Debería imprimir: 0.0, o un valor numérico muy cercano a éste (la
        // suma de los valores numéricos almacenados en "e3"):
        LinkedStruct<Object> e3= new LinkedStruct();
        e3.add(new Integer(-3),1);
        e3.add(new Character('7'),1);
        e3.add(new Double(3.1),1);
        e3.add(new Double(-0.1),1);
        try {
            System.out.println("e3: "+e3.toString());
            System.out.println("e3.suma: " + e3.suma());
        }
        catch(ADTsException e) {
            System.out.println("\ne3.suma(). " + e.getMessage());
        }        
        // Debería imprimir el mensaje del "catch", dado que "e4" no contiene
        // ningún valor numérico a pesar de que sí contiene datos:
        LinkedStruct<Object> e4= new LinkedStruct();
        e4.add(new Character('7'),1);
        try {
            System.out.println("\ne4: "+e4.toString());
            System.out.println( "e4.suma: " + e4.suma() );
        }
        catch(ADTsException e) {
            System.out.println("e4.suma(). " + e.getMessage());
        }

    }
    
    // Metodos del examen
    public static <T> int queueSize(CircularArrayQueue<T> cola) {
        // CircularArrayQueue: no hay size(), pero si isEmpty(),
        // metodos fundamentales y colas auxiliares
        int tam=0;
        CircularArrayQueue<T> aux = new CircularArrayQueue();
        T elem;
        if(cola == null)
            return tam;
        while( !cola.isEmpty()){
            elem = cola.dequeue();
            aux.enqueue(elem);
            tam++;
        }
        while (!aux.isEmpty()){
            cola.enqueue(aux.dequeue());
        }
        return tam;
    }
    
    public static void intercambiaColasEnLS(LinkedStruct<Object> ls) {
        // CircularArrayQueue: no hay size(), pero si isEmpty(),
        // metodos fundamentales y colas auxiliares
        
        

    }    
}
