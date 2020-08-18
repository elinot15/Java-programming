//12:09 - 12:37; 14:10 -14:50; 
public class DistributoreAutomatico2{

	/**  Rapresenta il distributore automatico*/
	private String nome;
	private double prezzo;

	/**    */
	public DistributoreAutomatico(){
		}
	public static final int Max=100;
	public static final String[] prodotto= {"the", "caffe", "capuccino", "cioccolata"};
	public static final int [] costo= {0.60, 0.90, 1.20, 1.5};
	public static final Object [] bevanda= new Object[4];
	public static final codiceIniziale= null;
	public static final credito=0;

	for (int i=0; i<4; i++){
	bevanda [i]= prodotto[i] + costo[i];
	}

	/**
	 * @param 
	 * @return restituisce true se il prodotto è ancora disponibile, false se è fenito
	 */
	 //mettere un try catch se il valore digitato non corrisponde a nessun prodotto
		public boolean sceltaBevanda(int cod){
		

		}
/**
	 * @param 
	 * @return restituisce il costo relativo al codice selezionato
	 */
        public int costoProdotto(int cod){
			
		}
	/**
	 * @param 
	 * @return restituisce la cifra presente nella macchinetta
	 */


		public int denaro(int ){
			
		}

		/**
		 * @param 
		 * @return restituisce true se la quantità di denaro è sufficiente a acquistare la bevanda desiderata
		 */
		public boolean den(){
			

		}
		/**
		 * @param 
		 * @return restituisce ciò che è stato distribuito dalla macchinetta
		 */
		 @Override
		public String toString(){
			
		}
		
		










}
