package pila_01;
import java.lang.reflect.Array;
import java.util.ArrayList;
/*Tania Ariadna Dominguez Palma
 *24/02/2022
 *Clase que contiene metodos para la manipulacion de pilas
 */
public class MetodosExt {
    
    public static boolean revPar(String cadOpe){
        PilaA<String> pila = new PilaA();
        boolean res = true;
        int i;
        
        i = 0;
        while (i < cadOpe.length() && res){
            if(cadOpe.charAt(i) == '('){
                pila.push("(");
            }
            else{
                if(cadOpe.charAt(i) == ')'){
                    if(!pila.isEmpty())
                        pila.pop();
                    else
                        res = false;
                }
            }
            i++;
           }   
        return pila.isEmpty()&& res;
    }
    
    public static String invierte(String cadOpe){
        PilaA<Character> cad = new PilaA();
        StringBuilder cas = new StringBuilder();
        
        if(cadOpe != null){
            for(int i = 0; i < cadOpe.length(); i++){
            cad.push(cadOpe.charAt(i));
            }
            for(int i = cadOpe.length(); i > 0 ; i--){
                cas.append(cad.pop());
            }
        }
        return cas.toString();
    }
    
    public static <T> int contElemPila(PilaADT pila){
        int cont = 0, i;
        PilaADT pil = new PilaA();
        
        while(!pila.isEmpty()){
            pil.push(pila.pop());
            cont++;
        }
        while(!pil.isEmpty()){
            pila.push(pil.pop());
        }
        
        return cont;
    }
    
    public static <T> void invierteOrden(PilaADT pila){
        ArrayList ar = new ArrayList<PilaADT>();
        
        while(!pila.isEmpty()){
            ar.add(pila.pop());
        }
        for(int i = 0; i < ar.size(); i++){
            pila.push(ar.get(i));
        }
    }
    
    public static <T> void quitaRepetidos(PilaADT<T> pila){        
        if(pila != null || !pila.isEmpty()){
            PilaADT <T> pil = new PilaA();
            pil.push(pila.pop());
            while(!pila.isEmpty()){
                if(!pil.peek().equals(pila.pop())){
                    pil.push(pila.pop());
                }
            }
            while(!pil.isEmpty()){
                pila.push(pil.pop());
            }
        }
    }
    
    public static boolean revEstPar(String cadOpe){
        PilaA<Character> pilaPar = new PilaA();
        PilaA<Character> pilaLlav = new PilaA();
        PilaA<Character> pilaCor = new PilaA();
        boolean res = true;
        int i;
        
        
        i = 0;
        while (i < cadOpe.length() && res){
            switch(cadOpe.charAt(i)){
                case '(':
                    pilaPar.push(cadOpe.charAt(i));
                    break;
                case '{':
                    pilaLlav.push(cadOpe.charAt(i));
                    break;
                case '[':
                    pilaCor.push(cadOpe.charAt(i));
                    break;
                case ')':
                    if(!pilaPar.isEmpty())
                        pilaPar.pop();
                    else
                        res = false;
                    break;
                case '}':
                    if(!pilaPar.isEmpty())
                        pilaLlav.pop(); 
                    else
                        res = false;   
                    break;
                case ']':
                    if(!pilaPar.isEmpty())
                        pilaCor.pop(); 
                    else
                        res = false;     
                    break;
            }   
            i++;
         }        
        return pilaPar.isEmpty() && pilaLlav.isEmpty() && pilaCor.isEmpty() && res;
    }
    
    public static int convierteBinario(int num){
        PilaA<Integer> binarios = new PilaA();
        int res, reg = 0;
        
        while(num != 0){
            res = num % 2;
            binarios.push(res);
            num = num/2;
        }
        while(!binarios.isEmpty()){
            reg = reg * 10 + binarios.pop();
        }
        return reg;
    }
    
    public static <T> int cuentaPila(PilaA <T> pila){
        PilaA <T> cuenta = new PilaA();
        int con = 0;
        
        while(!pila.isEmpty()){
            cuenta.push(pila.pop());
            con++;
        }
        return con;
    }
    
    public static <T> void eliminaElementos(PilaA <T> pila, int n){
        PilaA<T> pil = new PilaA();
        int i = 0;
        
        while(!pila.isEmpty() && i < n){
            pil.push(pila.pop());
            i++;
        }
        if(i < n){
            pila.push(pil.pop());
        }
    }
    
    public static <T> void eliminaElementosDos(PilaA <T> pila, int n){
        PilaA<T> pil = new PilaA();
        int dat;
        
        dat = cuentaPila(pila);
        if(dat < n){
            while(!pila.isEmpty()){
            pila.pop();
            }
        }
    }
    
    public static <T> boolean contienePila(PilaA<T> pila1, PilaA<T> pila2){
        boolean res = true;
        ArrayList<T> list1 = new ArrayList();
        ArrayList<T> list2 = new ArrayList();
        int cont = 0;
            
       while(!pila2.isEmpty())
           list2.add(pila2.pop());
       while(!pila1.isEmpty())
           list1.add(pila1.pop());
       for(int i = 0; i < list2.size(); i++){
           if(list1.contains(list2.get(i))){
               cont++;
           }
       }
       if(cont < list2.size())
           res = false;
       for(int a  = 0; a < list1.size(); a++)
           pila1.push(list1.get(a));
       for(int a  = 0; a < list2.size(); a++)
           pila2.push(list2.get(a));
       return res;
    }
    
    public static <T> void copiaPila(PilaADT<T> p, PilaADT<T> p1){
        while(!p.isEmpty()){
            p1.push(p.pop());
        }
    }
    
    public static <T> boolean equals(PilaADT<T> p, PilaADT<T> p1){
        boolean res = false;
        PilaADT <T> nueva1 = new PilaA();
        PilaADT <T> nueva2 = new PilaA();
        
        if(p != null && p1 != null){
            if(p == p1){
                res = false;
            }
            else{
                while(!p1.isEmpty() && !p.isEmpty() && p1.peek().equals(p.peek())){
                    nueva1.push(p.pop());
                    nueva2.push(p1.pop());
                }
                res = p1.isEmpty() && p.isEmpty();
                copiaPila(nueva1, p);
                copiaPila(nueva2, p1);
            }
        }
        return res;
    }
    
    public static <T> PilaADT_1 combinaPilas(PilaA<T> p1, PilaA<T> p2){
        PilaADT_1 pil = new PilaA_1();
        T dat1, dat2;
        PilaADT nueva = new PilaA();
        PilaADT nueva1 = new PilaA();
        
        if(p1 != null && p2 != null){
            while(!p1.isEmpty()){
                dat1 = p1.pop();
                nueva.push(dat1);
                pil.push1(dat1);
            }
            while(!p2.isEmpty()){
                dat2 = p2.pop();
                nueva1.push(dat2);
                pil.push2(dat2);
            }
            copiaPila(nueva, p1);
            copiaPila(nueva1, p2);
        }
        return pil;
    } 
    
    public static boolean esPalindromo(String frase){
        PilaADT<Character> aux = new PilaA();
        boolean esPal = true;
        int p;
        
        frase = frase.toUpperCase();
        for(int i = 0; i < frase.length(); i++){
            aux.push(frase.charAt(i));
        }
        p = 0;
        while(!aux.isEmpty() && esPal){
            if(!aux.pop().equals(frase.charAt(p))){
                esPal = false;
            }
            p++;
        }
        return esPal;
    }
        
}