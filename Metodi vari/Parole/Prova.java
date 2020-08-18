import java.lang.System;
import java.util.Scanner;

public class Prova{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
	
		String[] parola=StringUtils.parola(s);
		
		for(int i=0; i<parola.length; i++)
		System.out.println(parola[i]);
	}	
}