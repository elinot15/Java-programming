import java.util.Scanner;
public class Triangoli{

public static int ricor(int x){
int ris=0;
if(x==0){
ris=0;
}
if(x>0){
ris= x + ricor(x-1);
}
return ris;
}

public static void main(String[] args){
Scanner in= new Scanner(System.in);
System.out.println("inserisci un valore intero");
int n= in.nextInt();
int ris= Triangoli.ricor(n);
System.out.println(ris);
}
}
