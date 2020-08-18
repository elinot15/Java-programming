import java.util.*;
public class Salut{

public static void Salutalo(int x, String y ){
String k= "Ciao " + y;;
for(int i=0; i<x; i++)
System.out.println(k);
}

public static void main(String[] args){
int x= 10;
String y= "marco";
Salutalo(x,y);
}
}