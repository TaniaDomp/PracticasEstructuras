package primeraclasepoo;
/*Tania Ariadna Dominguez Palma
 * 25/ene/2022
 * Decribe una figura en forma de rectangulo
 */
public class Rectangulo {
    private double lado1, lado2;
    
    public Rectangulo() {	
	}
	
    public Rectangulo (double lado1, double lado2) {
	this.lado1 = lado1;
	this.lado2 = lado2;
    }
	
    public double getLado1() {
	return lado1;
    }
	
    public double getLado2() {
        return lado2;
    }
	
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
	
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
	
    public double area() {
        double a;		
	a = lado1 * lado2;
        return a;
    }
    
    public double perimetro() {
        double p;		
        p = 2 * lado1 + 2* lado2;
        return p;
    }
	
    public String toString() {
        StringBuilder cad = new StringBuilder(); 
        
        cad.append("\nRectangulo con las medidas: " + lado1 + ", " + lado2);
        return cad.toString(); 
    }
	
    public int compareTo(Rectangulo otro) {
        int res;
        
        if (this.area() ==otro.area()) {
            res = 0; 
        }
	else {
            if (this.area()>otro.area()) {
                res = 1; 
            }
            else {
                res = -1; 
            }
        }
        return res;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(this.area());
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rectangulo other = (Rectangulo) obj;
        if (Double.doubleToLongBits(this.area()) != Double.doubleToLongBits(other.area()))
            return false;
        return true;
    }
}