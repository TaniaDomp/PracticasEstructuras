package empresa;
/*Tania Ariadna Dominguez Palma
 *01/02/2022
 * Clase que prueba la clase empresa
 */
public class pruebaEmpresa {
    public static void main(String[] args) {
        Empresa emp = new Empresa();
        
        System.out.println(emp.altaEmpleado("Juan ramires", 100, "finanzas", "5566028795"));
        System.out.println(emp.altaEmpleado("Pedro Kolo", 100, "finanzas", "5566028795"));
        System.out.println(emp.altaEmpleado("Pedro yum", 100, 5));
        System.out.println(emp.altaEmpleado("Pedro Kilo", 100, 5));
        System.out.println(emp.correcSuelAdmin(100, 10));
        System.out.println(emp.correcSuelAdmin(102, 10));
        System.out.println(emp.correcDepAdmin(101, "finanzas"));
        System.out.println(emp.correcDepAdmin(101, "contaduria"));
        System.out.println(emp.correcDepAdmin(103, "finanzas"));
        System.out.println(emp.sueldoOperario(103, 10, 10, 10));
        System.out.println(emp.sueldoOperario(101, 10, 10, 10));
        System.out.println(emp.operariosEnSueldo(200));
        //System.out.println(emp.operariosEnSueldo(100));
        //System.out.println(emp.correcSuelAdmin(100, 10));
        //System.out.println(emp.datosAdmin());
        //System.out.println(emp.toString());
    }
}
