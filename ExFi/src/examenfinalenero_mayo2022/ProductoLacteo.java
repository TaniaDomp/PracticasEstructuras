
package examenfinalenero_mayo2022;

/**
 *
 * @author sguardatb
 */
public class ProductoLacteo {
    private String marca;
    private double precio;
    private double presentacion; // Dada en gramos
  

    public ProductoLacteo() {
    }

    public ProductoLacteo(String marca, double precio, double presentacion) {
        this.marca = marca;
        this.precio = precio;
        this.presentacion = presentacion;
    
    }
       
    public double getPresentacion() {
        return presentacion;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\n Marca= " + marca + ", precio= " + precio + ", presentación= " + presentacion;
    }   
}
