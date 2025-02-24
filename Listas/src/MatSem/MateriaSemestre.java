package MatSem;
import java.util.Iterator;
import listas.ListaOrdenada;
/**Tania Ariadna Dominguez Palma
 *21/05/2022
 * Clase que describe una materia por semestre que contiene Alumnos y Libros
 */
public class MateriaSemestre {
    private String nombre;
    private String salon;
    private ListaOrdenada<Alumno> alumnos;
    private ListaOrdenada<Libro> libros;
    
    public MateriaSemestre(String nombre, String salon){
        this.nombre = nombre;
        this.salon = salon;
        alumnos = new ListaOrdenada();
        libros = new ListaOrdenada();
    }
    
    public void altaAlumno(String claveU, String nombres, String apellidoP, String apellidoM, double promedio){
        Alumno al = new Alumno(claveU, nombres, apellidoP, apellidoM, promedio);
        
        if(!alumnos.contiene(al)){
            alumnos.agrega(al);
        }
    }
    
    public String quitaAlumno(String clave){
        Alumno al = new Alumno(clave), resp;
        String res = "Alumno no encontrado";
        
        resp = alumnos.quita(al);
        if(resp != null){
            res = resp.toString();
        }
        return res;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }
    
    public void altaLibro(String clave, String nombre, String autor){
        Libro lib = new Libro(clave, nombre, autor);
        
        if(!libros.contiene(lib)){
            libros.agrega(lib);
        }
    }
    
    public String quitaLibro(String clave){
        Libro lib = new Libro(clave), resp;
        String res = "Libro no encontrado";
        
        resp = libros.quita(lib);
        if(resp != null){
            res = resp.toString();
        }
        return res;
    }
    
    public double promedioAlumnos(){
        double promedio = -1, sum = 0;
        
        if(!alumnos.estaVacia()){
            for(Alumno alu: alumnos){
                sum += alu.getPromedio();
            }
            promedio = sum / alumnos.calculaTamanio();
        }
        return promedio;
    }
    
    public String datosAlum(String clave){
        String dat = "Alumno no encontrado";
        Alumno al, a1 = new Alumno(clave);
        boolean res = true;
        Iterator<Alumno> it = alumnos.iterator();
        
        while(it.hasNext() && res){
            al = it.next();
            if(al.equals(a1)){
                dat = al.toString();
                res = false;
            }
        }
        return dat;
    }
    
    public boolean alumnosProm(int n, double promedio){
        boolean res = false;
        int al = 0;
        Iterator<Alumno> it = alumnos.iterator();
        
        while(it.hasNext()){
            if(it.next().getPromedio() > promedio){
                al++;
            }
        }
        if(al >= n){
            res = true;
        }
        return res;
    }
    
    public int librosAutor(String autor){
        int libT = 0;
        Iterator<Libro> lib = libros.iterator();
        
        while(lib.hasNext()){
            if(lib.next().getAutor().equals(autor)){
                libT++;
            }
        }
        return libT;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("Materia del semestre Nombre: ");
        cad.append(nombre);
        cad.append("\n                      Salon: ");
        cad.append(salon);
        cad.append("\n                      Alumnos: ");
        cad.append(alumnos.toString());
        cad.append("\n                      Libros de referencia: ");
        cad.append(libros.toString());
        return cad.toString();
    }
}
