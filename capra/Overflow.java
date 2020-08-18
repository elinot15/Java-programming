import java.lang.Math;
import java.math.BigInteger;

public class Overflow{
public static void main(String [] args){
BigInteger x, ris;
x=new BigInteger("43");
int y=4;
ris= x.pow(y);
System.out.println(ris);
}
}
