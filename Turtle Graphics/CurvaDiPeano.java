import java.lang.System;
import java.util.Scanner;
import ch.aplu.turtle.*;

public class CurvaDiPeano{
	
	public static void curvaDiPeano(Turtle t, int liv, int x){
		
		if(liv==0)
			t.forward(x);
		else{
			curvaDiPeano(t, liv-1, x);
			t.left(45);
			curvaDiPeano(t, liv-1, x);
			t.left(45);
			curvaDiPeano(t, liv-1, x);
			
			for(int i=0; i<6; i++){
				t.right(45);
				curvaDiPeano(t, liv-1, x);
			}
			
			for(int i=0; i<6; i++){
				t.left(45);
				curvaDiPeano(t, liv-1, x);
			}
			
			t.right(45);
			curvaDiPeano(t, liv-1, x);
			t.right(45);
			curvaDiPeano(t, liv-1, x);
			
			if(liv%2==0){
				t.left(45);
				curvaDiPeano(t, liv-1, x);
			}
			
			else{
				t.right(45);
				curvaDiPeano(t, liv-1, x);
			}
		}
	}
	
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		Turtle t = new Turtle();
		int n=Integer.parseInt(arg[0]);
		int liv=Integer.parseInt(arg[1]);
		
		curvaDiPeano(t, liv, n);
	}
}