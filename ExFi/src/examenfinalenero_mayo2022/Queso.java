package examenfinalenero_mayo2022;

/**
 *
 * @author 
 */
public class Queso extends ProductoLacteo{
    private String tipo;

    public Queso() {
    }

    public Queso(String tipo, String marca, double precio, double presentación) {
        super(marca, precio, presentación);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQueso " + "tipo= " + tipo + "\n";
    }
    
}
