package empresa;
/*Tania Ariadna Dominguez Palma
 *01/02/2022
 * Clase que describe a un empleado que es operario
 */
public class Operario extends Empleado{
    private int horasExtra;
    
    public Operario(){
        
    }
    
    public Operario(int clave){
        super(clave);
    }
    
    public Operario(String nombre, double sueldoBase, int horasExtra){
        super(nombre, sueldoBase);
        this.horasExtra = horasExtra;
    }
    
    public double calculaSalario(double prestac, double deduc, double precioH){
        double sal, hE;
        
        hE = horasExtra * precioH;
        sal = calculaSalario(prestac, deduc) + hE;
        return sal;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append(super.toString());
        cad.append("\n         Horas extra trabajadas: ");
        cad.append(horasExtra);
        return cad.toString();
    }
}