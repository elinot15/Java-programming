import java.lang.System;
import java.util.Scanner;


public class Polinomio{
	
	private int[] coeff;
	final int MAX=20;
	
	public Polinomio(int esp, int coefficiente){
		coeff=new int[MAX+1];
		coeff[esp]=coefficiente;
	}
	
	public Polinomio(int[] coefficiente){
		this.coeff=coefficiente;
	}
	
	public int grado(){
		for(int i=coeff.length-1; i>=0; i--)
			if(coeff[i]!=0)
				return i;
			return -1;
	}
	
	public int termineNoto(){
		return coeff[0];
	}
	
	public Polinomio somma(Polinomio p){
		int newcoeff[]=new int[MAX+1];//oppure Polinomio somma=new Polinomio(0,0)
		
		for(int i=0; i<coeff.length; i++)
			newcoeff[i]=this.coeff[i]+p.coeff[i];
		
		return new Polinomio(newcoeff);
	}
	
	public Polinomio prodotto(Polinomio p){

		if((this.grado()+p.grado())>MAX+1)
			return null;
		
		Polinomio prodotto=new Polinomio(0,0);
		for(int i=0; i<=this.grado(); i++)
			for(int k=0; k<=p.grado(); k++)
				prodotto.coeff[i+k]+=this.coeff[i]*p.coeff[k];
				
		return prodotto;
	}
	
	/**@override**/
	public String toString(){
		StringBuilder sb=new StringBuilder();
		
		if(coeff[0]!=0)
			sb.append(coeff[0]);
		
		if(coeff[1]!=0)
			sb.append(coeff[1]+"x");	
		
		for(int i=2; i<=this.grado(); i++){
			
			if(coeff[i]!=0){
			
				if(coeff[i]==1)
					sb.append("x^"+i);
				else 
					sb.append(coeff[i]+"x^"+i);
					
				if(i!=this.grado())
					if(coeff[i]>0)
						sb.append("+");
			}
		}
		return sb.toString();
	}
	
}
