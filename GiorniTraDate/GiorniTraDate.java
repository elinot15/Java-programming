import java.lang.System;
import java.util.Scanner;

public class GiorniTraDate{
	public static void main(String Args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Inserisci la prima data nel formato gg/mm/aaaa:");
		String s1= sc.nextLine();
		int pos1=s1.indexOf('/');
		int pos2=s1.indexOf('/', pos1+1);
		
		int g1=Integer.parseInt(s1.substring(0, pos1));
		int m1=Integer.parseInt(s1.substring(pos1+1, pos2));
		int a1=Integer.parseInt(s1.substring(pos2+1));
		
	
		System.out.println("Inserisci la seconda data nel formato gg/mm/aaaa:");
		String s2= sc.nextLine();
		int pos3=s2.indexOf('/');
		int pos4=s2.indexOf('/', pos1+1);
		
		int g2=Integer.parseInt(s2.substring(0, pos3));
		int m2=Integer.parseInt(s2.substring(pos3+1, pos4));
		int a2=Integer.parseInt(s2.substring(pos4+1));
	
		int dist1=DateUtils.giorniDaEpoca(g1, m1, a1);
		int dist2=DateUtils.giorniDaEpoca(g2, m2, a2);
	
		int distanza=Math.abs(dist1-dist2);
		System.out.println("I giorni trascorsi tra le due date sono: "+distanza);
	}
}