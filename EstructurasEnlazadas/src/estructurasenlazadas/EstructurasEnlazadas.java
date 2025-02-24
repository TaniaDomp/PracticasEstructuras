package estructurasenlazadas;

import java.util.Iterator;

/**Tania Ariadna Dominguez Palma
 *03/05/2022
 * Clase que prueba las estructuras de datos enlazadas
 */
public class EstructurasEnlazadas {

    public static void main(String[] args) {
        EE<Integer> edades = new EE();
        EE<String> let = new EE();
        EE<String> rep = new EE();
        EE<String> ob1 = new EE();
        EE<String> ob2= new EE();
        int suma = 0;
        boolean hayMayores = false, menores15 = false;
        
        /*System.out.println("\n EE vacia: " + edades);
        try{
            System.out.println("Dato eliminado de una EE vacia: " + edades.quitaPrimero());
        }
        catch(Exception e){
            System.out.println("\n No se pudo eliminar");
        }*/
        /*edades.agregaInicio(20);
        edades.agregaInicio(18);
        edades.agregaInicio(23);
        edades.agregaInicio(10);
        System.out.println(edades);*/
        /*System.out.println(edades.quitaSiguiente(23));
        System.out.println(edades);*/
        //System.out.println(edades.quitaAnterior(10));
        //System.out.println(edades);
        /*System.out.println(edades.insertaAntesQue(23, 21));
        System.out.println(edades);*/
        //System.out.println("\n EE con 4 elementos: " + edades);
        /*System.out.println("\nDato eliminado de una EE vacia: " + edades.quitaPrimero());
        System.out.println("\n EE luego de eliminar: " + edades);*/
        /*System.out.println("\n elemento eliminado: " + edades.quitaUltimo());
        System.out.println("\n EE luego de eliminar: " + edades);*/
        //System.out.println(edades.quitaDato(23));
        //System.out.println(edades.quitaDato(20));
        //System.out.println(edades.quitaDato(10));
        //System.out.println(edades);
        //Calculo de promedio
        /*for(Integer i: edades){
            suma+= i;
        }
        System.out.println("Promedio de las edades: " + (double)suma/4);
        //Buscar edad menor a 20
        Iterator <Integer> it = edades.iterator();
        while(it.hasNext() && !hayMayores){
            hayMayores = it.next() > 20;
        }
        if(hayMayores){
            System.out.println("Si hay personas con mas de 20 años");
        }
        else{
            System.out.println("No hay personas mayores de 20 años");
        }
        //busca si hay personas menores de 15 años
        it = edades.iterator();
        while(it.hasNext() && !menores15){
            menores15 = it.next() < 15;
        }
        if(menores15){
            System.out.println("Si hay personas con menos de 15 años");
        }
        else{
            System.out.println("No hay personas menores de 15 años");
        }*/
        /*let.agregaFinal("A");
        let.agregaFinal("B");
        let.agregaFinal("D");
        let.agregaFinal("E");
        System.out.println(let);
        System.out.println(let.insertaAntesQue("B", "F"));
        System.out.println(let.insertaAntesQue("N", "B"));
        System.out.println(let);*/
        /*rep.agregaFinal("A");
        rep.agregaFinal("A");
        rep.agregaFinal("A");
        rep.agregaFinal("B");
        rep.agregaFinal("B");
        rep.agregaFinal("B");
        rep.agregaFinal("C");
        rep.agregaFinal("D");
        System.out.println(rep);
        System.out.println(rep.eliminaTodosRepetidosOrdenado());
        System.out.println(rep);*/
        ob1.agregaFinal("1");
        ob1.agregaFinal("3");
        ob1.agregaFinal("5");
        //ob1.agregaFinal("A");
        //ob1.agregaFinal("A");
        ob2.agregaFinal("2");
        ob2.agregaFinal("4");
        ob2.agregaFinal("6");
        ob2.agregaFinal("8");
        ob2.agregaFinal("10");
        ob1.combinaEE(ob2);
        System.out.println(ob1);
    }
    
}
