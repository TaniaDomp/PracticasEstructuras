package empresa;
/*Tania Ariadna Dominguez Palma
 *01/02/2022
 * Clase que prueba las clases Empleado, Administrativo y Operario
 */
public class pruebaEmp {
    public static void main(String[] args) {
        Empleado emp;
        Administrativo ad;
        Operario op;
        
        emp = new Operario ("Jose Cardoza", 100, 10);
        System.out.println(emp.toString());
        System.out.println(emp.calculaSalario(10, 10));
        ad = new Administrativo("Monica Toledo", 100, "Finanzas", "5588236974");
        System.out.println(ad.toString());
        System.out.println(ad.calculaSalario(10, 10));
        op = new Operario("Monserat Campos", 100, 5);
        System.out.println(op.toString());
        System.out.println(op.calculaSalario(10, 10, 10));
    }
}
