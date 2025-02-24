package escue;
/*Tania Ariadna Dominguez Palma
 *04/02/2022
 * Clase que describe a un alumno del colegio "los libros al poder"
 */
public class AlumnoPrep extends AlumnoBasicInter{
    private String areaEspecializacion;
    
    public AlumnoPrep(String curp){
        super(curp);
    }
    
    public AlumnoPrep(String nombre, String curp, String fechaNac, String nombreMadre, String nombrePadre, String nombreTutor, String gradoCursa, String escProc, double promAnioAnt, String areaEspecializacion){
        super(nombre, curp, fechaNac, nombreMadre, nombrePadre, nombreTutor, gradoCursa, escProc, promAnioAnt);
        this.areaEspecializacion = areaEspecializacion;
    }

    public String getAreaEspecializacion() {
        return areaEspecializacion;
    }
    
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append(super.toString());
        cad.append("\n       Area de especializacion: ");
        cad.append(areaEspecializacion);
        return cad.toString();
    }
}
