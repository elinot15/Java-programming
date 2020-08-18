import java.util.Scanner;
public class Asterischi {


/*
**
***
****
*****
****
***
**
*/

public static void main(String[] args){
Scanner in= new Scanner(System.in);
int x;
System.out.print("inserire un valore intero grazie");
x= in.nextInt();

for(int q=0; q<x; q++){
for(int k=1; k<1+q; k++)
System.out.print("*");
System.out.println();
}

for(int p=0; p<x; p++){
for(int i=x-p ;i>0;i--)
System.out.print("*");
System.out.println();
}
}
}
