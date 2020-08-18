import ch.aplu.turtle.*;
import java.lang.System;
import java.util.Scanner;

public class CurvaDiKoch{
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		
		Turtle tar = new Turtle();
		int n = Integer.parseInt(args[0]);
		int liv = Integer.parseInt(args[1]);
		
		//curvaDiKoch(tar,n,liv);
		fioccDiKoch(tar,n,liv);
		
	}
	
	public static void curvaDiKoch (Turtle t,int lung, int liv){
		if (liv==0)
			t.forward(lung);
		else{
			curvaDiKoch(t,lung,liv-1);
			t.left(60);
			curvaDiKoch(t,lung,liv-1);
			t.right(120);
			curvaDiKoch(t,lung,liv-1);
			t.left(60);
			curvaDiKoch(t,lung,liv-1);
		}
	}
		
	public static void fioccDiKoch(Turtle t, int lung,int liv){
		for (int i=0; i<3; i++){
			curvaDiKoch(t,lung,liv);
			t.right(120);
		}
	}


}