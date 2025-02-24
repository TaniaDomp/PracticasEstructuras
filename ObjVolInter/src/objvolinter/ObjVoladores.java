package objvolinter;
/*Tania Ariadna Dominguez Palma
 *13/02/2022
 * Clase que describe un ambiente de objetos voladores
 */
public class ObjVoladores {
    private String nombre;
    private int numPaj;
    private int numAv;
    private Pajaro [] pajaros;
    private Avion [] aviones;
    private final int MAX_VOL = 20;
    
    public ObjVoladores(){
        pajaros = new Pajaro[MAX_VOL];
        aviones = new Avion[MAX_VOL];
        numPaj = 0;
        numAv = 0;
    }
    
    public ObjVoladores(String nombre){
        this();
        this.nombre = nombre;
    }
    
    private <T> int busSecDesordenada(T[]a, int n, T x) {
	int pos, i = 0;
		
	while (i < n && !a[i].equals(x)) {
		i++;
	}
	if (i == n) {
		pos = -1;
	}
	else {
		pos = i;
	}
	return pos;
    }
    
    public boolean altaAvion(String claveU, int numPas, String tipoAv){
        Avion av = new Avion(claveU, numPas, tipoAv);
        boolean alt = false;
        
        if (numAv < MAX_VOL){
            aviones[numAv] = av;
            numAv++;
            alt = true;
        }
        return alt;
    }
    
    public boolean altaPajaro(String nombreCien, String clave, String habitat){
        boolean alt = false;
        Pajaro paj = new Pajaro(nombreCien, clave, habitat);
        
        if (numPaj < MAX_VOL){
            pajaros[numPaj] = paj;
            numPaj++;
            alt = true;
        }
        return alt;
    }
    
    public String infoPajaro(String clave){
        String info = "Pajaro no encontrado";
        Pajaro paj = new Pajaro(clave);
        int pos;
        
        pos = busSecDesordenada(pajaros, numPaj, paj);
        if(pos >= 0){
            info = pajaros[pos].toString();
        }
        return info;
    }
    
    public int numPasAv(String clave){
        int pas = -1, pos;
        Avion av = new Avion(clave);
        
        pos = busSecDesordenada(aviones, numAv, av);
        if (pos >= 0 && aviones[pos].getTipoAv().equals("Pasajeros")){
            pas = aviones[pos].getNumPas();
        }
        return pas;
    }
    
    public boolean habitatPaj(String clave, String habitat){
        boolean hab = false;
        Pajaro paj = new Pajaro(clave);
        int pos;
        
        pos = busSecDesordenada(pajaros, numPaj, paj);
        if(pos >= 0){
            pajaros[pos].setHabitat(habitat);
            hab = true;
        }
        return hab;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("\nEspacio Nombre: ");
        cad.append(nombre);
        cad.append("\n        Numero de aviones: ");
        cad.append(numAv);
        for (int i = 0; i < numAv; i++){
            cad.append("\n        Avion " + i + ": ");
            cad.append(aviones[i].toString());
        }
        cad.append("\n        Numero de pajaros: ");
        cad.append(numPaj);
        for (int i = 0; i < numPaj; i++){
            cad.append("\n        Pajaro " + i + ": ");
            cad.append(pajaros[i].toString());
        }
        return cad.toString();
    }
    
    public boolean equals(Object obj){
        boolean res = false;
        
        if (obj != null && obj instanceof ObjVoladores){
            res = this.nombre.equals(((ObjVoladores)obj).nombre);
        }
        return res;
    }
}
