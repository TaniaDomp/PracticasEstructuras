package figurasgeo;
/*Tania Ariadna Dominguez Palma
 *15/02/2022
 * Clase que describe un espacio que contiene figuras geometricas
 */
public class FigGeom {
    private FigGeometrica [] figuras;
    private final int MAX_FIG = 50;
    private int numFig;
    
    public FigGeom(){
        figuras = new FigGeometrica[MAX_FIG];
        numFig = 0;
    }
    
    public boolean altaFigura(double altura, double lado1, double lado2, double lado3){
        FigGeometrica fig = new Triangulo(altura, lado1, lado2, lado3);
        boolean alt = false;
        
        if (numFig < MAX_FIG){
            figuras[numFig] = fig;
            numFig++;
            alt = true;
        }
        return alt;
    }
    
    public boolean altaFigura(double radio){
        FigGeometrica fig = new Circulo(radio);
        boolean alt = false;
        
        if (numFig < MAX_FIG){
            figuras[numFig] = fig;
            numFig++;
            alt = true;
        }
        return alt;
    }
    
    public boolean altaFiguraCu(double lado){
        FigGeometrica fig = new Cuadrado(lado);
        boolean alt = false;
        
        if (numFig < MAX_FIG){
            figuras[numFig] = fig;
            numFig++;
            alt = true;
        }
        return alt;
    }
    
    public boolean altaFigura(double base, double altura){
        FigGeometrica fig = new Rectangulo(base, altura);
        boolean alt = false;
        
        if (numFig < MAX_FIG){
            figuras[numFig] = fig;
            numFig++;
            alt = true;
        }
        return alt;
    }
    
    public String areaFigu(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("\n Area de las figuras");
        for (int i = 0; i < numFig; i++){
            cad.append("\nFigura " + i + " " + figuras[i].getClass().getSimpleName() +": ");
            cad.append(figuras[i].calculaArea());
        }
        return cad.toString();
    }
    
    public String circuGrande(){
        String dat = "";
        double may = 0;
        
        for(int i = 0; i < numFig; i++){
            if (figuras[i].getClass().getSimpleName().equals("Circulo")){
                if(((Circulo)figuras[i]).getRadio() > may){
                    may = ((Circulo)figuras[i]).getRadio();
                    dat = figuras[i].toString();
                }
            }
        }
        return dat;
    }
    
    public int totCua(){
        int totC = 0;
        
        for(int i = 0; i < numFig; i++){
            if(figuras[i].getClass().getSimpleName().equals("Cuadrado"))
                totC++;
        }
        return totC;
    }
    
    public void eliminarEq(){
        for (int i = 0; i < numFig; i++){
            if(figuras[i].getClass().getSimpleName().equals("Triangulo")){
                if(((Triangulo)figuras[i]).esEquilatero()){
                    figuras[i] = figuras[numFig-1];
                    numFig--;
                    figuras[numFig] = null;
                }
            }
        }
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("\nFiguras geometricas");
        for(int i = 0; i < numFig; i++){
            cad.append("\nFigura " + i + ": ");
            cad.append(figuras[i].toString());
        }
        return cad.toString();
    }
}
