import java.lang.System;
import java.lang.ArrayList;

public class Utente{

		private String nome;
        private String cognome;
        private Data dataDiNascita;
		private int identificativo;
		
		
		public Utente ( String nome; String cognome; Data dataDiNascita;){
			this.nome= nome;
			this.cognome=cognome;
			this.dataDiNascita= dataDiNascita;
		}
		
		public String getNome(){
			return nome;
		}
		
		public String getCognome(){
			return cognome;
		}
		
		public Data getDataDiNascita(){
			return dataDiNascita;
		}
		
	}
	
	@Override
	public String toString(){
		return "Nome: " + this.nome + ", Cognome: "+ this.cognome+ ", Data di nascita:"+this.dataDiNascita;
	}
	
}
		
