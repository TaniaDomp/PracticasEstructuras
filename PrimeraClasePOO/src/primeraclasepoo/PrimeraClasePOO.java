package primeraclasepoo;
import java.util.ArrayList;
import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 10/sep/2021
 * Prueba la clase ComplejoVacacional
 */
public class PrimeraClasePOO {
    public static void main(String[] args) {
        ComplejoVacacional comV;
		Scanner lect = new Scanner (System.in);
		int numA, tamL;
		double lar, anc, areaT, cos, areaP;
		ArrayList<Double> lista;
		
		comV = new ComplejoVacacional ("UDM");
		numA = lect.nextInt();
		for (int i = 0; i < numA; i++) {
			anc = lect.nextDouble();
			lar = lect.nextDouble();
			System.out.println(comV.altaAlberca(anc, lar));
		}
		areaT = comV.areaTotal();
		System.out.println(areaT);
		lista = comV.perimetroAlbercas();
		tamL = lista.size();
		for (int i = 0; i < tamL; i++) {
			System.out.println(lista.get(i));
		}
		areaP = comV.perimetroTotal();
		System.out.println(areaP);
    }
    
}
