package p2;

public class P2_main {
	
public static void main (String[] args) {
		
		int a = 3;
		int b = 5;
		int c = 6;
		double x = 1.5, y = 2.3;
		
		int intResult;
		double doubleResult;
		
		intResult = c - a * 3;
		System.out.println(intResult);
		//-3, kein kompilier Fehler, int
		
		intResult = c / b;
		System.out.println(intResult);
		//5/6=1 (Weil int, 1,2 wird abgerundet), int, kein kompilier Fehler aber falscher Wert
		
		intResult = a + b / c;
		System.out.println(intResult);
		//3 (weil int, 0.833.. wird zu 0), int, kein kompilier Fehler aber falscher Wert
		
		doubleResult = c / b;
		System.out.println(doubleResult);
		//double, kein kompilier Fehler aber falscher Wert, (eig 1,2)
		
		doubleResult = c + a / b;
		System.out.println(doubleResult);
		//double, kein kompilier Fehler aber falscher Wert (eig 6.6)
		
		doubleResult = x + y * b;
		System.out.println(doubleResult);
		//double, kein kompilier Fehler, korrekter Wert
		
		//Korrekte doubleResult Werte:
		doubleResult = c;
		doubleResult = doubleResult / b;
		System.out.println(doubleResult);
		
		doubleResult = a;
		doubleResult = doubleResult / b + c;
		System.out.println(doubleResult);
	}

}
