package objvolinter;
/*Tania Ariadna Dominguez Palma
 *13/02/2022
 * Clase que describe a un avion
 */
public class Avion implements ObjVolador{
    private String claveU;
    private int numPas;
    private String tipoAv;
    private String despega;
    private String aterriza;
    private String seDes;
    
    public Avion(String claveU){
        this.claveU = claveU;
    }
    
    public Avion(String claveU, int numPas, String tipoAv){
        this.claveU = claveU;
        this.numPas = numPas;
        this.tipoAv = tipoAv;
    }

    public String getClaveU() {
        return claveU;
    }

    public int getNumPas() {
        return numPas;
    }

    public String getTipoAv() {
        return tipoAv;
    }

    public String getDespega() {
        return despega;
    }

    public String getAterriza() {
        return aterriza;
    }

    public String getSeDes() {
        return seDes;
    }
    
    public void despega(){
        this.despega = "desde pista";
    }
    
    public void seDesplaza(){
        this.seDes = "por motores";
    }
    
    public void aterriza(){
        this.aterriza = "en pista";
    }
    
    public String toString (){
        StringBuilder cad = new StringBuilder();
        
        cad.append("\nAvion Clave: ");
        cad.append(claveU);
        cad.append("\n     Numero de pasajeros: ");
        cad.append(numPas);
        cad.append("\n     Tipo de avion: ");
        cad.append(tipoAv);
        cad.append("\n     Despega: ");
        cad.append(despega);
        cad.append("\n     Se desplaza: ");
        cad.append(seDes);
        cad.append("\n     Aterriza: ");
        cad.append(aterriza);
        return cad.toString();
    }
    
    public boolean equals(Object obj){
        boolean res = false;
        
        if (obj != null && obj instanceof Avion){
            res = this.claveU.equals(((Avion)obj).claveU);
        }
        return res;
    }
    
}
