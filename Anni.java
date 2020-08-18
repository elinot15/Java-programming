import java.lang.System;
import java.util.System

public class Anni{
		public static void main(String arg[]){
			scanner in=new Scanner (System.in);
			int annoNascita, anni;
			System.out.print("Anno di nascita: ");
			annoNascita = in.nextInt();
			anni = 2017 - annoNascita;
			System.out.println("Hai circa "+anni+"anni");
		}
}