import java.util.Scanner;
import java.lang.System;

public class Prova{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Sudoku s = new Sudoku();
		
		s.riempi(2, 3, 9);
		s.riempi(3, 5, 7);
		s.riempi(1, 1, 1);
		s.riempi(8, 8, 8);
		s.riempi(5, 5, 5);
		
		s.freeze();
		
		System.out.print(s.toString());
	}
}