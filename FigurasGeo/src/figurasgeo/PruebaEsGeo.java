package figurasgeo;
/*Tania Ariadna Dominguez Palma
 *15/02/2022
 * Clase que prueba un espacio que contiene figuras geometricas
 */
public class PruebaEsGeo {
    
     public static void main(String[] args){
         FigGeom fig = new FigGeom();
         
         System.out.println(fig.altaFigura(2));
         System.out.println(fig.altaFigura(1, 1));
         System.out.println(fig.altaFiguraCu(2));
         System.out.println(fig.altaFiguraCu(3));
         System.out.println(fig.altaFigura(3));
         System.out.println(fig.altaFigura(1, 5));
         System.out.println(fig.altaFigura(1, 2, 2, 2));
         System.out.println(fig.altaFigura(1, 2, 5, 2));
         System.out.println(fig.altaFigura(7));
         //System.out.println(fig.areaFigu());
         //System.out.println(fig.circuGrande());
         //System.out.println(fig.totCua());
         //fig.eliminarEq();
         System.out.println(fig.toString());
     }
}
