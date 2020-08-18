import java.lang.System;

public class CalculationUtils{
	
	public static boolean save(String s){
		
		boolean check=false;
		for(int i=0; i<s.length(); i++)
			if(s.charAt(i)=='S')
				check=true;
		return check;
	}
	public static double calc(String s, double val){
		
		int pos1, pos2, op=0;
		double a, b;
		String segno;
		String piu="+";
		String meno="-";
		String per="*";
		String diviso="/";
		
		pos1=s.indexOf(" ");
		
		if(save(s)){
			val=Double.parseDouble(s.substring(0, pos1));
			
		}
		else{
			a=Double.parseDouble(s.substring(0,pos1));
			
			//if(b==0) boolean checkquoziente=true; controllo quoziente???
			
			segno=s.substring(pos1+1);
			if(segno.equals(piu))
				op=1;
			if(segno.equals(meno))
				op=2;
			if(segno.equals(per))
				op=3;
			if(segno.equals(diviso))
				op=4;
			
			switch (op){
				case 1:	val=somma(val, a);
						break;
				case 2:	val=differenza(val, a);
						break;
				case 3:	val=prodotto(val, a);
						break;
				case 4:	val=quoziente(val, a);
						break;
			}
			
		}
		return val;
		
	}
	
	public static double somma(double a, double b){
			
			double somma=a+b;
			return somma;
	}
	
	public static double differenza(double a, double b){
			
			double differenza=a-b;
			return differenza;
	}
	
	public static double prodotto(double a, double b){
			
			double prodotto=a*b;
			return prodotto;
	}
	
	public static double quoziente(double a, double b){
			
			double quoziente=a/b;			
			return quoziente;
	}
}