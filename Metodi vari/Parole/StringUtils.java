import java.lang.System;

public class StringUtils{

	public static String farfallino(String x){
		
		String s=x.toLowerCase();
		StringBuilder sb=new StringBuilder();
		
		
		for(int i=0; i<s.length(); i++){
				char c=s.charAt(i);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
					sb.append(c+"f"+c);
				else
					sb.append(c);
		}
		
		return sb.toString();
	}
	
	public static String reverse(String x){
		
		StringBuilder sb=new StringBuilder(x);
		sb=sb.reverse();
		
		return sb.toString();
	}
	
	public static String rMoscia(String x){
		
		String s=x.toLowerCase();
		StringBuilder sb=new StringBuilder();
		
		for(int i=0; i<s.length(); i++){
				char c=s.charAt(i);
				if(c=='r')
					sb.append("v");
				else
					sb.append(c);
		}
		
		return sb.toString();
	}
	
	public static String longest(String[] s, int n){
		int max=0;
		int indice=0;
		for(int i=0; i<n; i++)
			if(s[i].length()>max){
				max=s[i].length();
				indice=i;
			}
		
		return s[indice];
	}
	
	public static void reverse(String[] s, int n){
		
		for(int i=0; i<n; i++)
			s[i]=StringUtils.reverse(s[i]);
		
	}
	
	public static int contaParole(String s){
		int c=0;
		int l=s.length();
		
		for(int i=0; i<l-1; i++){
			if(s.charAt(i)==' '&&Character.isLetter(s.charAt(i+1)))
			c++;
		}
	
		if(s.charAt(0)!=' ')
			c++;
		
		return c;
	}
	
	public static String[] parola(String s){
		
		String[] a=new String[contaParole(s)];
		int pos=0;
		int conta=0;
		int i=0;
		for(i=0; i<s.length(); i++)
			if(s.charAt(i)==' '){
				a[conta]=s.substring(pos,i);
				conta++;
				pos=i+1;
			}
		a[conta]=s.substring(pos, i);	
		return a;
		}
		
}