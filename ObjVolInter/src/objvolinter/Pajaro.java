package objvolinter;
/*Tania Ariadna Dominguez Palma
 *13/02/2022
 * Clase que describe a un pajaro
 */
public class Pajaro implements ObjVolador{
    private String nombreCien;
    private String clave;
    private String habitat;
    private String despega;
    private String aterriza;
    private String seDes;
    
    public Pajaro(String clave){
        this.clave = clave;
    }
    
    public Pajaro(String nombreCien, String clave, String habitat){
        this.nombreCien = nombreCien;
        this.clave = clave;
        this.habitat = habitat;
    }

    public String getNombreCien() {
        return nombreCien;
    }

    public String getClave() {
        return clave;
    }

    public String getHabitat() {
        return habitat;
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

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    public void despega(){
        this.despega = "con alas";
    }
    
    public void seDesplaza(){
        this.seDes = "por comida";
    }
    
    public void aterriza(){
        this.aterriza = "arboles";
    }
    
    public String toString (){
        StringBuilder cad = new StringBuilder();
        
        cad.append("\nPajaro Clave: ");
        cad.append(clave);
        cad.append("\n      Nombre cientifico: ");
        cad.append(nombreCien);
        cad.append("\n      Habitat: ");
        cad.append(habitat);
        cad.append("\n      Despega: ");
        cad.append(despega);
        cad.append("\n      Se desplaza: ");
        cad.append(seDes);
        cad.append("\n      Aterriza: ");
        cad.append(aterriza);
        return cad.toString();
    }
    
    public boolean equals(Object obj){
        boolean res = false;
        
        if (obj != null && obj instanceof Pajaro){
            res = this.clave.equals(((Pajaro)obj).clave);
        }
        return res;
    }
}