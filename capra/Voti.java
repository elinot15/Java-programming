import java.util.Scanner;
import java.lang.Object;
import java.util.LinkedList;

public class Voti{
public static void main(String [] args){
Scanner in= new Scanner(System.in);
int x=1;
int max=0;
int min=10;
double conta=0;
LinkedList <Integer> voti;
voti= new LinkedList<Integer>();
while(x!=0){
x=in.nextInt();
if(x>=1 && x<=10){
voti.add(x);
conta=conta+x;
if(x>max)
max=x;
if(x<min)
min=x;
}
}
double div= voti.size();
double ris= conta/div;
System.out.println(voti);
System.out.println(ris);
System.out.println(max);
System.out.println(min);
}
}
