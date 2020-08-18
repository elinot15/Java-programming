import java.lang.System;
import java.util.Scanner;

public class Prova{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[]a=new int[100];
		int lungh=0;
		for(int i=0; i<100; i++){
			int x=in.nextInt();
			if(x==0)
				break;
			a[i]=x;
			lungh++;
		}
		IntUtils.raddoppia(a, lungh);
		for(int i=0; i<lungh; i++){
			System.out.print(a[i]);
			System.out.print('\t');
			
		}
	}
}