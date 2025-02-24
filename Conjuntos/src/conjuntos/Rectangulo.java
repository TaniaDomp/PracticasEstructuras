package conjuntos;
/*Tania Ariadna Dominguez Palma
 *13/02/2022
 * Clase que describe un rectangulo
 */
public class Rectangulo{
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }
    
    public double calculaArea(){
        return base*altura;
    }
    
    public double calculaPerimetro(){
        return 2 * base + 2 * altura;
    }
    
    public boolean equals(Object otro){
        return this.altura == ((Rectangulo)otro).altura && this.base == ((Rectangulo)otro).base;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("Rectangulo");
        cad.append("\n Base: ");
        cad.append(base);
        cad.append("\n Altura: ");
        cad.append(altura);
        return cad.toString();
    }
}
