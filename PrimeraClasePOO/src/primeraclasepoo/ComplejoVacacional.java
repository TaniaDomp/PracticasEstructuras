package primeraclasepoo;
import java.util.ArrayList;
/*Tania Ariadna Dominguez Palma
 * 25/ene/2022
 * Describe un complejo vacacional que contiene albercas en forma de Rectangulo
 */
public class ComplejoVacacional {
	private String nombre;
	private Rectangulo [] albercas;
	private int numAlbercas;
	private final int MAX_ALB = 10;
	
	public ComplejoVacacional() {
		albercas = new Rectangulo[MAX_ALB];
		numAlbercas = 0;
	}
	
	public ComplejoVacacional(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getTotalAlbercas() {
		return numAlbercas;
	}
	
	public String getUnaAlberca(int alb) {
		StringBuilder cad = new StringBuilder();
		
		if (alb >= 1 && alb<= numAlbercas) {
			cad.append(albercas[alb-1].toString());
		}
		return cad.toString();
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean altaAlberca(double base, double alto) {
		boolean alb;
		
		if (numAlbercas < albercas.length) {
			albercas[numAlbercas] = new Rectangulo(base, alto);
			numAlbercas ++;
			alb = true;
		}
		else {
			alb = false;
		}
		return alb;
	}
	
	public double areaTotal() {
		double are, sumT=0;
		
		for (int i = 0; i < numAlbercas; i++) {
			are = albercas[i].area();
			sumT += are;
		}
		return sumT;
	}
	
	public ArrayList<Double> perimetroAlbercas() {
		ArrayList<Double> lista = new ArrayList<Double>();
		double perimetro;
		
		for (int i = 0; i < numAlbercas; i++) {
			perimetro = albercas[i].perimetro();
			lista.add(perimetro);
		}
		return lista;
	}
	
	public double perimetroTotal() {
		double are, sumT=0;
		
		for (int i = 0; i < numAlbercas; i++) {
			are = albercas[i].perimetro();
			sumT += are;
		}
		return sumT;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Escuela Natacion");
		cad.append("\n        Nombre:");
		cad.append(nombre);
		cad.append("\n        Numero de albercas: ");
		cad.append(numAlbercas);
		for (int i= 0; i < numAlbercas; i++) {
			cad.append("\n        Alberca " + (i+1) + ": ");
			cad.append("\n        La altura es: ");
			cad.append(albercas[i].getLado1());
			cad.append("\n        La base es:   ");
			cad.append(albercas[i].getLado2());
		}
		return cad.toString();
	}
	
	public int compareTo(ComplejoVacacional otro) {
		int res;
		
		if (this.nombre.equals(otro.nombre)) {
			res = 0;
		}
		else {
			if (this.nombre.compareTo(otro.nombre)>0){
				res = 1;
			}
			else {
				res = -1;
			}
		}
		return res;
	}
	
	public boolean equals (ComplejoVacacional otro) {
		boolean res;
		
		if (this.nombre.equals(otro.nombre)) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
}