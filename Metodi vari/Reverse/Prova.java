import java.lang.System;
import java.util.Scanner;

public class Prova{
	public static void main(String[] arg){
		
		Scanner in=new Scanner(System.in);
		
		int n=arg.length;
		
		StringUtils.reverse(arg, n);
		
		for(int i=0; i<n; i++)
			System.out.println(arg[i]);
	}
}