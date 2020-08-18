import java.lang.System;
import java.util.Scanner;
import java.util.Random;

public class GiocoCarte{
	
		public static void main(String args[]){
		
				Scanner sc=new Scanner(System.in);
				
				String[] seme = {"quadri", "fiori", "cuori", "picche"},
						 simbolo = {"1", "2", "3", "4", "5", "6", "7", "fante", "donna", "re"};
				
				String[] mazzo=CreaMazzo(seme, simbolo);
						 
				Mischia(mazzo);	 
				//for(String carta: mazzo)
				//		System.out.println(carta);	
				
				//iniziamo a giocare
				float punteggio=0;
				int i=0;
				
				do{
					System.out.println("Sto pescando la tua carta..");
					punteggio+=valoreCarta(mazzo[i]);
					System.out.println("Il tuo punteggio e': "+punteggio);
					i++;
					if(punteggio>7.5){
						System.out.println("Hai perso!");
						punteggio=0;
						break;
					}
					System.out.println("Vuoi lasciare il gioco?");
					String risp=sc.nextLine();
					if(risp.charAt(0)=='Y')
						break;
					
				}
				while(true);
					
				float punteggioPc=0;
				
				do{
					System.out.println("Sto pescando una carta..");
					punteggioPc+=valoreCarta(mazzo[i]);
					
					System.out.println("Il mio punteggio e': "+punteggioPc);
					i++;
					if(punteggio==0){
						System.out.println("Il banco ha vinto!");
						break;
					}
					
				}
				while(punteggioPc<punteggio);

				if(punteggioPc>7.5)
					System.out.println("Hai vinto!");
				else
					if(punteggio!=0)
						System.out.println("Il banco ha vinto!");
		}	
		
		public static String[] CreaMazzo(String[] seme, String[] simbolo){
			
			String[] mazzo= new String[seme.length*simbolo.length];
			int j=0;
				
				/*for(int i=0; i<simbolo.length; i++){
					for(int j=0; j<seme.length; j++)
						mazzo[n]=simboli[j]+" di "+semi[i];
						n++;
					}
				*/
				
				for(String se : seme)
					for(String simb : simbolo)
					mazzo[j++]=simb+" di "+se;
				
				return mazzo;
			}
			
		
		public static void Mischia(String[] mazzo){
			
			Random rand=new Random();
			String s;
			int val, val2;
			
			for(int i=0; i<mazzo.length; i++){
				val=rand.nextInt(mazzo.length);
				s=mazzo[val];
				val2=rand.nextInt(mazzo.length);
				mazzo[val]=mazzo[val2];
				mazzo[val2]=s;
			}
			
			/*for(int j=a.length-1; j>0; j--){
				String temp=a[j];
				int i=rand.nextInt(j);
				a[j]=a[i];
				a[i]=temp;
				}*/
			//Scambio non tra oggetti ma tra i loro riferimenti
		}
		
		public static float valoreCarta(String a){
			
			float val;
			char c = a.charAt(0);
			if('1'<=c && c<='7')
				return c - '0';
			//else
				return 0.5f;
		}
}
