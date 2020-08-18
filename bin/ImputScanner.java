import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

//mancada stabilire il numero di parole pari e dispari per ogni stringa
public class ImputScanner{
	
  public static void main(String[] args){
	/**/ArrayList <Integer> pari= new ArrayList<Integer>();
	/**/ArrayList <Integer> dispari= new ArrayList<Integer>();
	/**/ArrayList <String> elenco= new ArrayList<String>();
	/**/ArrayList <Integer> numero= new ArrayList<Integer>();
	/**/ArrayList <Character> caratteri= new ArrayList<Character>();
    String nomeFile= "out.txt";
    BufferedReader inputStream= null;
    System.out.println("il file "+nomeFile+ " \ncontiene le righe seguenti:\n");
    
		try{
		inputStream= new BufferedReader(new FileReader(nomeFile));
		}catch (FileNotFoundException e){
		System.out.println("errore nell'apertura del file");
		}
		try{
		String riga= inputStream.readLine();
		while(riga!=null){
			System.out.println(riga);
		/**/	elenco.add(riga);
		/**/	int i=0;
	   /**/ StringTokenizer st = new StringTokenizer (riga," ");
	   /**/  while(st.hasMoreTokens())
	   /**/ {
	  /**/      i++;
	   /**/     riga=st.nextToken();
		 
		/**/ }
	   /**/numero.add(i); 
	   /**/  riga= inputStream.readLine();
		}
		inputStream.close();
	}catch(IOException e){
		System.out.println("errore nell'apertura del file "+ nomeFile);
		}
		
		//ciclo che dice il numero di parole di ogni riga
		for(int k=0; k<numero.size(); k++)
		/**/System.out.println(numero.get(k));
	   
	   // ciclo per stabilire se la riga precedente ha più o meno o ugual numero di righe 
		for(int u=0; u<numero.size()-1; u++){
		char c='e';
		if(numero.get(u)==numero.get(u+1))
		c='=';
		if(numero.get(u)<numero.get(u+1))
		c='+';
		if(numero.get(u)>numero.get(u+1))
		c='-';
		caratteri.add(c);
		}
		for(int o=0; o<numero.size()-1; o++)
		/**/System.out.print(caratteri.get(o)+" ");
		}
		}
