package MatSem;
/**Tania Ariadna Dominguez Palma
 *21/05/2022
 * Clase que prueba las clases Alumno y libro
 */
public class PruebasMatSem {
    
    public static void main(String[] args) {
        /*Alumno al, al2;
        Libro l1, l2;*/
        MateriaSemestre mat = new MateriaSemestre("Mate", "201");
        
        /*al = new Alumno("100", "Carlos", "Rodriguez", "Sanchez", 9.45);
        al2 = new Alumno("101", "Julia", "Perez", "Carl", 9.5);
        System.out.println(al.equals(al2));
        System.out.println(al.equals(al));
        System.out.println(al);
        System.out.println(al2);*/
        /*l1 = new Libro("100", "Verde", "Juan");
        l2 = new Libro("101", "Verde", "Pedro");
        System.out.println(l1.equals(l2));
        System.out.println(l2.equals(l2));
        System.out.println(l1);
        System.out.println(l2);*/
        
        mat.altaAlumno("100", "Carlos", "Rodriguez", "Sanchez", 9.45);
        mat.altaAlumno("100", "Carlos", "Rodriguez", "Sanchez", 9.45);
        mat.altaAlumno("101", "Julia", "Perez", "Carl", 9.5);
        mat.altaLibro("501", "Arbol", "Jose al");
        mat.altaLibro("502", "Parla", "Jose al");
        mat.altaLibro("501", "Arbol", "Jose al");
        /*System.out.println(mat);
        System.out.println(mat.alumnosProm(2, 9.4));
        System.out.println(mat.datosAlum("10"));
        System.out.println(mat.datosAlum("100"));*/
        /*System.out.println(mat.librosAutor("Jose al"));
        System.out.println(mat.librosAutor("Jose"));*/
        //System.out.println(mat.promedioAlumnos());
        mat.setSalon("512");
        System.out.println(mat.quitaAlumno("10"));
        System.out.println(mat.quitaAlumno("100"));
        System.out.println(mat.quitaLibro("50"));
        System.out.println(mat.quitaLibro("501"));
        System.out.println(mat);
    }
    
}
