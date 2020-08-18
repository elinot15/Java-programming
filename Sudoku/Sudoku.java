import java.util.HashSet;

public class Sudoku{

	private int[][] cella;
	private boolean frozen;
	private boolean[][] bloccata;
	
	public Sudoku(){
		cella = new int[9][9];
		bloccata = new boolean[9][9];
	}
	
	public void riempi(int r, int c, int v){
		if(r<0||r>8||c<0||c>8||v<1||v>9)
			throw new IllegalArgumentException();
		
		if(frozen && bloccata[r][c])
			throw new IllegalArgumentException();
		
		cella[r][c]=v;
		if(!frozen)
			bloccata[r][c]=true;
	}
	
	public void freeze(){
		frozen = true;
	}
	
	public boolean finito(){
		int r, c;
		for(r=0; r<9; r++)
			for(c=0; c<9; c++)
				if(cella[r][c]==0)
					return false;
				
		for(r=0; r<9; r++)
			if(ripetizioniSuRiga(r))
				return false;
		
		for(c=0; c<9; c++)
			if(ripetizioniSuColonna(c))
				return false;
		
		for(int rr=0; rr<3; rr++)
			for(int cc=0; cc<3; cc++)		
				if(ripetizioniInQuadrato(rr, cc))
					return false;
		
		return true;
	}
	
	private boolean ripetizioniSuRiga(int r){
		HashSet<Integer> values = new HashSet<>();
		for(int c=0; c<9; c++)
			if (cella[r][c]!=0)
				values.add(cella[r][c]);
		
		return values.size()<9;
	}
	
	private boolean ripetizioniSuColonna(int c){
		HashSet<Integer> values = new HashSet<>();
		for(int r=0; r<9; r++)
			if (cella[r][c]!=0)
				values.add(cella[r][c]);
		
		return values.size()<9;
	}
	
	private boolean ripetizioniInQuadrato(final int rr, final int cc){
		
		HashSet<Integer> values = new HashSet<>();
		int nonZero=0;
		
		for(int r=0; r<3; r++)
			for(int c=0; c<3; c++){
				int v=cella[3*rr+r][3*cc+c];
				if(v!=0){
					values.add(v);
					nonZero++;
				}
			}
		return(values.size()<nonZero);
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		for(int r=0; r<9; r++){
			for(int c=0; c<9; c++){
				sb.append(cella[r][c]);
				sb.append('\t');
			}
			sb.append('\n');
			sb.append('\n');
			sb.append('\n');
		}	
		
		return sb.toString();
	}
	
	
	
	
	
}