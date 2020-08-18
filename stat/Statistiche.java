import java.util.*;
import java.lang.*;

public class Statistiche{
/*public static void main(String[] args) {
int[] data = {1,1,3,2,4,5,1,4,6,7,3,5,5,8,9,10,0,0,2,1};
int[] frequenza = Statistiche.frequenze(data);
System.out.println("serie di dati:");
for (int x : data)
System.out.print(x+" ");
System.out.println("\nfrequenze:");
for (int i = 0; i < frequenza.length ; ++i)
System.out.printf("%2d: %d\n", i, frequenza[i]);
System.out.println("mediana: "+ Statistiche.mediana(data)+ "\n"); // dovrebbe stampare 3.5
}
*/


public static int[] frequenze(int[] x){
	int c0=0, c1=0, c2=0, c3=0, c4=0, c5=0, c6=0, c7=0, c8=0, c9=0, c10=0;
	for(int d=0; d<x.length; d++){
	int a= x[d];
	if(a==0){
	c0 =c0 +1;
	}
	if(a==1){
	c1 =c1 +1;
	}
	if(a==2){
	c2 =c2 +1;
	}
	if(a==3){
	c3 =c3 +1;
	}
	if(a==4){
	c4 =c4 +1;
	}
	if(a==5){
	c5 =c5 +1;
	}
	if(a==6){
	c6 =c6 +1;
	}
	if(a==7){
    c7 =c7 +1;
	}
	if(a==8){
	c8 =c8 +1;
	}
	if(a==9){
	c9 =c9 +1;
	}
	if(a==10){
	c10 =c10 +1;
	}
	}
	int [] freq= {c0, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10};
	return freq;
}
	
	
	public static double mediana (int[] x){
	Arrays.sort(x);
	double ris=0.0;
	if(x.length%2==0){
	int a= x.length/2;
	double y= x[a];
	double j= x[a-1];
	ris= (y+j)/2;
	}
	
	else if(x.length%2!=0){
	double b= x.length/2;
	int y= (int) Math.ceil(b);
	double j = x[y];
	ris= j+0.0;
	}
	return ris;
   }

}
