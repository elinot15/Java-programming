import java.lang.System;
import java.util.ArrayList;
import java.util.Collections;

public class Mazzo{
	
	private ArrayList <Carta> carte;
	
	public Mazzo(){
		carte=new ArrayList<>();
		int[] semi = {Carta.picche, Carta.fiori, Carta.quadri, Carta.cuori};
	
		for(int seme : semi)
			for(int v=1; v<14; v++)
				carte.add(new Carta(v, seme));
	}
	
	public void mischia(){
		Collections.shuffle(carte);
	}
	
	public Carta pesca(){
		return carte.remove(0);
	}
}