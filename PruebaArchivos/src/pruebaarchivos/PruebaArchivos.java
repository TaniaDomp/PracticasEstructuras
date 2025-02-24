
package pruebaarchivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


/**
 *
 * @author S. Guardati
 */
public class PruebaArchivos {

    /**
     * @param args the command line arguments
     */
    
    public static void llenaArchivo(String nombre){
        try{
            FileOutputStream file = new FileOutputStream(nombre);
            ObjectOutputStream escribe = new ObjectOutputStream(file); 
            Scanner lee = new Scanner(System.in);
            String nom;
            double sueldo;
            int totalEmp, clave;
            Empleado emp;
            
            System.out.print("\nIngresa total de empleados: ");
            totalEmp = lee.nextInt();
            escribe.writeObject(totalEmp);
            for (int i = 0; i < totalEmp; i++) {
               System.out.println("\nIngresa clave del empleado: ");
                clave = lee.nextInt(); 
                lee.nextLine();
                System.out.print("\nIngrese nombre: ");
                nom = lee.nextLine();
                System.out.print("\nIngrese sueldo: ");
                sueldo = lee.nextDouble();
                emp = new Empleado(clave, sueldo, nom);
                escribe.writeObject(emp);               
            }
            escribe.close();
        } catch (Exception e){
            System.out.println("\nError al abrir el archivo");
        }
    }
    
    public static String reporteEmpleados(String nombre){
        String reporte = null;
        
        try{
            FileInputStream file = new FileInputStream(nombre);
            ObjectInputStream lee = new ObjectInputStream(file);
            StringBuilder sB = new StringBuilder("\nReporte de empleados\n");
            int n;
            Empleado emp;
            n = (Integer)lee.readObject();
            for (int i = 0; i < n; i++){
                emp = (Empleado) lee.readObject();
                sB.append(emp).append("\n");
            }
            lee.close();
            reporte = sB.toString();
        } catch (Exception e){
            System.out.println("\nError al abrir el archivo");
        }
        return reporte;
    }
    
      public static void llenaArchivoMezcla(String nombre){
        try{
            FileOutputStream file = new FileOutputStream(nombre);
            ObjectOutputStream escribe = new ObjectOutputStream(file); 
            String numeros[] = {"uno", "dos", "tres"};
            
            escribe.writeObject(45);
            escribe.writeObject(new Persona("Miguel"));
            escribe.writeObject(new Empleado(110, 12541, "Jacinta"));
            escribe.writeObject("Hola");
            escribe.writeObject(true);
            escribe.writeObject("Hoy es un día de mucho frío");
            escribe.writeObject(numeros);            
            escribe.close();
        } catch (Exception e){
            System.out.println("\nError al abrir el archivo");
        }
    }
      
    public static void muestraMezclado(String nombre){
       
        try{
            FileInputStream file = new FileInputStream(nombre);
            ObjectInputStream lee = new ObjectInputStream(file);
            Object objeto;
            
            objeto = lee.readObject();
            while (objeto != null){
                if (!(objeto instanceof Object[]))
                    System.out.println(objeto);                
                objeto = lee.readObject();
            }
            lee.close();            
        } catch (Exception e){
            System.out.println("\nPASÉ POR ACÁ");
        }
       
    }
    
    public static void main(String[] args) {
        llenaArchivo("Empleados");
        System.out.println(reporteEmpleados("Empleados"));
        llenaArchivoMezcla("mezclado");
        muestraMezclado("mezclado");        
    }
    
}
