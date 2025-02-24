
package segundoparcial_g1;

/**
 *
 * @author Guardati
 */
public class Yogurt {
    private int clave;
    private double precio;    
    private int mesVencimiento; // 1-enero, 2-febrero, etc.
    
    public Yogurt() {
    }

    public Yogurt(int clave, double precio, int mesVencimiento) {
        this.clave = clave;
        this.precio = precio;
        this.mesVencimiento = mesVencimiento;
    }

    public int getClave() {
        return clave;
    }   

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMesVencimiento() {
        return mesVencimiento;
    }
   
    @Override
    public String toString() {
        return "Yogurt{" + "Calve: " + clave + ", precio= $" + precio + ", mesVencimiento= " + mesVencimiento + '}';
    }

    
    @Override
    public boolean equals(Object obj) {
        boolean resp;
        
        if (obj != null && obj instanceof Yogurt)
            resp = ((Yogurt)obj).clave == this.clave;
        else
            resp = false;
        return resp;
    }

    
   
}