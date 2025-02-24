package escuelacon;
/**Tania Ariadna Dominguez Palma
 * 19/04/2022
 * Clase que prueba las clases Escuela y Alumno
 */
public class EscuelaCon {

    public static void main(String[] args) {
        //Alumno al, al2;
        Escuela esc = new Escuela();
        ConjuntoADT<Alumno> cad = new ConjuntoA();
        
        /*al = new Alumno("152036", "Joaquin", "Domp", "Palm", "ingenieria comp", 19, 9.2, 5);
        al2 = new Alumno("152038", "Joaquin", "Domp", "Palm", "ingenieria comp", 19, 9.2, 5);
        System.out.println(al.toString());
        System.out.println(al2.toString());
        System.out.println(al.equals(al2));
        System.out.println(al.equals(al));*/
        System.out.println(esc.agregaAlumno("152036", "Pedro", "Domp", "Palm", "ingenieria comp", 19, 9.2, 5));
        System.out.println(esc.agregaAlumno("152038", "Joaquin", "Domp", "Palm", "ingenieria comp", 19, 9.2, 5));
        System.out.println(esc.agregaAlumno("152039", "Juan", "Domp", "Palm", "ingenieria comp", 19, 9.2, 5));
        System.out.println(esc.agregaAlumno("152040", "Joaquin", "Domp", "Palm", "licenciatura comp", 19, 9.2, 5));
        System.out.println(esc.agregaAlumno("152040", "Joaquin", "Domp", "Palm", "ingenieria comp", 19, 9.2, 5));
        System.out.println(esc.agregaAlumno("152060", "Tania", "Domp", "Palm", "ingenieria comp", 19, 9.2, 5));
        System.out.println(esc.agregaAlumno("152060", "Tania", "Domp", "Palm", "licenciatura comp", 19, 9.2, 5));
        System.out.println(esc.agregaAlumno("152070", "Marijo", "Domp", "Palm", "ingenieria comp", 19, 9.2, 5));
        System.out.println(esc.agregaAlumno("152070", "Marijo", "Domp", "Palm", "licenciatura comp", 19, 9.2, 5));
        System.out.println(esc.agregaAlumno("152050", "Karla", "Domp", "Palm", "licenciatura comp", 19, 9.2, 5));
        System.out.println(esc.agregaAlumno("152052", "Lopez", "Domp", "Palm", "licenciatura comp", 21, 9.2, 5));
        System.out.println(esc.agregaAlumno("152080", "Giovanni", "Domp", "Palm", "ingenieria comp", 19, 9.2, 5));
        System.out.println(esc.agregaAlumno("152081", "Abraham", "Domp", "Palm", "ingenieria comp", 19, 9.2, 5));
        //System.out.println(esc.quitaAlumno("152040"));
        //System.out.println(esc.quitaAlumno("152040"));
        //System.out.println(esc.quitaAlumno("152048"));
        //System.out.println(esc.todosAlum());
        //System.out.println(esc.alumLicIng());
        cad = esc.alumSolIngYLic();
        System.out.println(cad.getCardinalidad());
        System.out.println(esc.promIng());
        System.out.println(esc.alumLicMayEd(20));
    }
    
}
