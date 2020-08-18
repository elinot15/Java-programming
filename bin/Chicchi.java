public class Chicchi{

public static int calcolaChicchi(int k, int chicchi){
if (k==1)
return chicchi;

else 
return calcolaChicchi(k-1, 2*chicchi)+chicchi;
}

public static void main(String[] args){
int n=6;
int c=2;
int ris= Chicchi.calcolaChicchi(n,c);
System.out.println(ris);
}
}