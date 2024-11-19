package zad1;

import java.util.*;



public class Controller {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void controller() {
		
		int choice = 0;
		do {
			View.menu();
			
			choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				int[] wym = Controller.inputWym(); 
				Matrix A = new Matrix(wym[1],wym[2]);
				Matrix B = new Matrix(wym[2],wym[1]);
				
				
				break;
			case 2:
				Controller.menu2();
				break;
			case 3:
				Controller.menu3();
				break;
			case 0:
				return;
			default:
				continue;
				
			}
				
			
		} while (choice != 0);
		
	}
	
	public static void menu2() {
		
		int choice = 0;
		do {
			View.menu2();
			
			choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				//transponuj m in
				break;
			case 2:
				//mnozenie
				break;
			case 3:
				//transponuj m out
				break;
			case 0:
				return;
				
			default:
				continue;	
			}
				
			
		} while (choice != 0);
	}
	
	public static void menu3() {
		
		int choice = 0;
		do {
			View.menu3();
			
			choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				//print m in
				break;
			case 2:
				//print m out
				break;
			case 0:
				return;
				
			default:
				continue;					
			}
				
			
		} while (choice != 0);
	}
	
	public static int[] inputWym() {
		
		View.podajWym();
		int m = scan.nextInt();
		int k = scan.nextInt();
		
		int[] x = new int[2];
		x[1] = m;
		x[2] = k;
		
		return x;
	}
	
	


}
