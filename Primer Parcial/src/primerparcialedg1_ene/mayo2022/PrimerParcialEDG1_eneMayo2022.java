package primerparcialedg1_ene.mayo2022;

import java.util.ArrayList;

/**Tania Ariadna Dominguez Palma Clave: 200267
 * 10/03/2022
 * Clase que contiene un metodo estatico que permite filtrar valores de una pila
 */
public class PrimerParcialEDG1_eneMayo2022 {
    
    public static void copiaPilas(PilaADT p1, PilaADT p2){
        while(!p1.isEmpty()){
            p2.push(p1.pop());
        }
    }
    
    public static ArrayList<Integer> regresaDigitos(PilaADT pila){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        PilaADT pila1 = new PilaA();
        Object dato;
        int resul;
        
        if(pila != null){
            while(!pila.isEmpty()){
                dato = pila.pop();
                if(dato.getClass().getSimpleName().equals("Integer")){
                    lista.add((Integer)dato);
                }
                else{
                    if(dato.getClass().getSimpleName().equals("String")){
                        try{
                            resul = Integer.valueOf((String)dato);
                            lista.add(resul);
                        }
                        catch(Exception e){
                            
                        }
                    }
                }
                pila1.push(dato);
            }
            copiaPilas(pila1, pila);
        }
        if(lista.isEmpty()){
            throw new RuntimeException("Pila sin enteros");
        }
        return lista;
    }
    
    public static boolean elementosEnOrden(PilaADT<String> pila){
        PilaADT<String> pil = new PilaA();
        boolean comp = true;
        
        if(!pila.isEmpty()){
            pil.push(pila.pop());
            while(!pila.isEmpty()&& comp){
                if(pila.peek().compareTo(pil.peek()) > 0){
                    comp = false;
                }
                pil.push(pila.pop());
            }
        copiaPilas(pil, pila);
        }
        return comp;
    }
    
    public static <T extends Comparable <T>> void ordenaPila(PilaADT<T> pila){
        PilaADT<T> aux = new PilaA();
        T dato;
        
        while(!pila.isEmpty()){
            dato = pila.pop();
            while(!aux.isEmpty() && dato.compareTo(aux.peek()) > 0){
                pila.push(aux.pop());
            }
            aux.push(dato);
        }
        copiaPilas(aux, pila);
    }
    
    public static void main(String[] args) {
        PilaADT pila1 = new PilaA(); //Pilas para el ejercicio 1
        PilaADT pila2 = new PilaA();
        PilaADT pila5 = new PilaA();
        PilaADT pila9 = new PilaA();
        PilaADT<String> pila3 = new PilaA(); //Pilas para eñ ejercicio 2
        PilaADT<String> pila4 = new PilaA();
        PilaADT<String> pila6 = new PilaA();
        PilaADT<String> pila7 = new PilaA();
        PilaADT<String> pila8 = new PilaA();
        PilaADT<String> pila11 = new PilaA();
        Persona p = new Persona("yo");
      
        /*pila1.push("Kila"); //Pruebas del ejercicio 1
        pila1.push(45);
        pila1.push("5");
        pila1.push(122);
        pila1.push(p);
        pila1.push("122KL");
        pila2.push("235lo");
        pila2.push("235lo");
        pila2.push("235lo");
        pila2.push("235lo");
        //pila5.push(null);
        pila9.push(p);
        pila9.push(p);
        pila9.push(7);
        pila9.push(45);
        pila9.push(p);
        pila9.push("155");
        pila9.push("155P");
        // System.out.println(pila1.toString());
        System.out.println(regresaDigitos(pila1));
        //System.out.println(regresaDigitos(pila2));
        //System.out.println(regresaDigitos(pila5));
        System.out.println(regresaDigitos(pila9));*/
        // System.out.println(pila1.toString());
        /*pila3.push("azul");   //Pruebas del ejercicio 2
        pila3.push("carmín");
        pila3.push("rosado");
        pila3.push("verde");
        pila4.push("azul");
        pila4.push("amarillo");
        pila4.push("negro");
        pila4.push("rojo");
        pila6.push(null);
        pila7.push("A");
        pila7.push("B");
        pila7.push("C");
        pila8.push("C");
        pila8.push("B");
        pila8.push("A");
        //System.out.println(pila3.toString());
        System.out.println(elementosEnOrden(pila3));
        System.out.println(elementosEnOrden(pila4));
        System.out.println(elementosEnOrden(pila6));
        System.out.println(elementosEnOrden(pila7));
        System.out.println(elementosEnOrden(pila8));
        //System.out.println(pila3.toString());*/
        pila11.push("D");
        pila11.push("A");
        pila11.push("B");
        pila11.push("F");
        System.out.println(pila11.toString());
        ordenaPila(pila11);
        System.out.println(pila11.toString());
    }
    
}