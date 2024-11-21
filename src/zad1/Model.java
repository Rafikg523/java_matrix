package zad1;

public class Model {
	
	public Matrix transposeMatrix(Matrix m){
		Matrix tmp = new Matrix(m.getCol(), m.getRow());
		
		for (int i = 0; i < tmp.getRow(); i++) {
			for (int j = 0; j < tmp.getCol(); j++) {
				int v = m.getValue(j, i);
				tmp.setValue(i, j, v);
			}
		}

		return tmp;
	}
	
	public Matrix multiply(Matrix a, Matrix b) {
		
		int row = a.getRow();
		int col = b.getCol();
		Matrix m = new Matrix(row, col);
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int v = 0;
				for (int k = 0; k < a.getCol(); k++) {
					v += a.getValue(i, k) * b.getValue(k, j);
				}
				m.setValue(i, j, v);
			}
		}
		
		return m;
	}

}
