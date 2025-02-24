package escue;
/*Tania Ariadna Dominguez Palma
 *04/02/2022
 * Clase que describe a un alumno del colegio "los libros al poder"
 */
public class AlumnoBasicInter extends Alumno{
    private String escProc;
    private double promAnioAnt;
    private double [] calificaciones;
    private int numCalif;
    private final int MAX_CALIF = 5;
    
    public AlumnoBasicInter(String curp){
        super(curp);
    }
    
    public AlumnoBasicInter(String nombre, String curp, String fechaNac, String nombreMadre, String nombrePadre, String nombreTutor, String gradoCursa, String escProc, double promAnioAnt){
        super(nombre, curp, fechaNac, nombreMadre, nombrePadre, nombreTutor, gradoCursa);
        this.escProc = escProc;
        this.promAnioAnt = promAnioAnt;
        calificaciones = new double[MAX_CALIF];
        numCalif = 0;
    }

    public String getEscProc() {
        return escProc;
    }

    public double getPromAnioAnt() {
        return promAnioAnt;
    }

    public int getNumCalif() {
        return numCalif;
    }
    
    public double calculaPromedio(){
        double sum = 0, prom;
        
        for (int i = 0; i < numCalif; i++){
            sum += calificaciones[i];
        }
        prom = sum / numCalif;
        return prom;
    }
    
    public boolean altaCalif(double calificacion){
        boolean alt = false;
        
        if (numCalif < MAX_CALIF){
            calificaciones[numCalif] = calificacion;
            numCalif++;
            alt = true;
        }
        return alt;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append(super.toString());
        cad.append("\n       Escuela de procedencia: ");
        cad.append(escProc);
        cad.append("\n       Promedio del anio anterior: ");
        cad.append(promAnioAnt);
        cad.append("\n       Calificaciones obtenidas en los " + numCalif + " bimestres: ");
        for (int i=0; i < numCalif; i++){
            cad.append("\n       Calificacion " + i + ": " + calificaciones[i]);
        }
        return cad.toString();
    }
}
