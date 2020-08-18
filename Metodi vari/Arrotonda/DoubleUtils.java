import java.lang.System;

public class DoubleUtils{

	public static double arrotondaNumero(double x, int y, boolean check){
		
		if(check){
			for(int i=0; i<y; i++)
				x*=10;
			x+=0.5;
			x=Math.floor(x);
			for(int i=0; i<y; i++)
				x/=10;
			return x;
		}
		else{
			for(int i=0; i<y; i++)
				x*=10;
			x=Math.floor(x);
			for(int i=0; i<y; i++)
				x/=10;
			return x;
		}
	}
	
	public static double troncaNumero(double x, int y){
		boolean c=false;
		double ris=DoubleUtils.arrotondaNumero(x, y, c);
		return ris;
	}
}