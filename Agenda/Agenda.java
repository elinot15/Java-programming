import java.lang.System;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;

public class Agenda{
	
	ArrayList <Evento> agenda;
	
	public Agenda(){
		agenda=new ArrayList<Evento>();
	}
	
	public boolean aggiunge(Evento e){
		
		for(Evento x : this.agenda)
			if(x.compareTo(e)==0)
				return false;
			
		agenda.add(e);
		Collections.sort(agenda);
		return true;
	}
	
	
	public Evento evento(LocalDate d, int h, boolean m){
		for(Evento x : this.agenda)
			if((x.data().equals(d))&&x.ora()==h&&x.mezza()==m)
				return x;
			return null;
	}

	public ArrayList<Evento> eventi(LocalDate d){
		ArrayList<Evento> ris = new ArrayList <Evento>();
		for(Evento x : this.agenda)
			if(x.data().equals(d))
				ris.add(x);
			
		return ris;
	}
	
	public ArrayList<Evento> eventi(LocalDate d, LocalDate f){
		ArrayList<Evento> ris = new ArrayList <Evento>();
		for(Evento x : this.agenda)
			if(x.data().compareTo(d)>=0&&x.data().compareTo(f)<=0)
				ris.add(x);
		
		return ris;
	}

	public boolean rimuove(Evento e){
		if(agenda.contains(e)){
			agenda.remove(e);
			return true;
		}

		return false;
	}
	
	public boolean rimuove(LocalDate d){
		boolean c = false;
		for(Evento x : this.agenda)
			if(x.data().equals(d)){
				agenda.remove(x);
				c=true;
			}
		return c;
	}
	
	public boolean rimuove(LocalDate d, int h, boolean m){
		boolean c = false;
		for(Evento x : this.agenda)
			if(x.data().equals(d)&&x.ora()==h&&x.mezza()==m){
				agenda.remove(x);
				c=true;
			}
		return c;
	}
	
	@Override
	public String toString(){
		StringBuilder sb=new StringBuilder();
		for(Evento x: this.agenda)
			sb.append(x.toString()+"\n");
		
		return sb.toString();
	}
	
}
