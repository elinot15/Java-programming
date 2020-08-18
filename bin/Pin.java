import java.util.*;
public class Pin {

public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.println("inserisci il pin1");
int x= in.nextInt();
int[] num= new int[10];
for(int i=0; i<10; i++)
num[i]= (int) (Math.random() *10);
System.out.println("nuova sequenza:");
System.out.println("0 1 2 3 4 5 6 7 8 9");
for(int k=0; k<10; k++)
System.out.print(num[k] + " " );
System.out.println();
System.out.println("inserisce Num segreto");
int y=in.nextInt();



}
}