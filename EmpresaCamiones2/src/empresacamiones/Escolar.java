package empresacamiones;
/**Tania Ariadna Dominguez Palma 
 *09/03/2022
 * Clase que describe un camion escolar
 */
public class Escolar extends DePasajeros{
    private boolean lugarProyec;
    
    public Escolar(String placas){
        super(placas);
    }
    
    public Escolar(String marca, String numMotor, String placas, double costoCamion, int totPas, boolean lugarProyec){
        super(marca, numMotor, placas, costoCamion, totPas);
        this.lugarProyec = lugarProyec;
    }

    public boolean isLugarProyec() {
        return lugarProyec;
    }
    
    public double costoCam(){
        double cost;
        
        cost = (super.getCostoCamion()*0.01) / super.getTotPas() * 250;
        return cost;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append(super.toString());
        cad.append("\n       Tiene lugar de proyecto: ");
        cad.append(lugarProyec);
        return cad.toString();
    }
}
