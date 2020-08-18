import java.util.Scanner;
public class Fine{
public static void main(String[] args){
Scanner in= new Scanner(System.in);
String x=" ";
String y="fine";
while(!(x.equalsIgnoreCase(y))){
x=in.nextLine();
if((x.length())>0){
String uno= x.substring(0,1);
String due= x.substring(x.length()-1,x.length());
if((uno.length())>0 && (due.length())>0){
if(uno.equalsIgnoreCase(due))
System.out.println("true");
else 
System.out.println("false");
}
}
}
}
}
