package escue;
/*Tania Ariadna Dominguez Palma
 *04/02/2022
 * Clase que prueba las clases de alumnos
 */
public class PruebaAlum {
    public static void main(String[] args) {
        Alumno alum = new Alumno("Jose Ramirez", "005212582", "25/08/2017", "Maria Olvera", "Jose Ramirez", "", "Escolar");
        AlumnoBasicInter alum1 = new AlumnoBasicInter("Maria Martinez", "005212588", "25/08/2018", "Maria Olvera", "Jose Ramirez", "", "Escolar", "GPFA", 9.56);
        AlumnoSec alum2 = new AlumnoSec("Maria Martinez", "005212588", "25/08/2018", "Maria Olvera", "Jose Ramirez", "", "Escolar", "GPFA", 9.56, "futbol");
        
        System.out.println(alum1.altaCalif(8));
        System.out.println(alum1.altaCalif(8));
        System.out.println(alum1.altaCalif(8));
        System.out.println(alum1.altaCalif(8));
        System.out.println(alum1.altaCalif(8));
        System.out.println(alum1.altaCalif(8));
        System.out.println(alum2.altaCalif(8));
        System.out.println(alum.toString());
        System.out.println(alum1.toString());
        System.out.println(alum2.toString());
    }
}
