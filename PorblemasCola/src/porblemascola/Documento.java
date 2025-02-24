package porblemascola;
/**Tania Ariadna Dominguez Palma
 * 27/04/2022
 * Clase que describe a un archivo tipo Documento
 */
public class Documento extends Archivo{
    private String tipoProcesador;
    
    public Documento(double tamano, String nombre, String dueno, String fecha, String tipoProcesador){
        super(tamano, nombre, dueno, fecha);
        this.tipoProcesador = tipoProcesador;
    }

    public String getTipoProcesador() {
        return tipoProcesador;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append(super.toString());
        cad.append("\n        Tipo de procesador: ");
        cad.append(tipoProcesador);
        return cad.toString();
    }
}
