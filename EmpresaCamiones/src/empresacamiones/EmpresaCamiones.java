package empresacamiones;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**Tania Ariadna Dominguez Palma 
 *09/03/2022
 * Clase que prueba las clases Camion
 */
public class EmpresaCamiones {
    
    public static void llenaArchivo(String nombre){
        try{
            FileOutputStream file = new FileOutputStream(nombre);
            ObjectOutputStream lect = new ObjectOutputStream(file);
            Scanner lec = new Scanner(System.in);
            String marca, numMotor, placas;
            int numPas, numCam, numCam1;
            double capTone;
            Camion cam;
            
            System.out.println("Numero de camiones de pasajeros");
            numCam = lec.nextInt();
            lect.writeObject(numCam);
            for(int i = 0; i < numCam; i++){
                System.out.println("Marca del camion");
                marca = lec.next();
                System.out.println("Numero de motores");
                numMotor = lec.next();
                System.out.println("Placas del camion");
                placas = lec.next();
                System.out.println("Numero de pasajeros");
                numPas = lec.nextInt();
                cam = new DePasajeros(marca, numMotor, placas, numPas);
                lect.writeObject(cam);
            }
            System.out.println("Numero de camiones de volteo");
            numCam1 = lec.nextInt();
            lect.writeObject(numCam1);
            for(int i = 0; i < numCam1; i++){
                System.out.println("Marca del camion");
                marca = lec.next();
                System.out.println("Numero de motores");
                numMotor = lec.next();
                System.out.println("Placas del camion");
                placas = lec.next();
                System.out.println("Capacidad de toneladas");
                capTone = lec.nextDouble();
                cam = new DeVolteo(marca, numMotor, placas, capTone);
                lect.writeObject(cam);
            }
            lect.close();
        }
        catch(Exception e){
            System.err.println("Error al abrir el archivo");
        }
    }
    
    public static String reporteCamiones(String nombre){
        String reporte = null;
        
        try{
            FileInputStream file = new FileInputStream(nombre);
            ObjectInputStream lee = new ObjectInputStream(file);
            StringBuilder cad = new StringBuilder("\nReporte de camiones \n");
            int n, n1;
            Camion cam;
            
            n = (Integer)lee.readObject();
            for(int i = 0; i < n; i++){
                cam = (Camion)lee.readObject();
                cad.append(cam + "\n");
            }
            n1 = (Integer)lee.readObject();
            for(int i = 0; i < n1; i++){
                cam = (Camion)lee.readObject();
                cad.append(cam + "\n");
            }
            lee.close();
            reporte = cad.toString();
        }
        catch(Exception e){
            System.err.println("Error al abrir el archivo");
        }
        return reporte;
    }
    
    
    public static void main(String[] args) {
        EmpresaMinera emp = new EmpresaMinera();
        /*Camion cam = new Camion("Emo", "4", "25");
        Camion cam1 = new Camion("Emo", "4", "26");
        Camion cam2 = new DePasajeros("Em", "4", "17", 5);
        
        System.out.println(cam.equals(cam2));
        System.out.println(cam.equals(cam));
        System.out.println(cam.equals(cam1));
        System.out.println(cam.toString());
        System.out.println(cam2.toString());*/
        
        /*System.out.println(emp.altaCamion("Em", "4", "17", 5));
        System.out.println(emp.altaCamion("Em", "4", "18", 5.0));
        System.out.println(emp.altaCamion("Em", "4", "19", 10));
        System.out.println(emp.altaCamion("Em", "4", "20", 10.0));
        System.out.println(emp.altaCamion("Em", "4", "21", 50));
        System.out.println(emp.altaCamion("Em", "4", "22", 10.0));
        //System.out.println(emp.camionesPasajeros());
        System.out.println(emp.cambiaCapTrans("21", 15.0));
        System.out.println(emp.totCamPasMar("Emp"));
        System.out.println(emp.totTonTierra());*/
        
        llenaArchivo("Camiones");
        System.out.println(reporteCamiones("Camiones"));
    }
    
}
