import java.util.*;

public class SortParole{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int max=0;
    int min=100;
    int med=0;
    int ris=0;
    String s = "";
    ArrayList<String> parole = new ArrayList<String>();
    
    if(args[0].equals("LunghezzeParole")){
    while(in.hasNext())
    {
      s = in.next();
      parole.add(s);
    }
   
   
   
   for(int i=0; i<parole.size(); i++){
    String x= parole.get(i);
    int y= x.length();
    if(y>max)
    max=y;
    }
    
    for(int i=0; i<parole.size(); i++){
    String x= parole.get(i);
    int y= x.length();
    if(y<min)
    min=y;
    }
    
    for(int i=0; i<parole.size(); i++){
    String x= parole.get(i);
    int y= x.length();
    med= med+y;
    }
    ris= med/parole.size();
    System.out.println("max: "+max);
    System.out.println("med: "+ris);
    System.out.println("min: "+min);
    } 
    else if(!(args[0].equals("LunghezzeParole")))
    System.out.println("no");
    }
    }
