import java.lang.System;
import java.util.Scanner;

public class StringVariations{
	public static void main(String Args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci una stringa: (l'inserimento termina quando l'utente inserisce una stringa vuota)");
		String s = sc.nextLine();
		String t=s.trim();
		
		/*while(t.isEmpty()==false){
			System.out.println(StringUtils.farfallino(t));
			System.out.println("Inserisci una stringa: (l'inserimento termina quando l'utente inserisce una stringa vuota)");
			s = sc.nextLine();
			t=s.trim();
		}*/
		
		//System.out.println(StringUtils.reverse(t));
		
		System.out.println(StringUtils.rMoscia(t));
	}
}
