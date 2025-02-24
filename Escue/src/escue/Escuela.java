package escue;
/*Tania Ariadna Dominguez Palma
 *04/02/2022
 * Clase que describe al colegio "los libros al poder"
 */
public class Escuela {
    private String nombre;
    private String direccion;
    private Alumno[] kinder;
    private AlumnoBasicInter[] primaria;
    private AlumnoSec[] secundaria;
    private AlumnoPrep[] preparatoria;
    private int numKinder;
    private int numPrimaria;
    private int numSecundaria;
    private int numPreparatoria;
    private final int MAX_EST = 50;
    
    public Escuela(){
        kinder = new Alumno[MAX_EST];
        primaria = new AlumnoBasicInter[MAX_EST];
        secundaria = new AlumnoSec[MAX_EST];
        preparatoria = new AlumnoPrep[MAX_EST];
        numKinder = 0;
        numPrimaria = 0;
        numSecundaria = 0;
        numPreparatoria = 0;
    }
    
    public Escuela (String nombre, String direccion){
        this();
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    private <T> int busquedaDesordenada(T x, int n, T[]a){
        int pos, i = 0;
		
	while (i < n && !a[i].equals(x)) {
		i++;
	}
	if (i == n) {
            pos = -1;
	}
	else {
            pos = i;
	}
	return pos;
    }
    
    public boolean altaAlumno(String nombre, String curp, String fechaNac, String nombreMadre, String nombrePadre, String nombreTutor, String gradoCursa){
        Alumno al = new Alumno(nombre, curp, fechaNac, nombreMadre, nombrePadre, nombreTutor, gradoCursa);
        boolean alta = false;
        int pos;
        
        if (numKinder < MAX_EST){
            pos = busquedaDesordenada(al, numKinder, kinder);
            if(pos < 0){
                kinder[numKinder] = al;
                numKinder++;
                alta =  true;
            }
        }
        return alta;
    }
    
    public boolean altaAlumno(String nombre, String curp, String fechaNac, String nombreMadre, String nombrePadre, String nombreTutor, String gradoCursa, String escProc, double promAnioAnt){
        AlumnoBasicInter al = new AlumnoBasicInter(nombre, curp, fechaNac, nombreMadre, nombrePadre, nombreTutor, gradoCursa, escProc, promAnioAnt);
        boolean alta = false;
        int pos;
        
        if (numPrimaria < MAX_EST){
            pos = busquedaDesordenada(al, numPrimaria, primaria);
            if(pos < 0){
                primaria[numPrimaria] = al;
                numPrimaria++;
                alta =  true;
            }
        }
        return alta;
    }
    
    public boolean altaAlumno(String nombre, String curp, String fechaNac, String nombreMadre, String nombrePadre, String nombreTutor, String gradoCursa, String escProc, double promAnioAnt, String actividadDep){
        AlumnoSec al = new AlumnoSec(nombre, curp, fechaNac, nombreMadre, nombrePadre, nombreTutor, gradoCursa, escProc, promAnioAnt, actividadDep);
        boolean alta = false;
        int pos;
        
        if (numSecundaria < MAX_EST){
            pos = busquedaDesordenada(al, numSecundaria, secundaria);
            if(pos < 0){
                secundaria[numSecundaria] = al;
                numSecundaria++;
                alta =  true;
            }
        }
        return alta;
    }
    
    public boolean altaAlumnoP(String nombre, String curp, String fechaNac, String nombreMadre, String nombrePadre, String nombreTutor, String gradoCursa, String escProc, double promAnioAnt, String areaEspecializacion){
        AlumnoPrep al = new AlumnoPrep(nombre, curp, fechaNac, nombreMadre, nombrePadre, nombreTutor, gradoCursa, escProc, promAnioAnt, areaEspecializacion);
        boolean alta = false;
        int pos;
        
        if (numPreparatoria < MAX_EST){
            pos = busquedaDesordenada(al, numPreparatoria, preparatoria);
            if(pos < 0){
                preparatoria[numPreparatoria] = al;
                numPreparatoria++;
                alta =  true;
            }
        }
        return alta;
    }
    
    public boolean altaCalificacion(String curp, double calif, String escu){
        boolean alt = false;
        int pos;
        
        if (escu.equals("primaria")){
            AlumnoBasicInter al = new AlumnoBasicInter(curp);
            pos = busquedaDesordenada(al, numPrimaria, primaria);
            if(pos >= 0){
                alt = primaria[pos].altaCalif(calif);
            }
        }
        else{
            if (escu.equals("secundaria")){
                AlumnoSec al = new AlumnoSec(curp);
                    pos = busquedaDesordenada(al, numSecundaria, secundaria);
                    if(pos >= 0){
                        alt = secundaria[pos].altaCalif(calif);
                    }
            }
            else{
                if (escu.equals("preparatoria")){
                    AlumnoPrep al = new AlumnoPrep(curp);
                    pos = busquedaDesordenada(al, numPreparatoria, preparatoria);
                    if(pos >= 0){
                        alt = preparatoria[pos].altaCalif(calif);
                    }
                }
            }
        }
        return alt;
    }
    
    public String datosKinder(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("\n        " + numKinder + " alumnos del kinder: ");
        for (int a = 0; a < numKinder; a++){
            cad.append("\n        Alumno " + numKinder + ": " + kinder[numKinder].toString());
        }
        return cad.toString();
    }
    
    public String datosPrimaria(){
        StringBuilder cad = new StringBuilder();
      
        cad.append("\n        " + numPrimaria + " alumnos de la primaria: ");
        for (int a = 0; a < numKinder; a++){
            cad.append("\n        Alumno " + numPrimaria + ": " + primaria[numPrimaria].toString());
        }
        return cad.toString();
    }
    
    public String datosSecundaria(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("\n        " + numSecundaria + " alumnos de la secundaria: ");
        for (int a = 0; a < numKinder; a++){
            cad.append("\n        Alumno " + numSecundaria + ": " + secundaria[numSecundaria].toString());
        }
        return cad.toString();
    }
    
    public String datosPreparatoria(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("\n        " + numPreparatoria + " alumnos de la preparatoria: ");
        for (int a = 0; a < numKinder; a++){
            cad.append("\n        Alumno " + numPreparatoria + ": " + preparatoria[numPreparatoria].toString());
        }
        return cad.toString();
    }
    
    public String alumnosPrimariaEsc(String esc){
        StringBuilder cad = new StringBuilder();
        int cont = 0;
        
        cad.append("\nAlumnos de la primaria con la misma escuela de procedencia");
        for (int i = 0; i < numPrimaria; i++){
            if (primaria[i].getEscProc().equals(esc)){
                cad.append("\n" + primaria[i].toString());
                cont++;
            }
        }
        cad.append("\nTotal de alumnos: " + cont);
        return cad.toString();
    }
    
    public String alumnosSecPromTut(){
        StringBuilder cad = new StringBuilder();
        int cont = 0;
        
        cad.append("\nAlumnos de la secundaira con promedio mayor a 9 y que estan a cargo de un tutor");
        for (int i =0; i < numSecundaria; i++){
            if (secundaria[i].calculaPromedio() > 9 && !primaria[i].getNombreTutor().isEmpty()){
                cont++;
                cad.append("\n" + secundaria[i].toString());
            }
        }
        cad.append("\nTotal de alumnos: " + cont);
        return cad.toString();
    }
    
    public String alumnosPrepPromArea1(){
        StringBuilder cad = new StringBuilder();
        int cont = 0;
        
        cad.append("\nAlumnos de la preparatoria con promedio mayor a 9 y que estan en area 1");
        for (int i = 0; i < numPreparatoria; i++){
            if (preparatoria[i].calculaPromedio()>9 && preparatoria[i].getAreaEspecializacion().equals("Area 1")){
                cont++;
                cad.append("\n" + preparatoria[i].toString());
            }
        }
        cad.append("\nTotal de alumnos: " + cont);
        return cad.toString();
    }
    
    public String alumno(String nombre, String escu){
        String alumno = "alumno no encontrado";
        int i = 0;
        
        if (escu.equals("primaria")){
            while(i < numPrimaria && !primaria[i].getNombre().equals(nombre)){
                i++;
            }
            if(i < numPrimaria){
                alumno = primaria[i].toString();
            }
        }
        else{
            if (escu.equals("secundaria")){
                while(i < numSecundaria && !secundaria[i].getNombre().equals(nombre)){
                    i++;
                }
                if(i < numSecundaria){
                    alumno = secundaria[i].toString();
                }
            }
            else{
                if (escu.equals("preparatoria")){
                    while(i < numPreparatoria && !preparatoria[i].getNombre().equals(nombre)){
                        i++;
                    }
                    if(i < numPreparatoria){
                        alumno = preparatoria[i].toString();
                    }
                }
                else{
                    while(i < numKinder && !kinder[i].getNombre().equals(nombre)){
                        i++;
                    }
                    if(i < numKinder){
                        alumno = kinder[i].toString();
                    }
                }
            }
        }
        return alumno;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("\nEscuela Nombre");
        cad.append(nombre);
        cad.append("\n        Direccion");
        cad.append(direccion);
        cad.append("\n        Alumnos de la escuela: ");
        cad.append("\n        " + numKinder + " alumnos del kinder: ");
        for (int a = 0; a < numKinder; a++){
            cad.append("\n        Alumno " + numKinder + ": " + kinder[numKinder].toString());
        }
        cad.append("\n        " + numPrimaria + " alumnos de la primaria: ");
        for (int a = 0; a < numKinder; a++){
            cad.append("\n        Alumno " + numPrimaria + ": " + primaria[numPrimaria].toString());
        }
        cad.append("\n        " + numSecundaria + " alumnos de la secundaria: ");
        for (int a = 0; a < numKinder; a++){
            cad.append("\n        Alumno " + numSecundaria + ": " + secundaria[numSecundaria].toString());
        }
        cad.append("\n        " + numPreparatoria + " alumnos de la preparatoria: ");
        for (int a = 0; a < numKinder; a++){
            cad.append("\n        Alumno " + numPreparatoria + ": " + preparatoria[numPreparatoria].toString());
        }
        return cad.toString();
    }
    
    public boolean equals(Object obj){
        Escuela otra = (Escuela) obj;
        return this.direccion.equals(otra.direccion);
    }
}
