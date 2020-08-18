import java.lang.System;
import java.lang.ArrayList;

public class Libro{
	
    private String titolo;
	private ArrayList<String> autori;
	private String autore;
	private int identificativo;
	private boolean prestabile;
	
	public Biblioteca(String titolo, ArrayList<String> autori, boolean prestabile){
		this.titolo= titolo;
		this.autori= new ArrayList<String>();
		this.prestabile= prestabile;
	}
	
	/* public Biblioteca(String titolo, String autore, boolean prestabile){
		this.titolo= titolo;
		this.autore= autore;
		this.prestabile= prestabile;
	}*/
	
	 public Biblioteca(String titolo, ArrayList<String> autori){
		 this.titolo= titolo;
		 this.autori= new ArrayList<String>();
		
	 }
	
	/* public Biblioteca(String titolo, String autore){
	    this.titolo= titolo;
		this.autore=autore;
	*/	
	 }
     
     public String getTitolo(){
	 return titolo;
	 }
	 
	 public ArrayList<String> getAutori(){
	 return (this.autori).toString;
     }
     
   /*  public String getAutore(){
	 return autore;
     }*/
     
     public boolean getPrestabile(){
	 return	 prestabile;
	}
	
	@Override
	//public boolean equals(Libro l){
	//
	//return
	//}
	
	@Override
	//public int hashCode(Libro l){
	//return	
	//}
	
	@Override
	public String toString(){
	return 	"titolo: "+this.titolo+ ", autori:" + this.autori+ ", presabile: "+ this.prestabile;
    }
    

	/*public String toString2(){
	return 	"titolo: "+this.titolo+ ", autori:" + this.autore+ ", presabile: "+ this.prestabile;
    }*/
}
