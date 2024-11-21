package zad1;

public class Matrix {
	private int dane[][]; //row col
	private int row;
	private int col;
	
	Matrix(int a, int b){
		this.row = a;
		this.col = b;
		
		this.dane = new int[a][b];
	}
	
	public int getCol() {
		return this.col;
	}
	
	public int getRow() {
		return this.row;
	}
	
	public void setValue(int i, int j, int value) {
		dane[i][j] = value;
	}
	
	public int getValue(int i, int j) {
		return dane[i][j];
	}
	
	public int[][] getDane(){
		return dane;
	}
	
}
