import java.lang.String;
public class Split{
public static void main(String[] args){
String parola= "ciao               come     stai ?";
/*String [] divise= split(parola);
System.out.println(divise[0] +" "+ divise[1] +" "+ divise[2] +" ");
*/
String stampa= parola.replace(" ","");
System.out.println(stampa);
}
}
