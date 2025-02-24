package pila_01;
/**Tania Ariadna Dominguez Palma
 *24/02/2022
 *Clase que prueba la clase MetodosExt
 */
public class PruebaManPilas {
    
    public static void main(String[] args) {
        PilaA<String> pila = new PilaA();
        PilaA<String> pilaRep = new PilaA();
        PilaA<String> pilaPrueb = new PilaA();
        PilaA<String> pilaPrueb1 = new PilaA();
        PilaA<String> pilaPrueb2 = new PilaA();
        PilaA<String> pilaPrueb3 = new PilaA();
        PilaA<String> pilaPrueb4 = new PilaA();
        PilaA<String> pilaPrueb5 = new PilaA();
        PilaA<String> p1 = new PilaA();
        PilaA<String> p2 = new PilaA();
        String[] arr = new String[50];
        String pal = "ojo", pal2 = "orejero", pal3 = "Reconocer", noPal = "lok", noPal2 = "hola";
        
       /* pila.push("1");
        pila.push("2");
        pila.push("3");
        pila.push("4");
        pila.push("5");*/
        /*pilaRep.push("T");
        pilaRep.push("T");
        pilaRep.push("T");
        pilaRep.push("O");
        pilaRep.push("O");
        pilaRep.push("A");*/
        //System.out.println(pila.toString());
        //System.out.println(MetodosExt.contElemPila(pila));
        //System.out.println(pila.toString());
        /*MetodosExt.invierteOrden(pila);
        System.out.println(pila.toString());*/
        /*System.out.println(pilaRep.toString());
        MetodosExt.quitaRepetidos(pilaRep);
        System.out.println(pilaRep.toString());*/
        /*System.out.println(MetodosExt.revEstPar("(x+y)"));
        System.out.println( MetodosExt.revEstPar(")(x+y)"));
        System.out.println( MetodosExt.revEstPar("(x+y))"));
        System.out.println( MetodosExt.revEstPar("(x+y)("));
        System.out.println( MetodosExt.revEstPar("[(x+y)]"));
        System.out.println( MetodosExt.revEstPar("{[(x+y)]}"));
        System.out.println( MetodosExt.revEstPar("{(x+y)]}"));
        System.out.println( MetodosExt.revEstPar("{[(x+y)]"));
        System.out.println( MetodosExt.revEstPar("{[(x+y)]})"));
        System.out.println( MetodosExt.revEstPar("{{[(x+y)]}"));*/
        /*System.out.println(MetodosExt.convierteBinario(28));
        System.out.println(MetodosExt.convierteBinario(156));
        System.out.println(MetodosExt.convierteBinario(100));
        System.out.println(MetodosExt.convierteBinario(77));
        System.out.println(MetodosExt.convierteBinario(2));
        System.out.println(MetodosExt.convierteBinario(725));*/
        /*pilaPrueb.push("1");
        pilaPrueb.push("2");
        pilaPrueb.push("3");
        pilaPrueb.push("4");
        pilaPrueb1.push("1");
        pilaPrueb1.push("2");
        pilaPrueb1.push("4");
        pilaPrueb2.push("5");
        pilaPrueb2.push("6");
        pilaPrueb2.push("7");
        pilaPrueb3.push("I");
        pilaPrueb3.push("J");
        pilaPrueb3.push("L");
        System.out.println(MetodosExt.contienePila(pilaPrueb, pilaPrueb1)); 
        System.out.println(MetodosExt.contienePila(pilaPrueb, pilaPrueb2)); 
        System.out.println(MetodosExt.contienePila(pilaPrueb, pilaPrueb3));*/
        /*pilaPrueb.push("1");
        pilaPrueb.push("2");
        pilaPrueb.push("3");
        pilaPrueb.push("4");
        pilaPrueb3.push("1");
        pilaPrueb3.push("2");
        pilaPrueb3.push("3");
        pilaPrueb3.push("4");
        pilaPrueb1.push("1");
        pilaPrueb1.push("2");
        pilaPrueb1.push("4");
        pilaPrueb2.push("5");
        pilaPrueb2.push("6");
        pilaPrueb2.push("7");
        pilaPrueb5.push("5");
        pilaPrueb5.push("10");
        pilaPrueb4.push("5");
        pilaPrueb4.push("10");
        System.out.println(pilaPrueb4.equals(pilaPrueb5));
        System.out.println(pilaPrueb3.equals(pilaPrueb5));
        System.out.println(pilaPrueb1.equals(pilaPrueb2));
        System.out.println(pilaPrueb.equals(pilaPrueb1));
        System.out.println(pilaPrueb.equals(pilaPrueb3));
        System.out.println(pilaPrueb1.equals(pilaPrueb2));
        System.out.println(MetodosExt.equals(pilaPrueb4, pilaPrueb5));
        System.out.println(MetodosExt.equals(pilaPrueb1, pilaPrueb2));*/
        /*p1.push("1");
        p1.push("2");
        p1.push("3");
        p2.push("1");
        p2.push("2");
        p2.push("3");
        pilaPrueb5.push("A");
        pilaPrueb5.push("B");
        pilaPrueb4.push("C");
        pilaPrueb4.push("D");
        System.out.println(MetodosExt.combinaPilas(p1, p2).toString());
        System.out.println(MetodosExt.combinaPilas(pilaPrueb4, pilaPrueb5).toString());*/
        System.out.println(MetodosExt.esPalindromo(pal));
        System.out.println(MetodosExt.esPalindromo(pal2));
        System.out.println(MetodosExt.esPalindromo(pal3));
        System.out.println(MetodosExt.esPalindromo(noPal));
        System.out.println(MetodosExt.esPalindromo(noPal2));
    }
    
}
