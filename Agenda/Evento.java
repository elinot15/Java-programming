import java.lang.System;
import java.util.Scanner;
import java.time.LocalDate;

public class Evento implements Comparable <Evento> {

	LocalDate data;
	private int ora;
	private boolean mezza;
	private String luogo;
	private String descrizione;
	
	public Evento(LocalDate d, int h, boolean check, String luogo, String descr){
		data=d;
		ora=h;
		mezza=check;
		this.luogo=luogo;
		descrizione=descr;
	}
	
	public LocalDate data(){
		return data;
	}
	
	public int ora(){
		return ora;
	}
	
	public boolean mezza(){
		return mezza;
	}
	
	public String luogo(){
		return luogo;
	}
	
	public String descrizione(){
		return descrizione;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		sb.append("Data: "+data+"\n"+"Ora: "+ora);
		
		if(mezza)
			sb.append(":30");
		sb.append("\n"+"Luogo:"+luogo+"\n"+"Descrizione:"+descrizione);
			
		return sb.toString();
	}
	
	@Override
	public int compareTo(Evento e){
		int n=0;
		n=(this.data).compareTo(e.data);
		if(n!=0)
			return n;
		else{
			if(this.ora>e.ora)
				return 1;
			if(this.ora<e.ora)
				return -1;
			if(this.mezza==e.mezza)
				return 0;
			if(this.mezza&&!e.mezza)
				return 1;				
			if(!this.mezza&&e.mezza)
				return -1;
		}
		throw new IllegalArgumentException();
	}
			
}
