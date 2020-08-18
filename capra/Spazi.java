import java.util.Scanner;
import java.lang.String;

public class Spazi{
public static void main(String [] args){
Scanner in= new Scanner(System.in);

System.out.println("inserisci una stringa di almeno due parole");
String x=in.nextLine();
String r= x.replaceAll("^\\s+", "");
String a=r.replaceAll("\\s+$", "");
String y= a.substring(0, a.indexOf(" "));
String z= a.substring(a.lastIndexOf(" "));
System.out.println("prima parola: "+y);
System.out.println("ultima parola: "+z);
}
}


