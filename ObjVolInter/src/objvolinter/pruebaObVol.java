package objvolinter;
/*Tania Ariadna Dominguez Palma
 *13/02/2022
 * Clase que prueba un ambiente de objetos voladores
 */
public class pruebaObVol {
    
    public static void main(String[] args){
        ObjVoladores ob = new ObjVoladores("Cielo");
        
        System.out.println(ob.altaAvion("105", 50, "Pasajeros"));
        System.out.println(ob.altaAvion("106", 50, "Ejecutivo"));
        System.out.println(ob.altaPajaro("Tortolo", "450", "selva"));
        System.out.println(ob.altaPajaro("Tortolo", "458", "jungla"));
        System.out.println(ob.habitatPaj("450", "jungla"));
        System.out.println(ob.habitatPaj("452", "jungla"));
        System.out.println(ob.infoPajaro("450"));
        System.out.println(ob.numPasAv("105"));
        System.out.println(ob.numPasAv("106"));
        //System.out.println(ob.toString());
    }    
}