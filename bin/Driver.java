import java.util.*;
public class Driver{

public static int Confronto(int x, int y){
int differenza=0;
if(x>y)
differenza= x-y;
else 
differenza= y-x;

return differenza;

}

public static void main(String[] args){
int x= 10;
int y= 7;
int differenza= Confronto(x,y);
System.out.println(differenza);
}
}