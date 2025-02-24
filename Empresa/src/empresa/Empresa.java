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
    private Administrativo[] administrativos;
    private Operario[] operarios;
    private final int MAX_EMP = 50;
    private int numAdmin;
    private int numOp;
    
    public Empresa(){
        administrativos = new Administrativo[MAX_EMP];
        operarios = new Operario[MAX_EMP];
        numAdmin = 0;
        numOp = 0;
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

    public int getNumAdmin() {
        return numAdmin;
    }

    public int getNumOp() {
        return numOp;
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
        Administrativo ad = new Administrativo(nombreEmpleado, sueldoBase, departamento, telefono);
        boolean alta = false;
        int pos;
        
        if (numAdmin < MAX_EMP){
            pos = busquedaDesordenada(ad, numAdmin, administrativos);
            if(pos < 0){
                administrativos[numAdmin] = ad;
                numAdmin++;
                alta =  true;
            }
        }
        return alta;
    }
    
    public boolean altaEmpleado(String nombreEmpleado, double sueldoBase, int horasExtra){
        Operario op = new Operario(nombreEmpleado, sueldoBase, horasExtra);
        boolean alta = false;
        int pos;
        
        if (numAdmin < MAX_EMP){
            pos = busquedaDesordenada(op, numOp, operarios);
            if(pos < 0){
                operarios[numOp] = op;
                numOp++;
                alta =  true;
            }
        }
        return alta;
    }
    
    public String datosAdmin(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("Nombre \t - sueldo Base");
        for(int i = 0; i < numAdmin; i++){
            cad.append("\n" + administrativos[i].getNombreEmpleado() + "\t" + administrativos[i].getSueldoBase());
        }
        return cad.toString();
    } 
    
    public boolean correcSuelAdmin(int clave, double aumen){
         Administrativo ad = new Administrativo(clave);
         int pos;
         boolean suel = false;
         
         pos = busquedaDesordenada(ad, numAdmin, administrativos);
         if (pos >= 0){
             administrativos[pos].corregirSueldo(aumen);
             suel = true;
         }
         return suel;
    }
    
    public boolean correcDepAdmin(int clave, String departamento){
         Administrativo ad = new Administrativo(clave);
         int pos;
         boolean dep = false;
         
         pos = busquedaDesordenada(ad, numAdmin, administrativos);
         if (pos >= 0 && !administrativos[pos].getDepartamento().equals(departamento)){
             administrativos[pos].setDepartamento(departamento);
             dep = true;
         }
         return dep;
    }
    
    public double sueldoOperario(int clave, double prestac, double deduc, double precioH){
        Operario op = new Operario(clave);
        int pos;
        double salario = -1;
        
        pos = busquedaDesordenada(op, numOp, operarios);
        if(pos >= 0){
            salario = operarios[pos].calculaSalario(prestac, deduc, precioH);
        }
        return salario;
    }
    
    public String operariosEnSueldo(double sueldo){
        StringBuilder cad = new StringBuilder();
        int op = 0;
        
        cad.append("Operarios con sueldo menor a " + sueldo);
        for(int i = 0; i < numOp; i++){
            if(operarios[i].getSueldoBase() < sueldo){
                cad.append(operarios[i].toString());
                op++;
            }
        }
        cad.append("Cantidad de operarios con el sueldo " + op);
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
        cad.append("\n        Administrativos:");
        for(int i = 0; i < numAdmin; i++){
            cad.append(administrativos[i].toString());
        }
        cad.append("\n        Operarios:");
        for(int j = 0; j < numOp; j++){
            cad.append(operarios[j].toString());
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