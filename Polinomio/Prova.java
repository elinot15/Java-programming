import java.lang.System;
import java.util.Scanner;


public class Prova{
	
	public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	
	int exp= 2, coeff = -1;
	Polinomio p1 = new Polinomio(exp, coeff); 
	Polinomio p2 = new Polinomio(1, 2);
	
	Polinomio p3 , p4 ;
	p3 = p1.somma(p2);
	System.out.println(p3.toString()); 
	p4 = p2.prodotto(p3);
	System.out.println(p4.toString()); 
	System.out.println("grado di "+ p3.toString() + ": "+ p3.grado());
	}
}
