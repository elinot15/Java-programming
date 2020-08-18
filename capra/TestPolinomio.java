public class TestPolinomio{
public static void main(String[] args){
Polinomio a= new Polinomio(3,5);
Polinomio b= new Polinomio(5,5);
int ah= a.grado();
int a2= a.termineNoto();
int bh= b.grado();
int b2= b.termineNoto();

System.out.println(ah);
System.out.println(a2);
System.out.println(bh);
System.out.println(b2);

/*Polinomio c= new Polinomio();
c= somma(a,b);


Polinomio c2= new Polinomio();
c2= prodotto(a,b);*/

}
}
