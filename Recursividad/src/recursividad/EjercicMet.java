package recursividad;
/**Tania Ariadna Dominguez Palma
 *15/03/2022
 *Clase que ocupa recursividad para resolver problemas 
 */
public class EjercicMet {
    
    public static int calcFactorial(int n){ 
	if(n== 0 || n == 1){
            return 1;
        }
        else{
            return n * calcFactorial(n-1);
        }
    }
    
    public static int sumaElementos(int [] arre, int total){
        if(total == 0){
            return 0;
        }
        else{
            return arre[total-1] + sumaElementos(arre, total-1);
        }
    }
    
    public static void impresionElemIzq(int [] arre, int total){
        if(total > 0){
            impresionElemIzq(arre, total-1);
            System.out.print(arre[total-1] + " ");
        }
    }    
    
    public static void impresionElemDer(int [] arre, int total){
       if(total > 0){
           System.out.print(arre[total-1] + " ");
           impresionElemDer(arre, total-1);
       }
    }
    
}
