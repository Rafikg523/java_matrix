package zad1;

public class Controller {
	
	private View view;
	private Model model;
	
    private Matrix A;
    private Matrix B;
    private Matrix C;
    
    public Controller() {
    	view =  new View();
    	model = new Model();
    	
    }
	
	public void start() {

		boolean exit = false;
		while (!exit) {
			
			view.menu();
			int choice = view.getInput("Podaj wybor: ");
			
			switch (choice) {
			case 1:				
				inputMatrix();
				break;
			case 2:
				if (A == null || B == null) {
					view.noInputMatrix();
					continue;
				}
				menu2();
				break;
			case 3:
				if (A == null || B == null) {
					view.noInputMatrix();
					continue;
				}
				menu3();
				break;
			case 0:
				exit = true;
				break;
			default:
				view.noOption();
				continue;
			}
		}
		
		view.end();
	}
	
	public void menu2() {
		
		while(true) {

			view.menu2();
			int choice = view.getInput("Podaj wybor: ");
			
			switch (choice) {
			case 1:
				A = model.transposeMatrix(A);
				B= model.transposeMatrix(B);
				break;
			case 2:
				C = new Matrix(A.getRow(),B.getCol());
				C = model.multiply(A, B);
				break;
			case 3:
				C = model.transposeMatrix(C);
				break;
			case 0:
				return;
			default:
				view.noOption();
				continue;	
			}
		}
	}
	
	public void menu3() {
		
		while(true) {
			
			view.menu3();
			int choice = view.getInput("Podaj wybor: ");
			
			switch (choice) {
			case 1:
				view.printMatrix(A, "A");
				view.printMatrix(B, "B");
				break;
			case 2:
				if (C == null) {
					view.noOutputMatrix();
					continue;
				}
				view.printMatrix(C, "C");
				break;
			case 0:
				return;
			default:
				view.noOption();
				continue;					
			}
		}
	}
	
	
	public void inputMatrix() {
		int m = view.getInput("Podaj wymiar m: ");
		int k = view.getInput("Podaj wymiar k: ");
		
		A = new Matrix(m,k);
		B = new Matrix(k,m);
		
		view.inputMatrixData(A, "A");
		view.inputMatrixData(B, "B");
	}
	
	


}
