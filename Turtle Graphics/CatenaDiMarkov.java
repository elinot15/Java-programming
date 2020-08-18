import java.lang.System;
import java.util.Scanner;

public class CatenaDiMarkov{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		
		int n=Integer.parseInt(arg[0]);
		StringBuiloder sb = new StringBuilder();
		
		while(in.hasNextLine()){
			sb.append(in.nextLine());
			int[][] f = matriceFrequenze(sb.toString());
		}
		
		System.out.pritln(test()f, n);
		
	}
	
	public static String normalize(String x){
		StringBuilder sb=new StringBuilder();
		
		for(int i=0; i<s.length(); i++){
			char c=x.charAt(i);
			if(Character.isLetter(i))
				sb.append(Character.toLowerCase(c));
			else
				if(sb.length()>0 && sb.charAt((sb.length()-1)!='')) 
					sb.append(" ");
		}
		
		return sb.toString();
	}
	
	public static int[] matriceFrequenza(String x){
		
		x=normalize(x);
		
		int[][] ris=new int[27][27];
		
		for(int i=0; i<x.length(); i++){
			char a=x.charAt(i);
			char b=x.charAt(i+1);
			int ia= a==' '? 26 : a-'a';
			int ib= b==' '? 26 : b-'b';
			ris[ia][ib]++;
		}
		
		return ris;
	}
	
	public static int aCaso(int[] f){
		RAndom r=new Random();
		int somma=0;
		for(int x: f)	somma+=x;
		int p=r.nextInt(somma);
		int s=0, i=0;
		
		while(p>=s+f[i])	s+=f[i++];
		
		return i;
	}
	
	public static char nextChar(int[][]f, char c){
		
		int i= c==' '? 26 : c-'a';
		int j=aCaso(f[i]);
		char x= j==26? ' ' : (char)('a'+j);
		
		return x;
	}
	
	public static char firstChar(int[][] f)){
		
		int[] q = new int[27];
		
		for(int i=0; i<27; i++){
			q[i]=0;
			for(int j=0; j<27; j++)
				q[i]+=f[i][j];
		}
		
		int i=aCaso(q);
		
		return i==26? ' ' : (char)(i+'a');
	}
	
	public static String testo(int[][] f, int n){
		
		StringBuilder sb = new StringBuilder();
		sb.append(firstChar(f));
		
		for(int i=0; i<n; i++)
			sb.append(nextChar(f, sb.charAt(sb.length()-1)));
		
		return sb.toString();
	}
}