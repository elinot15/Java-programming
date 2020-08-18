import java.lang.System;
import java.util.Scanner;
import ch.aplu.turtle.*;

public class Spirale{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		Turtle t = new Turtle();
		int raggio=Integer.parseInt(arg[0]);
		int liv=Integer.parseInt(arg[1]);
		
		spirale(t, raggio, liv)
	}
	
	public static void spirale(Turtle t, int raggio, int liv){
		if(liv==0)
			t.rightCircle;
		else{
			curvaDiKoch(t, lung, liv-1);
			t.left(60);
			curvaDiKoch(t, lung, liv-1);
			t.right(120);
			curvaDiKoch(t, lung, liv-1);
			t.left(60);
			curvaDiKoch(t, lung, liv-1);
		}
	}
}