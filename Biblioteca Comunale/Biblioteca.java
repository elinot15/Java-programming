import java.lang.ArrayList;
import java.lang.System;

public class Biblioteca{
	private String nome;
    private ArrayList<Libro> listaLibri;
    private ArrayList<Utente> listaUtenti;
    private ArrayList<Prestito> listaPrestiti;
    
    public Biblioteca(String nome, ArrayList<Libro> listaLibri, ArrayList<Utente> listaUtenti, ArrayList<Prestito> listaPrestiti){
		this.nome= nome; 
		this.listaLibri= new ArrayList<Libro>();
		this.listaUtenti=new ArrayList<Utente>();
		this.listaPrestiti=new ArrayList<Prestito>();
	}

	public void nuovoUtente(Utente x){
	return listaUtenti.add(x);
    }
		

	public void nuovoLibro(Libro x){
	return listaLibri.add(x);
    }

	public int numeroUtenti(){
	return listaUtenti.size();
    }

	public int numeroLibri(){
	return listaLibri.size();
    }

	public ArrayList<Libro> cercaLibro(String x){
	
	
    }

	public boolean disponibile(Libro x){
	
    }

	public int quantiPrestiti(Utente x){
	
    }

	public boolean(Libro x, Utente u, Data finoA){
	
    }

	public boolean daiInPrestito(Libro x, Utente u){
	
    }

	public Utente chiHaInPrestito(Libro x){
	
    }
