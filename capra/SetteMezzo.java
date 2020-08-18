/**
 *Definire una "procedura" per costruire un mazzo di carte partendo da dei semi (ad esempio "cuori", "fiori" "picche", "quadri") e da dei simboli
 *(ad esempio "1", "2", .., "7", "fante", "donna", "re"). Le carte del mazzo dovranno essere rappresentate da stringhe come "2 di cuori" o "re di fiori"
 *Implementare una procedura per mischiare il mazzo di carte definito al punto 5.
 *Sfruttando il codice sviluppato nei punti 5-6, scrivere un programma che permetta ad un utente
 *nelle vesti di mazziere. Non considerare i casi particolari previsti nel gioco.
 *Suggerimento: definire un metodo che data una "carta" del mazzo ne restituisca il valore (nel gioco).
 *Si ricorda che le carte con simboli numerici hanno valori corrispondenti,
 *mentre le figure valgono mezzo punto. 
 **/
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.Integer;
import java.lang.String;

 public class SetteMezzo{
 public static void main(String [] args){
 Scanner in= new Scanner(System.in);
 String [] semi= {"cuori", "quadri", "picche", "fiori"};
 String [] carte= {"1", "2", "3", "4", "5", "6", "7", "fante", "donna", "re"};
 String [] mazzo= new String [40];
 
 //creare un mazzo di carte;
 mazzo[0]= carte[0]+ " di " +semi[0];
 mazzo[1]= carte[1]+ " di " +semi[0];
 mazzo[2]= carte[2]+ " di " +semi[0];
 mazzo[3]= carte[3]+ " di " +semi[0];
 mazzo[4]= carte[4]+ " di " +semi[0];
 mazzo[5]= carte[5]+ " di " +semi[0];
 mazzo[6]= carte[6]+ " di " +semi[0];
 mazzo[7]= carte[7]+ " di " +semi[0];
 mazzo[8]= carte[8]+ " di " +semi[0];
 mazzo[9]= carte[9]+ " di " +semi[0];
 
 mazzo[10]= carte[0]+ " di " +semi[1];
 mazzo[11]= carte[1]+ " di " +semi[1];
 mazzo[12]= carte[2]+ " di " +semi[1];
 mazzo[13]= carte[3]+ " di " +semi[1];
 mazzo[14]= carte[4]+ " di " +semi[1];
 mazzo[15]= carte[5]+ " di " +semi[1];
 mazzo[16]= carte[6]+ " di " +semi[1];
 mazzo[17]= carte[7]+ " di " +semi[1];
 mazzo[18]= carte[8]+ " di " +semi[1];
 mazzo[19]= carte[9]+ " di " +semi[1];

 mazzo[20]= carte[0]+ " di " +semi[2];
 mazzo[21]= carte[1]+ " di " +semi[2];
 mazzo[22]= carte[2]+ " di " +semi[2];
 mazzo[23]= carte[3]+ " di " +semi[2];
 mazzo[24]= carte[4]+ " di " +semi[2];
 mazzo[25]= carte[5]+ " di " +semi[2];
 mazzo[26]= carte[6]+ " di " +semi[2];
 mazzo[27]= carte[7]+ " di " +semi[2];
 mazzo[28]= carte[8]+ " di " +semi[2];
 mazzo[29]= carte[9]+ " di " +semi[2];
 
 mazzo[30]= carte[0]+ " di " +semi[3];
 mazzo[31]= carte[1]+ " di " +semi[3];
 mazzo[32]= carte[2]+ " di " +semi[3];
 mazzo[33]= carte[3]+ " di " +semi[3];
 mazzo[34]= carte[4]+ " di " +semi[3];
 mazzo[35]= carte[5]+ " di " +semi[3];
 mazzo[36]= carte[6]+ " di " +semi[3];
 mazzo[37]= carte[7]+ " di " +semi[3];
 mazzo[38]= carte[8]+ " di " +semi[3];
 mazzo[39]= carte[9]+ " di " +semi[3];


//System.out.println(Arrays.toString(mazzo));

//mischiare il mazzo in modo casuale
for (int e=0; e<40; e++){
int rand= (int)(Math.random() *40);
String temp= mazzo[rand];
mazzo[rand]= mazzo[e];
mazzo[e]= temp;

}
double conta=0.0;
System.out.println("Iniziamo a giocare !!!");
String risposta="si";
while(risposta.equals("si")){
int rand= (int)(Math.random() *40);

if ((mazzo[rand].substring(0,1)).equals("1")){
conta=conta+1;
}
if ((mazzo[rand].substring(0,1)).equals("2")){
conta=conta+2;
}
if ((mazzo[rand].substring(0,1)).equals("3")){
conta=conta+3;
}
if ((mazzo[rand].substring(0,1)).equals("4")){
conta=conta+4;
}
if ((mazzo[rand].substring(0,1)).equals("5")){
conta=conta+5;
}
if ((mazzo[rand].substring(0,1)).equals("6")){
conta=conta+6;
}
if ((mazzo[rand].substring(0,1)).equals("7")){
conta=conta+7;
}
if ((mazzo[rand].substring(0,5)).equals("fante")){
double valore= 0.5;
conta=conta+valore;
}
if ((mazzo[rand].substring(0,5)).equals("donna")){
double valore= 0.5;
conta=conta+valore;
}
if ((mazzo[rand].substring(0,2)).equals("re")){
double valore= 0.5;
conta=conta+valore;
}
System.out.println(mazzo[rand]);
System.out.println(conta);
if(conta==7.5){
System.out.println("HAI VINTO!!!");
break;
}
if(conta>7.5){
System.out.println("Hai perso, riprova magari sarai più fortunato");
break;
}
else{
System.out.println("vuoi continuare a giocare ? ");
risposta= in.nextLine();
}
}
}
}










