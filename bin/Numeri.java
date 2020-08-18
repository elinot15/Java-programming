import java.util.*;

public class Numeri{

public static void main(String[] args){
Scanner in= new Scanner(System.in);
ArrayList<Integer> interi= new ArrayList<Integer>();
int x=0;
double somma=0.0;
while(x>=0){
x= in.nextInt();
interi.add(x);
}
int dim= interi.size();
interi.remove(dim-1);
for(int y: interi){
somma=somma+(double)y;
}
double media= somma/(dim-1);
System.out.println(media);
Collections.sort(interi);
System.out.println("Max:" + interi.get(dim-2));
System.out.println("Min:"+  interi.get(0));
}
}