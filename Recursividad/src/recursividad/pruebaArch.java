package recursividad;

import java.io.File;
import java.util.Scanner;
/**
 *
 * @author tania
 */
public class pruebaArch {
    
    public static int cuentaPalabras(int cont, Scanner lectura){
        if(!lectura.hasNext()){
            return cont;
        }
        else{
            lectura.next();
            cont++;
            return cuentaPalabras(cont, lectura);
        }
    }
    
    public static int cuentaPalabras(String nom){
        File arch = new File(nom);
        Scanner lect;
        int res = 0;
        
        try{
            lect = new Scanner(arch);
            res = cuentaPalabras(0, lect);
            lect.close();
        }
        catch(Exception e){
            res = -1;
        }
        return res;
    }
    
    public static void main(String[] args) {
        int num;
        
        num = cuentaPalabras("archivo");
        System.out.println(num);
    }
}
