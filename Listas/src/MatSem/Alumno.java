package MatSem;
import java.util.NoSuchElementException;
/**Tania Ariadna Dominguez Palma
 *21/05/2022
 * Clase que describe a un Alumno
 */
public class Alumno implements Comparable<Alumno>{
    private String claveU;
    private String nombres;
    private String apellidoP;
    private String apellidoM;
    private double promedio;
    
    public Alumno(String claveU){
        this.claveU= claveU;
    }
    
    public Alumno(String claveU, String nombres, String apellidoP, String apellidoM, double promedio){
        this.claveU = claveU;
        this.nombres = nombres;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.promedio = promedio;
    }

    public String getClaveU() {
        return claveU;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("Alumno Clave unica: ");
        cad.append(claveU);
        cad.append("\n       Nombre: ");
        cad.append(nombres);
        cad.append("\n       Apellido Paterno: ");
        cad.append(apellidoP);
        cad.append("\n       Apellido Materno: ");
        cad.append(apellidoM);
        cad.append("\n       Promedio: ");
        cad.append(promedio);
        return cad.toString();
    }
    
    public boolean equals(Object obj){
        boolean res = false;
        
        if(obj.getClass().equals(this.getClass())){
            Alumno ot = (Alumno)obj;
            res = this.claveU.equals(ot.claveU);
        }
        return res;
    }

    public int compareTo(Alumno al) {
        return this.claveU.compareTo(al.claveU);
    }
}
