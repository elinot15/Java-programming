import java.util.*;
import java.io.*;
// programma che dice quante parole ci sono in un determinato file di testo
public class Token{
 
    public static void main(String[]args) throws Exception
    {
         int i=0;
         int j=0;
         int k=0;
 
     BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
 
     String s;
     System.out.println("Enter File Name:");
     s=br.readLine();
     br= new BufferedReader (new FileReader(s));
 
     while ((s=br.readLine())!=null)
     {
     k++;
     StringTokenizer st = new StringTokenizer (s," ");
     while(st.hasMoreTokens())
    {
 
        i++;
        s=st.nextToken();
        j+=s.length();
     }
     }
     System.out.println("Numero di Parole:" +i);
     br.close();
 
     }
}
