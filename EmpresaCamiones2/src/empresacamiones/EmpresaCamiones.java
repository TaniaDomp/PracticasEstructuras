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
            boolean lugarProy, asientoCama, serviBar;
            double costoCam;
            Camion cam;
            
            System.out.println("Numero de camiones escolares");
            numCam = lec.nextInt();
            lect.writeObject(numCam);
            for(int i = 0; i < numCam; i++){
                System.out.println("Marca del camion");
                marca = lec.next();
                System.out.println("Numero de motores");
                numMotor = lec.next();
                System.out.println("Placas del camion");
                placas = lec.next();
                System.out.println("Costo del camion");
                costoCam = lec.nextDouble();
                System.out.println("Numero de pasajeros");
                numPas = lec.nextInt();
                System.out.println("Tiene lugar para proyectos");
                lugarProy = lec.nextBoolean();
                cam = new Escolar(marca, numMotor, placas, costoCam, numPas, lugarProy);
                lect.writeObject(cam);
            }
            System.out.println("Numero de camiones de turismo");
            numCam1 = lec.nextInt();
            lect.writeObject(numCam1);
            for(int i = 0; i < numCam1; i++){
                System.out.println("Marca del camion");
                marca = lec.next();
                System.out.println("Numero de motores");
                numMotor = lec.next();
                System.out.println("Placas del camion");
                placas = lec.next();
                System.out.println("Costo del camion");
                costoCam = lec.nextDouble();
                System.out.println("Numero de pasajeros");
                numPas = lec.nextInt();
                System.out.println("Tiene asiento-cama");
                asientoCama = lec.nextBoolean();
                System.out.println("Tiene serviBar");
                serviBar = lec.nextBoolean();
                cam = new Turismo(marca, numMotor, placas, costoCam, numPas, asientoCama, serviBar);
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
        EmpTransp emp = new EmpTransp();
        
        /*System.out.println(emp.altaCamion("Roy", "5", "185", 1000, 25, true));
        System.out.println(emp.altaCamion("Roy", "5", "186", 1000, 25, false));
        System.out.println(emp.altaCamion("Roy", "5", "187", 1000, 15, false));
        System.out.println(emp.altaCamion("Roy", "5", "185", 1000, 15, true));
        System.out.println(emp.altaCamion("Toy", "10", "127", 2000, 20, false, true));
        System.out.println(emp.altaCamion("Toy", "10", "126", 2000, 20, true, false));
        System.out.println(emp.altaCamion("Toy", "10", "125", 2000, 20, false, true));
        System.out.println(emp.camTurisPasKim(11, 20));
        System.out.println(emp.camEscPas(15, 3));
        System.out.println(emp.camionDisp("126"));
        System.out.println(emp.camionDisp("16"));
        System.out.println(emp.camionDisp("185"));
        System.out.println(emp.camEsCapProy());
        System.out.println(emp.servTurisEsp("Toy", 10, 20));
        System.out.println(emp.servTurisEsp("Toy", 25, 20));*/
        llenaArchivo("Camiones");
        System.out.println(reporteCamiones("Camiones"));
    }
    
}
