package figurasgeo;
/*Tania Ariadna Dominguez Palma
 *13/02/2022
 * Clase que prueba la funcionalidad de las figuras geometricas
 */
public class FigurasGeo {
    
    public static void main(String[] args) {
        Circulo cir = new Circulo(2);
        Triangulo tri = new Triangulo(2, 1, 1, 1);
        Cuadrilatero cua = new Cuadrado(4);
        Cuadrilatero cua2 = new Cuadrado(4);
        Cuadrilatero rec = new Rectangulo(4, 5);
        
        System.out.println(cir.calculaArea());
        System.out.println(cir.calculaPerimetro());
        System.out.println(tri.calculaArea());
        System.out.println(tri.calculaPerimetro());
        System.out.println(cua.calculaArea());
        System.out.println(cua.calculaPerimetro());
        System.out.println(rec.calculaArea());
        System.out.println(rec.calculaPerimetro());
        System.out.println(cua.equals(cua2));
        System.out.println(cir.equals(rec));
        /*System.out.println(cir.toString());
        System.out.println(tri.toString());
        System.out.println(cua.toString());
        System.out.println(rec.toString());*/
    }
}
