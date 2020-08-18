import java.util.*;
 

public class SortParola{
	public static void main(String[] args){
	
	ArrayList<String> parole= new ArrayList<String>();
	Scanner in= new Scanner(System.in);
	
	while(in.hasNext()){
		String s= in.next();
		parole.add(s);
	}

    String [] ordinare= new String [parole.size()];
    for(int i=0; i<parole.size(); i++){
    ordinare[i]= parole.get(i);
    }
	Arrays.sort(ordinare);
	System.out.println();
	StringBuilder sb= new StringBuilder();
	for(String x: ordinare)
	sb.append(x+ "\n");
	System.out.println(sb);
	
	}
}
