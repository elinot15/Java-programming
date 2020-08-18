import java.util.*;
public class Div{

public static boolean Divisibile (int x, int y ){
boolean a=true;
if(x%y==0)
a= true;
if(x%y!=0)
a= false;
return a;
}

public static void main(String[] args){
int x= 7;
int y= 5;
boolean k= Divisibile(x,y);
System.out.println(k);
}
}