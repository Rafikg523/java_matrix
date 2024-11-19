package zad1;

import java.util.*;



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
				menu2();
				break;
			case 3:
				menu3();
				break;
			case 0:
				exit = true;
				break;
			default:
				continue;
			}
		}
		
		view.end();
	}
	
	public void menu2() {
		
		if (A == null || B == null) {
			view.noInputMatrix();
			return;
		}
		
		while(true) {

			view.menu2();
			int choice = view.getInput("Podaj wybor: ");
			
			switch (choice) {
			case 1:
				model.transposeInput(A, B);
				break;
			case 2:
				C = new Matrix(A.getRow(),B.getCol());
				model.multiply(A, B, C);
				break;
			case 3:
				model.transposeOutput(C);
				break;
			case 0:
				return;
			default:
				continue;	
			}
		}
	}
	
	public void menu3() {
		
		if (A == null || B == null) {
			view.noInputMatrix();
			return;
		}
		
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
