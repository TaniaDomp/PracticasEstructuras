package empresa;
/*Tania Ariadna Dominguez Palma
 *01/02/2022
 * Clase que describe a un empleado que es administrativo
 */
public class Administrativo extends Empleado{
    private String departamento;
    private String telefono;
    
    public Administrativo(){
        
    }
    
    public Administrativo(int clave){
        super(clave);
    }
    
    public Administrativo(String nombreEmpleado, double sueldoBase, String departamento, String telefono){
        super(nombreEmpleado, sueldoBase);
        this.departamento = departamento;
        this.telefono = telefono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append(super.toString());
        cad.append("\n         Departamento: ");
        cad.append(departamento);
        cad.append("\n         Telefono: ");
        cad.append(telefono);
        return cad.toString();
    }
}