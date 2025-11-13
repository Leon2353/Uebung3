package p3;

public class P3_main {
	
public static void main (String[] args) {
		
		boolean x = false;
		boolean y = false;
		
		boolean wertA;
		boolean wertB;
		boolean wertC;
		boolean wertD;
		
		wertA = false;
		wertB = false;
		wertC = false;
		wertD = false;
		
		if (!(x!=y && x==y)) {
			
			wertA = true;
			
		}
		
		if (x || true) {
			
			wertB = true;
			
		}
		
		if (x && false) {
			
			wertC = true;
			
		}
		
		if ((x&&!y)||(!x)) {
			
			wertD = true;
			
		}
		
		System.out.println("Aussage (a) ist: " + wertA);
		System.out.println("Aussage (b) ist: " + wertB);
		System.out.println("Aussage (c) ist: " + wertC);
		System.out.print("Aussage (d) ist: " + wertD);
	
	}

}
