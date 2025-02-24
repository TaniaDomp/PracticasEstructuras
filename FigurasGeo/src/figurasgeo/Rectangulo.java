package figurasgeo;
/*Tania Ariadna Dominguez Palma
 *13/02/2022
 * Clase que describe un rectangulo
 */
public class Rectangulo extends Cuadrilatero{
    
    public Rectangulo(double base, double altura){
        super(base, altura);
    }
    
    public double calculaArea(){
        return base*altura;
    }
    
    public double calculaPerimetro(){
        return 2 * base + 2 * altura;
    }
    
    public String toString(){
        return super.toString();
    }
}
