public class Mano{

public static int strette(int n){
int somma=0;
if(n==1)
return 0;

if(n==2)
return 1;

if(n==3)
return 3;

else
somma =(n-1)*n;
return somma/2;
}

public static void main(String [] args){
int s=5;
int ris= strette(s);
System.out.println(ris);
}
}