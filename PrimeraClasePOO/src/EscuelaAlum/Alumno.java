package EscuelaAlum;
/*Tania Ariadna Dominguez Palma
 * 27/01/2022
 * Clase que describe a un alumno 
 */
public class Alumno{
    private static int serie = 100;
    private int claveUnica;
    private String nombreAlum;
    private double [] califMaterias;
    private int totalCalif;
    private final int MAX_CALIF = 50;
    
    public Alumno(int clave){
        this.claveUnica = clave;
    }
    
    public Alumno (String nombre){
        this.nombreAlum = nombre;
        claveUnica = serie;
        serie++;
        califMaterias = new double[MAX_CALIF];
        totalCalif = 0;
    }

    public int getClaveUnica() {
        return claveUnica;
    }

    public String getNombreAlum() {
        return nombreAlum;
    }

    public int getTotalCalif() {
        return totalCalif;
    }
    
    public boolean altaCalificacion(double calif){
        boolean alta = false;
        
        if (totalCalif < MAX_CALIF && calif >= 6 ){
            califMaterias[totalCalif] = calif;
            totalCalif++;
            alta = true;
        }
        return alta;
    }
    
    public double calculaPromedio(){
        double sum = 0, prom;
        
        for (int i = 0; i < totalCalif; i++){
            sum += califMaterias[i];
        }
        prom = sum / totalCalif;
        return prom;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("Alumno Clave Unica: ");
        cad.append(claveUnica);
        cad.append("\n       Nombre: ");
        cad.append(nombreAlum);
        cad.append("\n       Total de calificaciones aprobadas: ");
        cad.append(totalCalif);
        for (int i = 0; i < totalCalif; i++){
            cad.append("\n       Calificacion " + i + " :" + califMaterias[i]);
        }
        return cad.toString();
    }
    
    public int compareTo(Alumno otro){
        return this.claveUnica - otro.claveUnica;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + this.claveUnica;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.claveUnica != other.claveUnica) {
            return false;
        }
        return true;
    }

    
}
