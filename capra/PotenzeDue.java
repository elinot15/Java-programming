import java.util.Scanner;
import java.lang.Math;

public class PotenzeDue{
public static void main(String [] args){
Scanner in= new Scanner(System.in);
long conta=0;
double x=1;
while(x!=0){
x=in.nextDouble();
for(double a=0; a<x/2; a++){
long p= (long) Math.pow(2 , a);
if(x==p)
conta++;
}
}

System.out.println(conta);
}
}
