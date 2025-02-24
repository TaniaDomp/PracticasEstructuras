package empresacamiones;
/**Tania Ariadna Dominguez Palma 
 *09/03/2022
 * Clase que describe un camion de volteo
 */
public class DeVolteo extends Camion{
    private double capacidadTon;
    
    public DeVolteo(String placas){
        super(placas);
    }
    
    public DeVolteo(String marca, String numMotor, String placas, double capacidadTon){
        super(marca, numMotor, placas);
        this.capacidadTon = capacidadTon;
    }

    public double getCapacidadTon() {
        return capacidadTon;
    }

    public void setCapacidadTon(double capacidadTon) {
        this.capacidadTon = capacidadTon;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append(super.toString());
        cad.append("\n       Capacidad de toneladas: ");
        cad.append(capacidadTon);
        return cad.toString();
    }
}
