import java.lang.System;
import java.util.Scanner;

public class Prova{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String[] x=new String[100];
		String s;
		int n=0;
		System.out.println("Inserisci la lista di stringhe:");
		for(int i=0; i<100; i++){
			s=in.nextLine();
			if(s.equals(""))
				break;
			x[i]=s;
			n++;
		}
		
		System.out.println("La stringa piu' lunga e':"+StringUtils.longest(x, n));
		}
}