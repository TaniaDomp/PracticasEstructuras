package escuelacon;
/**Tania Ariadna Dominguez Palma
 * 19/04/2022
 * Clase que describe un Alumno que pertenece a una escuela
 */
public class Alumno {
    private String clave;
    private String nombre;
    private String apellidoM;
    private String apellidoP;
    private String carrera;
    private int edad;
    private double promedio;
    private int semestre;
    
    public Alumno(String clave){
        this.clave = clave;
    }
    
    public Alumno(String clave, String nombre, String apellidoP, String apellidoM, String carrera, int edad, double promedio, int semestre){
        this.clave = clave;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.carrera = carrera;
        this.edad = edad;
        this.promedio = promedio;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public int getSemestre() {
        return semestre;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("Alumno Clave: ");
        cad.append(clave);
        cad.append("\n       Nombre: ");
        cad.append(nombre);
        cad.append("\n       Apellido paterno: ");
        cad.append(apellidoP);
        cad.append("\n       Apellido materno: ");
        cad.append(apellidoM);
        cad.append("\n       Carrera: ");
        cad.append(carrera);
        cad.append("\n       Edad: ");
        cad.append(edad);
        cad.append("\n       Promedio: ");
        cad.append(promedio);
        cad.append("\n       Semestre: ");
        cad.append(semestre);
        return cad.toString();
    }
    
    public boolean equals(Object obj){
        boolean res = false;
        
        if(obj.getClass().getSimpleName().equals("Alumno")){
            res = ((Alumno)obj).clave.equals(this.clave);
        }
        return res;
    }
}
