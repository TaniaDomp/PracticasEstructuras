package conjuntos;
import java.io.File;
import java.util.Iterator;
import java.util.Scanner;
/**Tania Ariadna Dominguez Palma
 *07/04/2022
 *alumnos que hablan ciero idioma
 */
public class alumnosIdiomas {
    
    public static void llenaConjuntos(ConjuntoADT<String> c1, ConjuntoADT<String> c2, ConjuntoADT<String> c3, String nombre){
        File arch = new File(nombre);
        Scanner lect;
        String linea;
        int ind;
        
        try{
            lect = new Scanner(arch);
            while(lect.hasNextLine()){
                linea = lect.nextLine();
                if(linea.contains("frances")){
                    ind = linea.indexOf(",");
                    c1.agrega(linea.substring(ind + 1));
                }
                else{
                    if(linea.contains("ingles")){
                        ind = linea.indexOf(",");
                        c2.agrega(linea.substring(ind + 1));
                    }
                    else{
                        ind = linea.indexOf(",");
                        c3.agrega(linea.substring(ind + 1));
                    }
                }
            }
            lect.close();
        }
        catch(Exception e){
            System.err.println("Error al abrir archivo");
        }
    }
    
    public static String habIngFran(ConjuntoADT<String> c1, ConjuntoADT<String> c2){
        ConjuntoADT<String> franIng;
        
        franIng = c1.interseccion(c2);
        return franIng.toString();
    }
    
    public static int habIng(ConjuntoADT<String> c1, ConjuntoADT<String> c2, ConjuntoADT<String> c3){
        ConjuntoADT<String> conj1;
        ConjuntoADT<String> conj2;
        int cont = 0;
        Iterator<String> it;
        
        conj1 = c1.diferencia(c2);
        conj2 = conj1.diferencia(c3);
        it = conj2.iterator();
        while(it.hasNext()){
            it.next();
            cont++;
        }
        return cont;
        //return conj2.getCardinalidad();
    }
    
    public static String hablTresId(ConjuntoADT<String> c1, ConjuntoADT<String> c2, ConjuntoADT<String> c3){
        ConjuntoADT<String> franIng;
        ConjuntoADT<String> habTresI;
        
        franIng = c2.interseccion(c1);
        habTresI = franIng.interseccion(c3);
        return habTresI.toString();
    }
    
    public static void main(String[] args) {
        ConjuntoADT<String> frances = new ConjuntoA();
        ConjuntoADT<String> ingles = new ConjuntoA();
        ConjuntoADT<String> otro = new ConjuntoA();
        
        llenaConjuntos(frances, ingles, otro, "datAl");
        System.out.println(frances);
        System.out.println(ingles);
        System.out.println(otro);
        System.out.println(habIngFran(frances, ingles));
        System.out.println(habIng(ingles, frances, otro));
        System.out.println(hablTresId(ingles, frances, otro));
    }
}
