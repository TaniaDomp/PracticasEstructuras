
package examenfinalenero_mayo2022;

/**
 *
 * @author 
 */
public class Yogurt extends ProductoLacteo{
    private int ingredAdicionales;

    public Yogurt() {
    }

    public Yogurt(int ingredAdicionales, String marca, double precio, double presentación) {
        super(marca, precio, presentación);
        this.ingredAdicionales = ingredAdicionales;
    }

    public int getIngredAdicionales() {
        return ingredAdicionales;
    }

    @Override
    public String toString() {
        return super.toString() + "\nYogurt con " + ingredAdicionales + " ingredientes adicionales" + "\n";
    }
    
}
