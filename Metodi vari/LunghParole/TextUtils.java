import java.lang.System;
import java.util.Scanner;

public class TextUtils{
	
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
	
	public static double mediaLunghezza(String s){
		double media;
		int c=0;
		for(int i=0; i<s.length(); i++)
			if(!Character.isLetter(s.charAt(i)))
				c++;
			
		media=(s.length()-c)/(double)(TextUtils.contaParole(s));
		
		return media;
		
	}

}