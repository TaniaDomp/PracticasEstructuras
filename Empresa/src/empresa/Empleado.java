package empresa;
/*Tania Ariadna Dominguez Palma
 *01/02/2022
 * Clase que describe a un empleado
 */
public class Empleado {
    private static int serie = 100;
    private int claveEm;
    private String nombreEmpleado;
    private double sueldoBase;
    
    public Empleado(){
    }
    
    public Empleado(int claveEm){
        this.claveEm = claveEm;
    }
    
    public Empleado(String nombreEmpleado, double sueldoBase){
        this();
        this.nombreEmpleado = nombreEmpleado;
        this.sueldoBase = sueldoBase;
        this.claveEm = serie;
        serie++;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }
    
    public void corregirSueldo(double aumen){
        double suel;
        
        suel = (sueldoBase*aumen) / 100;
        sueldoBase+=suel;
    }
    
    public double calculaSalario(double prestac, double deduc){
        double sal, pres, ded;
        
        pres = sueldoBase * prestac;
        ded = sueldoBase * deduc;
        sal = sueldoBase + pres - ded;
        return sal;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("\nEmpleado Clave: ");
        cad.append(claveEm);
        cad.append("\n         Nombre: ");
        cad.append(nombreEmpleado);
        cad.append("\n         Sueldo Base: ");
        cad.append(sueldoBase);
        return cad.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.claveEm;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Empleado otro = (Empleado) obj;
        boolean eq = false;
        
        if(this.claveEm - otro.claveEm == 0){
         eq = true;   
        }
        return eq;
    }
    
    /*
    equals(Object obj)
    Clase otra = (Clase) obj;
    return this.atributo.equals(otra.atributo);
    */
}