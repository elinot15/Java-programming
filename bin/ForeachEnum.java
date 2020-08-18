public class ForeachEnum{
enum Seme {Cuori, Fiori, Quadri, Picche}
public static void main(String[] args){
for(Seme semeSuccessivo: Seme.values())
System.out.print(semeSuccessivo + " ");
}
}

/*public class ForeachEnum{
public static void main(String[] args){
String[] Seme={"c","d","e","f"};
for(String x: Seme)
System.out.print(x + " ");
}
}
*/

