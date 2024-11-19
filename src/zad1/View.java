package zad1;


public class View {
	
	public static void menu() {
		System.out.println("1. Wprowadz macierze wejsciowe");
		System.out.println("2. Operacje arytmetyczne");
		System.out.println("3. Wyswietl macierze");
		System.out.println("0. Exit");
	}
	
	public static void menu2() {
		System.out.println("1. Transponuj macierze wejściowe");
		System.out.println("2. pomnóż macierze wejściowe");
		System.out.println("3. Transponuj macierz wynikową");
		System.out.println("0. Exit");
	}
	
	public static void menu3() {
		System.out.println("1. Wyświetl macierze wejściowe");
		System.out.println("2. Wyświetl macierz wynikową");
		System.out.println("0. Exit");
	}
	
	public static void printMatrixIn(String A, String B) {
		System.out.println("Macierz A:");
		System.out.println(A);
		System.out.println("\nMacierz B:");
		System.out.println(B);
		
	}
	
	public static void printMatrixOut(String C) {
		System.out.println("Macierz C:");
		System.out.println(C);
		
	}
	
	public static void podajWym() {
		System.out.printf("Podaj wymiary: ");
	}

	

}
