import java.lang.System;
import java.util.Calendar;


public class Data{
	private int giorno;
	private int mese;
	private int anno;
	
	public Data(int giorno; int mese; int anno;){
		if(giorno>=1 && giorno<=31 && mese>=1 && mese<=12)
		throw("i dati inseriti non sono corretti");
		else
		this.giorno= giorno ;
		this.mese= mese ;
		this.anno= anno ;
	}
	
	public Data(){
		this.giorno= Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		this.mese=  Calendar.getInstance().get(Calendar.MONTH)+1; // mese da 1 a 12
		this.anno=  Calendar.getInstance().get(Calendar.YEAR);
	}
	
	public int getgiorno(){
		return this.giorno;
	}
	public int getmese(){
		return this.mese;
	}
	
	public int getanno(){
	    return this.anno;
    }


	public int giorniDaEpoca(){
		int giorniTrascorsi=0;
		giorniTrascorsi= giorniTrascorsi+ (this.giorno-1);
		giorniTrascorsi+= giorniTrascorsi +(this.mese-1)*31;
		giorniTrascorsi= giorniTrascorsi + (this.anni-1970)*365;
		return giorniTrascorsi;
		
	}

	public int giorniDa(Data d){
		int gg= d.getgiorno();
		int m= d.getmese();
		int a= d.getanno();
		int giorniTrascorsi=0;
		boolean b Data.vienePrimaDi(d);
		if(b==true)
		giorniTrascorsi= giorniTrascorsi+ (gg-this.giorno);
		giorniTrascorsi+= giorniTrascorsi +(m-this.mese)*31;
		giorniTrascorsi= giorniTrascorsi + (d-this.anni)*365;
		return giorniTrascorsi;
		if(b==false)
		giorniTrascorsi= giorniTrascorsi+ (this.giorno-gg);
		giorniTrascorsi+= giorniTrascorsi +(this.mese-m)*31;
		giorniTrascorsi= giorniTrascorsi + (this.anni-d)*365;
		return "-"+giorniTrascorsi;
		
		
	}

	public boolean vienePrimaDi(Data d){
		if(this.anno< d.getanno())
		return true;
		if(this.anno==d.getanno())
		  if(this.mese< d.getmese())
		  return true;
		  if(this.mese==d.getmese())
			 if(this.giorno< d.getgiorno())
			 return true;
			 return false;
	}

	public Data successiva(){
		if(this.mese==11)
		int mese=1;
		return this.giorno + "/" + mese +"/"+ this.anno;
		if(this.mese==12)
		int mese=2;
		return this.giorno + "/" + mese +"/"+ this.anno;
		
	}

	@Override
	public string toString(){
		return this.giorno + "/" + this.mese +"/"+ this.anno;
	}
}
