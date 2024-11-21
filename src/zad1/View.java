package zad1;
import java.util.Scanner;


public class View {
	
	private Scanner scanner;

	public View() {
		scanner = new Scanner(System.in);
	}
	
	public void menu() {
		System.out.println("Menu:");
		System.out.println("1. Wprowadz macierze wejsciowe");
		System.out.println("2. Operacje arytmetyczne");
		System.out.println("3. Wyswietl macierze");
		System.out.println("0. Exit\n");
	}
	
	public void menu2() {
		System.out.println("Menu 2:");
		System.out.println("1. Transponuj macierze wejściowe");
		System.out.println("2. Pomnóż macierze wejściowe");
		System.out.println("3. Transponuj macierz wynikową");
		System.out.println("0. Return\n");
	}
	
	public void menu3() {
		System.out.println("Menu 3:");
		System.out.println("1. Wyświetl macierze wejściowe");
		System.out.println("2. Wyświetl macierz wynikową");
		System.out.println("0. Return\n");
	}
	
	public void end() {
		scanner.close();
		System.out.println("END");
	}
	
	public int getInput(String text) {
		
		System.out.print(text);
		while (!scanner.hasNextInt()) {
			System.err.println("Wprwoadz liczbe!");
			scanner.next();
		}
		
		int v = scanner.nextInt();
		scanner.nextLine();
		
		return v;
	}
	
	public void inputMatrixData(Matrix m, String name) {
		System.out.println("\nPodaj wartosci dla macierzy " + name);
		for (int i = 0; i < m.getRow(); i++) { //row
			for (int j = 0; j < m.getCol(); j++) { //col
				int v = getInput("Podaj wartosc elemntu " + name + "[" + i + "][" + j + "]: ");
				m.setValue(i, j, v);
			}
		}
	}
	
	public void printMatrix(Matrix m, String name) {
		System.out.println("\nMacierz " + name + ": ");
		for (int i = 0; i < m.getRow(); i++) { //row
			System.out.print("| ");
			for (int j = 0; j < m.getCol(); j++) { //col
				System.out.print(m.getValue(i, j) + " ");
			}
			System.out.print("|\n");
		}
	}
	
	public void noInputMatrix() {
		System.err.println("Brak macierzy wejściowych!");
	}
	
	public void noOutputMatrix() {
		System.err.println("Brak macierzy wynikowej!");
	}
	
	public void noOption() {
		System.err.println("Nie ma takiej pozycji!");
	}

	

}
