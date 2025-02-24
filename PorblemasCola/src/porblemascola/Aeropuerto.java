package porblemascola;
import cola_01.ColaA;
import cola_01.ColaADT;
import recursividad.ArregloGenerico;
/**Tania Ariadna Dominguez Palma
 * 26/04/2022
 * Clase que maneja a Personas formadas en Cola para un avion
 */
public class Aeropuerto {
    
    public static <T extends Comparable <T>> int posMin(Persona []a, int n, int in) {
	int pos = in;
	Persona meno = a[in];
		
	for (int i = in+1; i < n; i++) {
		if (a[i].getEdad() - meno.getEdad() < 0) {
                    meno =a[i];
                    pos = i;
		}
	}
	return pos;
    }
	
    public static <T> void swap(Persona[]a, int p1, int p2) {
	Persona aux;
		
	aux = a[p1];
	a[p1] = a[p2];
	a[p2] = aux;
    }
    
    public static <T extends Comparable <T>> void seleccionDirecta(Persona[]a, int n) {
	int num;
		
	for (int i = 0; i < n; i++) {	
		num = posMin(a, n, i);
		swap(a, i, num);
	}
    }	    
    
    public static void ordenaCola(ColaADT<Persona> col){
        Persona[] per;
        int elem, i;
        
        if(!col.estaVacia()){
            elem = col.cuentaElementos();
            per = new Persona[elem];
            i = 0;
            while(!col.estaVacia()){
                per[i] = col.quita();
                i++;
            }
            seleccionDirecta(per, elem);
            for(int a = elem-1; a > 0; a--){
                col.agrega(per[a]);
            }
        }
    }
}
