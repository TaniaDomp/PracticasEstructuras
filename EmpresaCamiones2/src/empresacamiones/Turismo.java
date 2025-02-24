package empresacamiones;
/**Tania Ariadna Dominguez Palma 
 *09/03/2022
 * Clase que describe un camion de turismo
 */
public class Turismo extends DePasajeros{
    private boolean asientoCama;
    private boolean serviBar;
    
    public Turismo(String placas){
        super(placas);
    }
    
    public Turismo(String marca, String numMotor, String placas, double costoCamion, int totPas, boolean asientoCama, boolean serviBar){
        super(marca, numMotor, placas, costoCamion, totPas);
        this.asientoCama = asientoCama;
        this.serviBar = serviBar;
    }

    public boolean isAsientoCama() {
        return asientoCama;
    }

    public boolean isServiBar() {
        return serviBar;
    }
    
    public double costoCam(double totKim){
        double cost;
        
        cost = super.costoServicio(totKim);
        if(asientoCama){
            cost += cost * 0.05;
        }
        if(serviBar){
            cost+= cost * 0.05;
        }
        return cost;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append(super.toString());
        cad.append("\n       Tiene asiento cama: ");
        cad.append(asientoCama);
        cad.append("\n       Tiene servicio de bar: ");
        cad.append(serviBar);
        return cad.toString();
    }
}
