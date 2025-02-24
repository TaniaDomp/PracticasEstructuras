package figurasgeo;
/*Tania Ariadna Dominguez Palma
 *13/02/2022
 * Clase que describe un triangulo
 */
public class Triangulo implements FigGeometrica {
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(double altura, double lado1, double lado2, double lado3){
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public double calculaArea(){        
        return lado1 * altura / 2;
    }
    
    public double calculaPerimetro(){
        return lado1 + lado2 + lado3;
    }    
     public boolean esEquilatero(){
         boolean eq = false;
         
         if(lado1 == lado2 && lado2 == lado1)
             eq = true;
         return eq;
     }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("\nTriangulo Altura: ");
        cad.append(altura);
        cad.append("\n          Lado 1: ");
        cad.append(lado1);
        cad.append("\n          Lado 2: ");
        cad.append(lado2);
        cad.append("\n          Lado 3: ");
        cad.append(lado3);
        return cad.toString();   
    }
    
    public boolean equals(Object obj){
        boolean res = false;
        double ar;
        
        if (obj != null && obj instanceof Triangulo){
            ar = this.calculaArea() - ((Triangulo)obj).calculaArea();
            if(ar == 0){
                res = true;
            }
        }
        return res;
    }
}
