import java.util.Scanner;
import java.lang.System;

public class Prova{
	public static void main(String[] arg){
		
		Mazzo m=new Mazzo();
		m.mischia();
		Carta[] mano=pesca5(m);
		System.out.println("La tua mano:");
		for(Carta c: mano)
			System.out.println(c.toString());
		
		
	}
	
	public static Carta[] pesca5(Mazzo m){
		Carta[] c = new Carta[5];
		
		for(int i=0; i<5; i++)
			c[i]=m.pesca();
		
		return c;
	}
}