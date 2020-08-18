import java.lang.System;
import java.util.Scanner;
import java.math.BigInteger;

	public class Bin{
		public static void main(String arg[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Inserisci un numero binario:");
			BigInteger b;
			String s, t;
			s=sc.nextLine();
			b=new BigInteger(s, 2);
			t=b.toString();
			System.out.println("Il numero in base 10 e':"+t);			
		}
	}