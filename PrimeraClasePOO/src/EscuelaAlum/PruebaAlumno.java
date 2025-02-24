package EscuelaAlum;
/*Tania Ariadna Dominguez Palma
 * 27/01/2022
 * Preuba la clase alumno
 */
public class PruebaAlumno {
    
    public static void main(String[] args) {
        Alumno a1 = new Alumno ("Carlos Dominguez");
        Alumno a2 = new Alumno ("Alondra Rodriguez");
        
        System.out.println(a1.altaCalificacion(10));
        System.out.println(a1.altaCalificacion(5));
        System.out.println(a1.altaCalificacion(8));
        
        System.out.println(a1.calculaPromedio());
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
