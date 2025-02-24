package EscuelaAlum;
/*Tania Ariadna Dominguez Palma
 * 27/01/2022
 * Preuba la clase Escuela
 */
public class PruebaEscuela {
    public static void main(String[] args) {
        Escuela esc = new Escuela("ITAM", "Rio Hondo");
        
        System.out.println(esc.altaAlumno("Jose Ramirez"));
        System.out.println(esc.altaAlumno("Miguel Morales"));
        System.out.println(esc.altaCalificacion(100, 10));
        System.out.println(esc.altaCalificacion(100, 5));
        System.out.println(esc.altaCalificacion(100, 6));
        System.out.println(esc.altaCalificacion(101, 10));
        System.out.println(esc.alumnoMasAprobadas());
        //System.out.println(esc.datosAlumnos());
        //System.out.println(esc.getUnAlumno(100));
        //System.out.println(esc.bajaAlumno(100));
        //System.out.println(esc.toString());
    }
}