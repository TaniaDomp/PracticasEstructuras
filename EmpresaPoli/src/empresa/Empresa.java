package empresa;

import java.util.Objects;
/*Tania Ariadna Dominguez Palma
 *01/02/2022
 * Clase que describe una Empresa que tiene empleados
 */
public class Empresa {
    private String nombreEmpresa;
    private String direccion;
    private String nombreDuenio;
    private Empleado[] empleados;
    private final int MAX_EMP = 25;
    private int numEmpleados;
    
    public Empresa(){
        empleados = new Empleado[MAX_EMP];
        numEmpleados = 0;
    }
    
    public Empresa(String nombreEmpresa, String direccion, String nombreDuenio){
        this();
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.nombreDuenio = nombreDuenio;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }
    
    private static <T> int busquedaDesordenada(T x, int n, T[]a){
        int pos, i = 0;
		
	while (i < n && !a[i].equals(x)) {
		i++;
	}
	if (i == n) {
            pos = -1;
	}
	else {
            pos = i;
	}
	return pos;
    }
    
    public boolean altaEmpleado(String nombreEmpleado, double sueldoBase, String departamento, String telefono){
        Empleado ad = new Administrativo(nombreEmpleado, sueldoBase, departamento, telefono);
        boolean alta = false;
        int pos;
        
        if (numEmpleados < MAX_EMP){
            pos = busquedaDesordenada(ad, numEmpleados, empleados);
            if(pos < 0){
                empleados[numEmpleados] = ad;
                numEmpleados++;
                alta =  true;
            }
        }
        return alta;
    }
    
    public boolean altaEmpleado(String nombreEmpleado, double sueldoBase, int horasExtra){
        Empleado op = new Operario(nombreEmpleado, sueldoBase, horasExtra);
        boolean alta = false;
        int pos;
        
        if (numEmpleados < MAX_EMP){
            pos = busquedaDesordenada(op, numEmpleados, empleados);
            if(pos < 0){
                empleados[numEmpleados] = op;
                numEmpleados++;
                alta =  true;
            }
        }
        return alta;
    }
    
    private String reporteEmpleados(String nombreC){
        StringBuilder cad = new StringBuilder();
        
        cad.append("Nombre \t - sueldo Base");
        for(int i = 0; i < numEmpleados; i++){
            if(empleados[i].getClass().getSimpleName().equals(nombreC)){
                cad.append("\n" + empleados[i].getNombreEmpleado() + "\t" + empleados[i].getSueldoBase());
            } 
        }
        return cad.toString();
    } 
    
    public String datosAdmin(){
        return reporteEmpleados("Administrativo");
    }
    
    public String datosOperarios(){
        return reporteEmpleados("Operario");
    }
    
    public boolean correcSuelAdmin(int clave, double aumen){
         Empleado ad = new Administrativo(clave);
         int pos;
         boolean suel = false;
         
         pos = busquedaDesordenada(ad, numEmpleados, empleados);
         if (pos >= 0 && empleados[pos].getClass().getSimpleName().equals("Administrativo")){
             empleados[pos].corregirSueldo(aumen);
             suel = true;
         }
         return suel;
    }
    
    public boolean correcDepAdmin(int clave, String departamento){
         Empleado ad = new Administrativo(clave);
         int pos;
         boolean dep = false;
         
         pos = busquedaDesordenada(ad, numEmpleados, empleados);
         if (pos >= 0 && empleados[pos].getClass().getSimpleName().equals("Administrativo")){
             ((Administrativo)empleados[pos]).setDepartamento(departamento);
             dep = true;
         }
         return dep;
    }
    
    public String operariosEnSueldo(double sueldo){
        StringBuilder cad = new StringBuilder();
        int op = 0;
        
        cad.append("Operarios con sueldo menor a " + sueldo);
        for(int i = 0; i < numEmpleados; i++){
            if(empleados[i].getClass().getSimpleName().equals("Operario")){
                if(empleados[i].getSueldoBase() < sueldo){
                    cad.append(empleados[i].toString());
                    op++;
                }
            }
        }
        cad.append("\nCantidad de operarios con el sueldo " + op);
        return cad.toString();
    }
    
    public String sueldoAdministradores(double prestac, double deduc){
        StringBuilder cad = new StringBuilder();
        double suel = 0, suelInd;
        
        cad.append("\nSueldo de administrativos");
        for(int i = 0; i < numEmpleados; i++){
            if(empleados[i].getClass().getSimpleName().equals("Administrativo")){
                suelInd = empleados[i].calculaSalario(prestac, deduc);
                cad.append("\n Sueldo de administrativo " + i + ": " + suelInd);
                suel += suelInd;
            }
        }
        cad.append("\n Nomina total: " + suel);
        return cad.toString();
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("\nEmpresa Nombre:");
        cad.append(nombreEmpresa);
        cad.append("\n        Direccion:");
        cad.append(direccion);
        cad.append("\n        Nombre duenio:");
        cad.append(nombreDuenio);
        cad.append("\n        Empleados:");
        for(int j = 0; j < numEmpleados; j++){
            cad.append(empleados[j].toString());
        }
        return cad.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.direccion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Empresa otra = (Empresa) obj;
        return this.direccion.equals(otra.direccion);
    }
}