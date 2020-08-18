
public class Carta implements Comparable <Carta>{
	private int value;
	private int seme;
	
	public final static int cuori=0;
	public final static int quadri=1;
	public final static int fiori=2;
	public final static int picche=3;
	
	public Carta(int value, int seme) throws IllegalArgumentException {
		if(value<=0||value>13||seme<0||seme>3)
			throw new IllegalArgumentException();
		
		this.value=value;
		this.seme=seme;
	}
	
	@Override
	public String toString(){
		
		StringBuilder sb = new StringBuilder();
		
		switch(value){
			case 1: sb.append("A"); break;
			case 11: sb.append("J"); break;
			case 12: sb.append("Q"); break;
			case 13: sb.append("K"); break;
			
			default: sb.append(value);
		}
		
		switch(seme){
			case cuori: sb.append('\u2665');
			case quadri: sb.append('\u2666');
			case fiori: sb.append('\u2663');
			case picche: sb.append('\u2660');
		}
		
		return sb.toString();
	}
	
	@Override
	public int compareTo(Carta c){
		if(this.value!=c.value){
			if(this.value==1) return 1;
			if(c.value==1) return -1;
			
			return this.value-c.value;
		} else
		
		return c.seme-this.seme;
	}
	
	public boolean isRed(){
		return (this.seme==cuori||this.seme==quadri);
	}
	
	public boolean stessoSeme(Carta c){
		return (this.seme==c.seme);
	}
	
	@Override
	public boolean equals(Object x){
		if(!(x instanceof Carta))
			return false;
		Carta c = (Carta)(x);
		return (this.value==c.value&&this.seme==c.seme);
	}
	
	@Override
	public int hashCode(){
		return this.value*10+this.seme;
	}
	
}