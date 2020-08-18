import java.util.Scanner;
public class Contare{
public static void main(String[] args){
Scanner in= new Scanner(System.in);
String x= in.nextLine();
int somma=0;
for(int i=0; i<x.length()-1; i++){
String y= x.substring(i, i+1);
if(y.equalsIgnoreCase(" "))
somma= somma+1;
}
System.out.println(somma);
}
}
