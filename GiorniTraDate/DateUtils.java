import java.lang.System;

public class DateUtils{
	/** Questo metodo stabilisce se un certo anno è bisestile, 
	*	secondo le formule di <a href="https://www.wikipedia.org/">Wikipedia</a>
	*	@param anno l'anno passato come argomento
	*	@return <code>true</code> se l'anno è bisestile,
	*			<code>false</code> altrimenti
	*/
	public static boolean isBisestile(int anno){
		return  anno%4==0&&(anno%100!=0||anno%400==0);
	}
	
	/** Questo metodo stabilisce quanti giorni ha un anno,  
	*	a seconda che l'anno sia bisestile o no
	*	@param 	anno l'anno passato come argomento
	*	@return <code>366</code> se l'anno è bisestile,
	*			<code>365</code> altrimenti
	*/
	public static int giorniAnno(int anno){
		return (DateUtils.isBisestile(anno)? 366: 365);
	}
	
	/** Questo metodo stabilisce quanti giorni ha un mese,  
	*	a seconda che l'anno sia bisestile o no
	*	@param 	anno l'anno passato come argomento<br>
	*	@param 	mese il mese passato come argomento
	*	@return <code>30</code> se il mese è aprile, giugno, settembre, novembre,
	*			<code>28</code> se febbraio in un anno non bisestile,
	*			<code>29</code> se febbraio in un anno bisestile,
	*			<code>31</code> altrimenti
	*/
	public static int giorniMese(int mese, int anno){
		int risultato;
	switch(mese){
		case 4: case 6: case 9: case 11:	risultato=30;
											break;
											
		case 2: risultato=(DateUtils.isBisestile(anno)? 29: 28);
				break;
				
		default: risultato=31;
		}
		return risultato;
	}
	
	/** Questo metodo stabilisce quanti giorni sono passati dall'epoca,  
	*	a seconda che l'anno sia bisestile o no
	*	@param 	anno l'anno passato come argomento<br>
	*	@param 	mese il mese passato come argomento<br>
	*	@param	giorno il giorno inserito
	*	@return il numero di giorni trascorsi dall'epoca
	*/
	public static int giorniDaEpoca(int giorno, int mese, int anno){
		int tot=0;
		for(int x=1970; x<anno; x++)
			tot+=DateUtils.giorniAnno(x);
		
		for(int i=1; i<mese; i++)
			tot+=DateUtils.giorniMese(i, anno);
		
		tot+=giorno;
		return tot;
	}
}