package ConjuntoEE;
/**Tania Ariadna Dominguez Palma
 *21/05/2022
 * Clase que describle prueba la clase Conjunto
 */
public class PruebaConjuntos {
    
    public static void main(String[] args) {
        Conjunto<Integer> con = new Conjunto();
        Conjunto<Integer> con1 = new Conjunto();
        
        con.agrega(1);
        con.agrega(1);
        con.agrega(2);
        con.agrega(3);
        con.agrega(4);
        con.agrega(5);
        con1.agrega(1);
        con1.agrega(5);
        con1.agrega(4);
        con1.agrega(6);
        con1.agrega(7);
        con1.agrega(8);
        /*System.out.println(con.contiene(4));
        System.out.println(con.contiene(1));*/
        //System.out.println(con);
        //System.out.println(con.getCardinalidad());
        /*System.out.println(con.elimina(1));
        System.out.println(con.elimina(1));
        System.out.println(con.elimina(5));
        System.out.println(con.elimina(3));
        System.out.println(con);*/
        /*System.out.println(con.equals(con1));
        System.out.println(con.equals(con));*/
        //System.out.println(con.union(con1));
        //System.out.println(con.interseccion(con1));
        System.out.println(con.diferencia(con1));
        System.out.println(con1.diferencia(con));
    }
}
