package figurasgeo;
/*Tania Ariadna Dominguez Palma
 *13/02/2022
 * Clase que describe un circulo
 */
public class Circulo implements FigGeometrica{
    private double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    public double calculaArea(){
        return Math.PI * radio * radio;
    }
    
    public double calculaPerimetro(){
        return 2 * Math.PI * radio;
    }

    public double getRadio() {
        return radio;
    }
    
    /**
     * 
     * @return 
     */
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("\nCirculo Radio: ");
        cad.append(radio);
        return cad.toString();
    }
    
    public int compareTo(Circulo otro){
        double res;
        int comp;
        
        res = this.radio-otro.radio;
        comp = (int) res;
        return comp;
    }
    
    public boolean equals(Object obj){
        boolean res = false;
        double rad;
        
        if (obj != null && obj instanceof Circulo){
            rad = this.radio - ((Circulo)obj).radio;
            if(rad==0)
                res = true;
        }
        return res;
    }
}
