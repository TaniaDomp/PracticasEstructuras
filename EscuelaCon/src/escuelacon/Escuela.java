package escuelacon;
import java.util.Iterator;
/**Tania Ariadna Dominguez Palma
 * 19/04/2022
 * Clase que describe esceula con dos colas de alumnos
 */
public class Escuela {
    private String nombre;
    private String direccion;
    private ConjuntoADT<Alumno> ingenieros;
    private ConjuntoADT<Alumno> licenciatura;
    
    public Escuela(){
        ingenieros = new ConjuntoA();
        licenciatura = new ConjuntoA();
    }
    
    public Escuela(String nombre, String direccion){
        this();
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public boolean agregaAlumno(String clave, String nombre, String apellidoP, String apellidoM, String carrera, int edad, double promedio, int semestre){
        boolean alt;
        Alumno al = new Alumno(clave, nombre, apellidoP, apellidoM, carrera, edad, promedio, semestre);
        
        if(al.getCarrera().toLowerCase().contains("ingenieria")){
            alt = ingenieros.agrega(al);
        }
        else{
            alt = licenciatura.agrega(al);
        }
        return alt;
    }
    
    public String quitaAlumno(String clave){
        Alumno al = new Alumno(clave);
        Alumno dat;
        String alu = "Alumno no encontrado";
        
        if(ingenieros.contiene(al)){
            dat = ingenieros.elimina(al);
        }
        else{
            dat = licenciatura.elimina(al);
        }
        if(dat != null){
            alu = dat.toString();
        }
        return alu;
    }
    
    public String todosAlum(){
        return ingenieros.union(licenciatura).toString();
    }
    
    public String alumLicIng(){
        return licenciatura.interseccion(ingenieros).toString();
    }
    
    public ConjuntoADT<Alumno> alumSolIngYLic(){
        ConjuntoADT<Alumno> conIng;
        //ConjuntoADT<Alumno> conLic = new ConjuntoA();
        ConjuntoADT<Alumno> totAlum;
        
        /*conIng = ingenieros.diferencia(licenciatura);
        conLic = licenciatura.diferencia(ingenieros);
        totAlum = conIng.union(conLic);*/
        conIng = licenciatura.interseccion(ingenieros);
        totAlum = licenciatura.union(ingenieros);
        return totAlum.diferencia(conIng);
    }
    
    public double promIng(){
        double prom = 0;
        Iterator<Alumno> it; 
        
        it = ingenieros.iterator();
        if(!ingenieros.estaVacio()){
            while(it.hasNext()){
                prom += it.next().getPromedio();
            }
            prom /= ingenieros.getCardinalidad();
        }
        else{
            prom = -1;
        }
        return prom;
    }
    
    public int alumLicMayEd(int edad){
        int cont = 0;
        Iterator<Alumno> it;
        
        it = licenciatura.iterator();
        while(it.hasNext()){
            if(it.next().getEdad() > edad){
                cont++;
            }
        }
        return cont;
    }
}
