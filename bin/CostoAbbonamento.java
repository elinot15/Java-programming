import java.lang.Integer;

public class CostoAbbonamento{
		public static void main(String[] args){			
			String sesso= args[0];
			int eta= Integer.parseInt(args[1]);
			if (sesso.equals("m") || sesso.equals("M") || sesso.equals("f") || sesso.equals("F")){
			
			
			if (sesso.equals("m") || sesso.equals("M")){
			if (eta<=10)
			System.out.println("Per te abbonamento gratis");
			if (eta>=11 &&  eta<=25)
			System.out.println("Costo abbonamento: 10.00 euro");
			if (eta>=26 &&  eta<=64)
			System.out.println("Costo abbonamento: 18.50 euro");
			if (eta>=65 && eta <=75)
			System.out.println("Costo abbonamento: 10.00 euro");
			if (eta>75)
			System.out.println("Per te abbonamento gratis");
			}

			if (sesso.equals("f") || sesso.equals("F")){

			if (eta<=14)
			System.out.println("Per te abbonamento gratis");
			if (eta>=15 && eta <=30)
			System.out.println("Costo abbonamento:10.00 euro");
			if (eta>=31 && eta <=64)
			System.out.println("Costo abbonamento:18.50 euro");
			if (eta>=65 && eta <=75)
			System.out.println("Costo abbonamento:10.00 euro");
			if (eta>75)
			System.out.println("Per te abbonamento gratis");
			}
		}
		else 
        System.out.println("errore");
}
}
