package zad1;

public class Matrix {
	private int matrix[][];
	
	Matrix(int a, int b){
		setMatrix(new int[a][b]);
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int matrix[][]) {
		this.matrix = matrix;
	}

}
