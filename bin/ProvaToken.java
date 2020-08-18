import java.util.*;
// programma che ci dive quante parole sono contenute nella stringa s
public class ProvaToken{
 public static void main(String[]args) throws Exception {
     int i=0;
     String s= "ciaooo     6 come           va ?";
     StringTokenizer st = new StringTokenizer (s," ");
     while(st.hasMoreTokens())
    {
 
        i++;
        s=st.nextToken();
     
     }
     System.out.println("Numero di Parole:" + i);
   
 
     }
}
