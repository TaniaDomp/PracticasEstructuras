package empresacamiones;
import java.io.Serializable;

/**Tania Ariadna Dominguez Palma 
 *09/03/2022
 * Clase que describe un camion 
 */
public class Camion implements Serializable{
    private String marca;
    private String numMotor;
    private String placas;
    private double costoCamion;
    
    public Camion(String placas){
        this.placas = placas;
    }
    
    public Camion(String marca, String numMotor, String placas, double costoCamion){
        this.marca = marca;
        this.numMotor = numMotor;
        this.placas = placas;
        this.costoCamion = costoCamion;
    }

    public String getMarca() {
        return marca;
    }

    public String getNumMotor() {
        return numMotor;
    }

    public String getPlacas() {
        return placas;
    }
    
    public double getCostoCamion(){
        return costoCamion;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("\nCamion Marca: ");
        cad.append(marca);
        cad.append("\n       Numero de motores: ");
        cad.append(numMotor);
        cad.append("\n       Placas: ");
        cad.append(placas);
        cad.append("\n       Costo del camion: ");
        cad.append(placas);
        return cad.toString();
    }
    
    public boolean equals(Object obj){
        boolean res = false;
        
        if(obj != null && obj instanceof Camion){
            res = this.placas.equals(((Camion)obj).placas);
        }
        return res;
    }
}
