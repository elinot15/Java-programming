import java.util.Scanner;
import java.lang.*;



public class Contrario{
public static void main(String [] args){
Scanner in= new Scanner(System.in);
String x=in.nextLine();
String y=in.nextLine();
System.out.println(x.length());
System.out.println(y.length());
if (x.length()!=y.length())
System.out.println("lunghezza  lettere diverse");

if (x.length()==y.length()){
for(int i=0; i<x.length(); i++){
for(int a=y.length()-1; a>=0; a--){
System.out.println("a: "+a);
System.out.println("i"+i);
if(!(x.charAt(i)==y.charAt(a)))
System.out.print("le parole sono diverse");

if(x.charAt(i)==y.charAt(a))
System.out.println(1);
i++;
}
}
}
}
}
