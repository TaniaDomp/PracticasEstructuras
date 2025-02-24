package empresacamiones;
/**Tania Ariadna Dominguez Palma 
 *09/03/2022
 * Clase que describe una empresa de camiones escolares y de turismo
 */
public class EmpTransp {
    private String nombre;
    private Camion[] camiones;
    private int totCamio;
    private final int MAX_CAM = 30;
    
    public EmpTransp(){
        camiones = new Camion[MAX_CAM];
        totCamio = 0;
    }
    
    public EmpTransp(String nombre){
        this();
        this.nombre = nombre;
    }
    
    private int busquedaDesordenada(Camion cam){
        int pos = -1, i = 0;
        
        while(i < totCamio && !camiones[i].equals(cam)){
            i++;
        }
        if(i < totCamio){
            pos = i;
        }
        return pos;
    }
    
    public boolean altaCamion(String marca, String numMotor, String placas, double costoCamion, int totPas, boolean asientoCama, boolean serviBar){
        boolean alt = false;
        Camion cam = new Turismo(marca, numMotor, placas, costoCamion, totPas, asientoCama, serviBar);
        int pos;
        
        pos = busquedaDesordenada(cam);
        if(totCamio < camiones.length && pos < 0){
            camiones[totCamio] = cam;
            totCamio++;
            alt = true;
        }
        return alt;
    }
    
    public boolean altaCamion(String marca, String numMotor, String placas, double costoCamion, int totPas, boolean lugarProyec){
        boolean alt = false;
        Camion cam = new Escolar(marca, numMotor, placas, costoCamion, totPas, lugarProyec);
        int pos;
        
        pos = busquedaDesordenada(cam);
        if(totCamio < camiones.length && pos < 0){
            camiones[totCamio] = cam;
            totCamio++;
            alt = true;
        }
        return alt;
    }
    
    public String camTurisPasKim(int canPas, double totKim){
        StringBuilder cad = new StringBuilder();
        double costCam;
        
        for(int i = 0; i < totCamio; i++){
            if(camiones[i].getClass().getSimpleName().equals("Turismo")){
                if(((Turismo)camiones[i]).getTotPas() >= canPas){
                    costCam = ((Turismo)camiones[i]).costoCam(totKim);
                    cad.append(camiones[i].toString());
                    cad.append("\n       Costo por el servicio: " + costCam);
                }
            }
        }
        return cad.toString();
    }
    
    public boolean camEscPas(int canPas, int totCamio){
        int contCam = 0;
        boolean dem = false;
        
        for(int i = 0; i < totCamio; i++){
            if(camiones[i].getClass().getSimpleName().equals("Escolar")){
                if(((Escolar)camiones[i]).getTotPas() == canPas){
                    contCam++;
                }
            }
        }
        if(contCam >= totCamio){
            dem = true;
        }
        return dem;
    }
    
    public String camionDisp(String placa){
        String disCam = "Camion no disponible";
        Camion cam = new Camion(placa);
        int pos;
        
        pos = busquedaDesordenada(cam);
        if(pos >= 0){
            disCam = "Camion disponible de tipo " + camiones[pos].getClass().getSimpleName();
        }
        return disCam;
    }
    
    public String camEsCapProy(){
        StringBuilder cad = new StringBuilder();
        
        for(int i = 0; i < totCamio; i++){
            if(camiones[i].getClass().getSimpleName().equals("Escolar")){
                if(((Escolar)camiones[i]).isLugarProyec() && ((Escolar)camiones[i]).getTotPas()>20){
                    cad.append("\n" + ((Escolar)camiones[i]).getPlacas());
                }
            }
        }
        return cad.toString();
    }
    
    public int servTurisEsp(String marca, double maxPrecio, double kilRer){
        int cont = 0;
        double prec;
        
        for (int i = 0; i < totCamio; i++){
            if(camiones[i].getClass().getSimpleName().equals("Turismo")){
                prec = ((Turismo)camiones[i]).costoServicio(kilRer);
                if(((Turismo)camiones[i]).isServiBar() && ((Turismo)camiones[i]).getMarca().equals(marca) && prec <= maxPrecio){
                    cont++;
                }
            }
        }
        return cont;
    }
}