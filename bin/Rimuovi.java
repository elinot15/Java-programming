import java.util.*;
public class Rimuovi{

public static void main(String[] args){
ArrayList<Integer> rimuovi= new ArrayList<Integer>();
int v=1;
rimuovi.add(0);
rimuovi.add(1);
rimuovi.add(3);
rimuovi.add(2);
rimuovi.add(3);
rimuovi.add(0);
rimuovi.add(3);
rimuovi.add(1);

for(int i=0; i<rimuovi.size(); i++)
if (rimuovi.get(i)==v)
rimuovi.remove(i);


for(int y: rimuovi)
System.out.print(y + ", ");
}
}