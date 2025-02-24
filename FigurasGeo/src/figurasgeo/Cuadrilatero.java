package figurasgeo;
/*Tania Ariadna Dominguez Palma
 *13/02/2022
 * Clase que describe un cuadrilatero
 */
public abstract class Cuadrilatero implements FigGeometrica{
    protected double base;
    protected double altura;
    
    public Cuadrilatero(double base, double altura){
        this.altura = altura;
        this.base = base;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("\nCuadrilatero Base: ");
        cad.append(base);
        cad.append("\n             Altura: ");
        cad.append(altura);
        return cad.toString();
    }
    
    public boolean equals(Object obj){
        boolean res = false;
        double are;
        
        if(obj != null && obj instanceof Cuadrilatero){
            are = this.calculaArea() - ((Cuadrilatero)obj).calculaArea();
            if(are == 0){
                res = true;
            }
        }
        return res;
    }
}
