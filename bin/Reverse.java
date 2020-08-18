import java.util.*; 

public class Reverse{

    public static String Inverti(String x, int y){
	StringBuilder sb = new StringBuilder();
	String k= x.substring(0,y);
	String u= x.substring(y, x.length());
	
	if(y<x.length() && y>0){
	for(int i=0; i< u.length(); i++){
	String f= u.substring(i,i+1);
	sb.append(f);
        }
        }
        sb.reverse();
        return k + sb.toString();
        
}

public static void main(String [] args){
String p= "programmazione";
int d=5;
String e= Inverti(p,d);
System.out.println(e);

}
}