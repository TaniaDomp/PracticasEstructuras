package escue;
/*Tania Ariadna Dominguez Palma
 *04/02/2022
 * Clase que describe a un alumno del colegio "los libros al poder"
 */
public class AlumnoSec extends AlumnoBasicInter{
    private String actividadDep;
    
    public AlumnoSec(String curp){
        super(curp);
    }
    
    public AlumnoSec(String nombre, String curp, String fechaNac, String nombreMadre, String nombrePadre, String nombreTutor, String gradoCursa, String escProc, double promAnioAnt, String actividadDep){
        super(nombre, curp, fechaNac, nombreMadre, nombrePadre, nombreTutor, gradoCursa, escProc, promAnioAnt);
        this.actividadDep = actividadDep;
    }

    public String getActividadDep() {
        return actividadDep;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append(super.toString());
        cad.append("\n       Actividad deportiva: ");
        cad.append(actividadDep);
        return cad.toString();
    }
}
