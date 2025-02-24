package empresacamiones;
/**Tania Ariadna Dominguez Palma 
 *09/03/2022
 * Clase que describe una empresa minera que contiene Camiones
 */
public class EmpresaMinera {
    private String nombreEmpresa;
    private Camion[] camiones;
    private int totCam;
    private final int MAX_CAMION = 50;
    
    public EmpresaMinera(){
        camiones = new Camion[MAX_CAMION];
        totCam = 0;
    }
    
    public EmpresaMinera(String nombreEmpresa){
        this();
        this.nombreEmpresa = nombreEmpresa;
    }
    
    private int busquedaDesordenada(Camion cam){
        int pos = -1, i = 0;
        
        while(i < totCam && !cam.equals(camiones[i]))
            i++;
        if(i < totCam)
            pos = i;
        return pos;
    }
    
    public boolean altaCamion(String marca, String numMotor, String placas, int numPas){
        Camion cam = new DePasajeros(marca, numMotor, placas, numPas);
        boolean alt = false;
        
        if(totCam < camiones.length){
            camiones[totCam] = cam;
            totCam++;
            alt = true;
        }
        return alt;
    }
    
    public boolean altaCamion(String marca, String numMotor, String placas, double capTon){
        Camion cam = new DeVolteo(marca, numMotor, placas, capTon);
        boolean alt = false;
        
        if(totCam < camiones.length){
            camiones[totCam]= cam;
            totCam++;
            alt = true;
        }
        return alt;
    }
    
    public String camionesPasajeros(){
        StringBuilder cad = new StringBuilder();
        
        for(int i = 0; i < totCam; i++){
            if(camiones[i].getClass().getSimpleName().equals("DePasajeros")){
                cad.append(camiones[i].toString());
            }
        }
        return cad.toString();
    }
    
    public boolean cambiaCapTrans(String placa, double capTon){
        Camion camP = new DeVolteo(placa);
        boolean cam = false;
        int pos;
        
        pos = busquedaDesordenada(camP);
        if(pos >= 0 && camiones[pos].getClass().getSimpleName().equals("DeVolteo")){
            ((DeVolteo)camiones[pos]).setCapacidadTon(capTon);
            cam = true;
        }
        return cam;
    }
    
    public int totCamPasMar(String marca){
        int con = 0;
        
        for(int i =0; i < totCam; i++){
            if(camiones[i].getClass().getSimpleName().equals("DePasajeros") && camiones[i].getMarca().equals(marca)){
                con++;
            }
        }
        return con;
    }
    
    public double totTonTierra(){
        double tot = 0;
        
        for(int i = 0; i < totCam; i++){
            if(camiones[i].getClass().getSimpleName().equals("DeVolteo")){
                tot += ((DeVolteo)camiones[i]).getCapacidadTon();
            }
        }
        return tot;
    }
}
