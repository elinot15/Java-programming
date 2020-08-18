public class Array{
public static void main(String [] args){

double[][] a= new double[10][10];
for(int i=0; i<10; i++)
a[i][i]=i;
for(int k=0; k<10; k++){
for(int j=0; j<10; j++)
System.out.print(a[k][j] +" ");
System.out.println();

}
}
}