package examenfinalenero_mayo2022;
/**
 *
 * @author Silvia Guardati
 * Implementación de la clase Cola por medio de un arreglo -circular-.
 */
public class ColaA <T> implements ColaADT <T>{
    private T cola[];
    private int frente, fin;
    private final int MAX = 10;

    public ColaA() {
        cola = (T[]) new Object[MAX];
        frente = -1;
        fin = -1;
    }

    public void agrega(T dato) {
        if (estaVacia())
            frente = 0;
        else
            if ((fin + 1) % cola.length  == frente)
                expandeCapacidad();
        fin = (fin + 1) % cola.length;
        cola[fin] = dato;
    }

    public boolean estaVacia() {
        return frente == -1;
    }

    public T primero() {
        if (!estaVacia())
            return cola[frente];
        else
            throw new ColeccionVaciaExcepcion("Cola vacía");
    }

    public T quita() {       
        if (estaVacia())
            throw new ColeccionVaciaExcepcion("Cola vacía");
        else {
            T resul = cola[frente];
            if (frente == fin){
                frente = -1;
                fin = -1;
            }
            else
                frente = (frente + 1) % cola.length;
            return resul;
        }      
    }

    private void expandeCapacidad(){
        T nuevo[] = (T[]) new Object[cola.length * 2];
        int i, j;

        j = 0;
        for (i= frente; i < cola.length; i++)
            nuevo[j++]= cola[i];
        for (i= 0; i < frente; i ++)
            nuevo[j++]= cola[i];
        frente = 0;
        fin = j-1;
        cola = nuevo;
    }
    
}
