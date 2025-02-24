package EscuelaAlum;

import java.util.Objects;

/*Tania Ariadna Dominguez Palma
 * 27/01/2022
 * Clase que tiene 
 */
public class Escuela {
    private String nombre;
    private String direccion;
    private Alumno[] alumnos;
    private int numAlumnos;
    private final int MAX_ALUM = 50;
    
    public Escuela(){
        alumnos = new Alumno[MAX_ALUM];
        numAlumnos = 0;
    }
    
    public Escuela(String nombre, String direccion){
        this();
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    private static <T> int busquedaDesordenada(T x, int n, T[]a){
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
    
    public boolean altaAlumno(String nombre){
        Alumno al1 = new Alumno(nombre);
        int pos;
        boolean alta = false;
        
        if(numAlumnos < MAX_ALUM){
            pos = busquedaDesordenada(al1, numAlumnos, alumnos);
            if(pos < 0){
                alumnos[numAlumnos] = al1;
                numAlumnos++;
                alta = true;
            }
        }
        return alta;
    }
    
    public boolean altaCalificacion(int clave, double calificacion){
        Alumno al1;
        int pos;
        boolean alta = false;
        
        al1 = new Alumno(clave);
        pos = busquedaDesordenada(al1, numAlumnos, alumnos);
        if (pos >= 0){
            alta = alumnos[pos].altaCalificacion(calificacion);
        }
        return alta;
    }
    
    public String bajaAlumno(int clave){
        String alumno = "Alumno no encontrado";
        Alumno al1;
        int pos;
        
        al1 = new Alumno(clave);
        pos = busquedaDesordenada(al1, numAlumnos, alumnos);
        if (pos >= 0){
            alumno = alumnos[pos].toString();
            for(int i = pos; i < numAlumnos - 1; i++){
            alumnos[i] = alumnos[i+1];    
            }
            numAlumnos--;
            alumnos[numAlumnos] = null;
        }
        return alumno;
    }
    
    public String getUnAlumno(int clave){
        String alumno = "Alumno no encontrado";
        Alumno al1;
        int pos;
        
        al1 = new Alumno(clave);
        pos = busquedaDesordenada(al1, numAlumnos, alumnos);
        if(pos >= 0){
            alumno = alumnos[pos].toString();
        }
        return alumno;
    }
    
    public String datosAlumnos(){
        StringBuilder cad = new StringBuilder();
        double prom;
        
        cad.append("Nombre \t -  Promedio \n");
        for (int i = 0; i < numAlumnos; i++){
            prom = alumnos[i].calculaPromedio();
            cad.append(alumnos[i].getNombreAlum() + "\t" + prom + "\n");
        }
        return cad.toString();
    }
    
    public String alumnoMasAprobadas(){
        String alumno = alumnos[0].getNombreAlum();
        int matAlum = alumnos[0].getTotalCalif();
        int i = 1;
        
        while(i < numAlumnos && matAlum > alumnos[i].getTotalCalif()){
            i++;
        }
        if(i < numAlumnos){
            alumno = alumnos[i].getNombreAlum();
        }
        return alumno;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("Escuela Nombre: ");
        cad.append(nombre);
        cad.append("\n        Direccion: ");
        cad.append(direccion);
        cad.append("\n        Total de alumnos: ");
        cad.append(numAlumnos);
        for (int i = 0; i < numAlumnos; i++){
            cad.append("\n        Alumno " + i + ": ");
            cad.append(alumnos[i]);
        }
        return cad.toString();
    }
    
    public int compareTo(Escuela otro){
        return this.direccion.compareTo(otro.direccion);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.direccion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Escuela other = (Escuela) obj;
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        return true;
    }
}