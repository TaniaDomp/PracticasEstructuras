package figurasgeo;
/*Tania Ariadna Dominguez Palma
 *13/02/2022
 * Clase que describe un cuadrado
 */
public class Cuadrado extends Cuadrilatero{
    
    public Cuadrado(double lado){
        super(lado, lado);
    }
    
    public double calculaArea(){
        return base*altura;
    }
    
    public double calculaPerimetro(){
        return 4 * base;
    }
    
    public String toString(){
        return super.toString();
    }
}
