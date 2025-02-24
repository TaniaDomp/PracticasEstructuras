package porblemascola;
import java.io.File;
import java.util.Scanner;
/**Tania Ariadna Dominguez Palma
 * 27/04/2022
 * Clase que prueba la clase Impresora
 */
public class PruebaArchivos {
    
    private static Impresora imp = new Impresora();
    
    public static void llenaArchivo(String nombreA){
        String nombre, dueno, fecha, tipoProc, tipo;
        double tamano, resolucion;
        File ent = new File(nombreA);
        
        try(Scanner lect = new Scanner(ent)){
            while(lect.hasNext()){
                nombre = lect.next();
                dueno = lect.next();
                fecha = lect.next();
                tamano = lect.nextDouble();
                tipo = lect.next();
                if(tipo.equals("Foto")){
                    resolucion = lect.nextDouble();
                    imp.altaArchivo(tamano, nombre, dueno, fecha, resolucion);
                }
                else{
                    tipoProc = lect.next();
                    imp.altaArchivo(tamano, nombre, dueno, fecha, tipoProc);
                }
            }
            lect.close();
        }
        catch(Exception e){
            System.out.println("Error al leer el archivo");
        }
    }
    
    public static void main(String[] args) {
        llenaArchivo("DatosArch");
        System.out.println(imp.imprime());
    }
}
