package escue;

/*Tania Ariadna Dominguez Palma
 *04/02/2022
 * Clase que describe a un alumno del colegio "los libros al poder"
 */
public class Alumno {
    private String nombre;
    private String curp;
    private String fechaNac;
    private String nombreMadre;
    private String nombrePadre;
    private String nombreTutor;
    private String gradoCursa;
    
    public Alumno(String curp){
        this.curp = curp;
    }
    
    public Alumno(String nombre, String curp, String fechaNac, String nombreMadre, String nombrePadre, String nombreTutor, String gradoCursa){
        this.nombre = nombre;
        this.curp = curp;
        this.fechaNac = fechaNac;
        this.nombreMadre = nombreMadre;
        this.nombrePadre = nombrePadre;
        this.nombreTutor = nombreTutor;
        this.gradoCursa = gradoCursa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurp() {
        return curp;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public String getNombreTutor() {
        return nombreTutor;
    }

    public String getGradoCursa() {
        return gradoCursa;
    }

    public void setGradoCursa(String gradoCursa) {
        this.gradoCursa = gradoCursa;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("\nAlumno Nombre: ");
        cad.append(nombre);
        cad.append("\n       CURP: ");
        cad.append(curp);
        cad.append("\n       Fecha de nacimiento: ");
        cad.append(fechaNac);
        cad.append("\n       Nombre de la madre: ");
        cad.append(nombreMadre);
        cad.append("\n       Nombre del padre: ");
        cad.append(nombrePadre);
        cad.append("\n       Nombre del tutor: ");
        cad.append(nombreTutor);
        cad.append("\n       Grado que cursa: ");
        cad.append(gradoCursa);
        return cad.toString();
    }
    
    public boolean equals(Object obj){
        Alumno otro = (Alumno) obj;
        return this.curp.equals(otro.curp);
    }
}