
package segundoparcialednov2021_g1;

/**
 *
 * @author sguardati
 */
public class Ninio {
    private String nombre;
    private int edad;

    public Ninio() {
    }

    public Ninio(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Ninio{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}

