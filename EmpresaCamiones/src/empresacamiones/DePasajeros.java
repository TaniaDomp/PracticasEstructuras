package empresacamiones;
/**Tania Ariadna Dominguez Palma 
 *09/03/2022
 * Clase que describe a un camion de pasajeros
 */
public class DePasajeros extends Camion{
    private int totPas;
    
    public DePasajeros(String placas){
        super(placas);
    }
    
    public DePasajeros(String marca, String numMotor, String placas, int totPas){
        super(marca, numMotor, placas);
        this.totPas = totPas;
    }

    public int getTotPas() {
        return totPas;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append(super.toString());
        cad.append("\n       Numero de pasajeros: ");
        cad.append(totPas);
        return cad.toString();
    }
}
