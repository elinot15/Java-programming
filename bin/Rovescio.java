import java.util.*;

public class Rovescio{
public static void main(String[] args){
ArrayList<String> lettere= new ArrayList<String>();
Scanner in= new Scanner(System.in);
String x= in.nextLine();
for(int i=0; i<=x.length()-1; i++){
String y= x.substring(i, i+1);
lettere.add(y);
}
for(int j= lettere.size()-1; j>=0; j--)
System.out.print(lettere.get(j));
System.out.println();
}
}