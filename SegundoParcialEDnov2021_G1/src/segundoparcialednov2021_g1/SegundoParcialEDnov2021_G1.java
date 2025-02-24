
package segundoparcialednov2021_g1;

/**
 *
 * @author 
 */
public class SegundoParcialEDnov2021_G1 {

    public static void copiaCola (ColaADT<Object> origen, ColaADT<Object> destino){
        
        while (!origen.estaVacia()){
             destino.agrega(origen.quita());
        }
    }
    
    public static <T> boolean analizaCola(ColaADT cola, int n){
        ColaADT aux = new ColaA();
        T dato;
        boolean res = true;
        
        if (cola.estaVacia()){
            res = false;
        }
        else {
            while (!cola.estaVacia() && res){
                dato = (T) cola.quita();
                if (!(dato instanceof Integer) || (Integer) dato % n != 0){
                    res = false;
                }    
           
                aux.agrega(dato);
            }
            
       
            copiaCola (cola, aux);
            copiaCola (aux, cola);
        
        }
        
        return res;
    }
    
    public static int calculaTotalNinioConDispositivo (ConjuntoADT<Ninio> conCelular, ConjuntoADT<Ninio> conComputadora, ConjuntoADT<Ninio> conTableta){
       
        if (conCelular == null || conComputadora == null || conTableta == null){
            throw new NullPointerException ("Alguno de lso conjuntos es null");
        }
        
        ConjuntoADT<Ninio> nuevo;
        IteradorArreglo<Ninio> it1;
        int contador = 0;
        
        nuevo = conCelular.union(conComputadora.union(conTableta));
        it1 =  (IteradorArreglo<Ninio>) nuevo.iterator();
     
        while (it1.hasNext()) {
            contador++;
            it1.next();
        }
        
        return contador;
    }
    
    public static boolean hayPorLoMenos (ConjuntoADT<Ninio> conCelular, ConjuntoADT<Ninio> conComputadora, ConjuntoADT<Ninio> conTableta, int numNinios, int edad){
        if (conCelular == null || conComputadora == null || conTableta == null){
            throw new NullPointerException ("Alguno de los conjuntos es null");
        }        
        ConjuntoADT<Ninio> nuevo;
        IteradorArreglo<Ninio> it1;

        nuevo = conCelular.interseccion(conComputadora.interseccion(conTableta));
        it1 =  (IteradorArreglo<Ninio>) nuevo.iterator();
     
        return hayPorLoMenosR (it1, 0, numNinios, edad);
    }
    
    public static boolean hayPorLoMenosR (IteradorArreglo<Ninio> it1, int contador, int numNinios, int edad){
        
        if (it1.hasNext() && contador < numNinios){            
            if (it1.next().getEdad() < edad){
                contador++;
            }
            
            return hayPorLoMenosR (it1, contador, numNinios, edad);    
        }
        else {
            return contador == numNinios;
        }
    }
   
    public static void main(String [] args) {
        ColaADT cola = new ColaA();
        
        cola.agrega(2);
        cola.agrega(50);
        cola.agrega(100);
        cola.agrega(80);
        
        System.out.println(cola.toString());
        System.out.println("¿Toda la cola es multiplo de 2? " + analizaCola (cola, 2));
        
        
        ColaADT<Object> cola1 = new ColaA();
        
        cola1.agrega(2);
        cola1.agrega(50);
        cola1.agrega(100);
        cola1.agrega("Brayan");
        
        System.out.println(cola1.toString());
        System.out.println("¿Toda la cola es multiplo de 2? " + analizaCola (cola1, 2));
        
        

        ConjuntoADT<Ninio> conCelular = new ConjuntoA();
        ConjuntoADT<Ninio> conComputadora = new ConjuntoA();
        ConjuntoADT<Ninio> conTableta = new ConjuntoA();


        conCelular.agrega(new Ninio ("Brayan", 19));
        conCelular.agrega(new Ninio ("Jesus", 18));
        conCelular.agrega(new Ninio ("Muñoz", 17));
        conCelular.agrega(new Ninio ("Rodrigo", 16));

        conComputadora.agrega(new Ninio ("Brayan", 19));
        conComputadora.agrega(new Ninio ("Geovanny", 19));
        conComputadora.agrega(new Ninio ("Muñoz", 17));
        conComputadora.agrega(new Ninio ("Rodrigo", 16));    

        conTableta.agrega(new Ninio ("Brayan", 19));
        conTableta.agrega(new Ninio ("Francisco", 19));
        conTableta.agrega(new Ninio ("Muñoz", 17));
        conTableta.agrega(new Ninio ("Rodrigo", 16));


          
        System.out.println("¿Cuántos niños hay con algun dispositivo: ? " + calculaTotalNinioConDispositivo(conCelular,conComputadora,conTableta));
        System.out.println("¿Hay por lo menos 1 niño con 3 dispositivos de menos de 20 años: ? " + hayPorLoMenos (conCelular, conComputadora, conTableta, 1, 20));
        
        
        ConjuntoADT<Ninio> conCelular1 = new ConjuntoA();
        ConjuntoADT<Ninio> conComputadora1 = new ConjuntoA();
        ConjuntoADT<Ninio> conTableta1 = new ConjuntoA();


        conCelular1.agrega(new Ninio ("Brayan", 19));
        conCelular1.agrega(new Ninio ("Jesus", 18));
        conCelular1.agrega(new Ninio ("Muñoz", 15));
        conCelular1.agrega(new Ninio ("Rodrigo", 16));

        conComputadora1.agrega(new Ninio ("Geovanny", 19));
        conComputadora1.agrega(new Ninio ("Muñoz", 15));
        conComputadora1.agrega(new Ninio ("Rodrigo", 16));    

        conTableta1.agrega(new Ninio ("Brayan", 19));
        conTableta1.agrega(new Ninio ("Francisco", 19));
        conTableta1.agrega(new Ninio ("Muñoz", 15));
        conTableta1.agrega(new Ninio ("Rodrigo", 16));    

          
        System.out.println("¿Cuántos niños hay con algun dispositivo: ? " + calculaTotalNinioConDispositivo(conCelular1,conComputadora1,conTableta1));
        System.out.println("¿Hay por lo menos 2 niños con 3 dispositivos de menos de 20 años: ? " + hayPorLoMenos (conCelular1, conComputadora1, conTableta1, 2, 17));

    }
}
