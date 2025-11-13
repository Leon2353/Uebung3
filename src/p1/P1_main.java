package p1;

public class P1_main {
	
public static void man (String[] args) {
		
		int stockwerk = 2;
		
		switch(stockwerk) {

		case -1:
			System.out.print("Parkhaus");
			break;
			
		case 0:
			System.out.print("Angebote");
			break;
			
		case 1:
			System.out.print("Damenbekleidung");
			break;
			
		case 2:
			System.out.print("Herrenbekleidung");
			break;
			
		case 3:
			System.out.print("Kinderbekleidung");
			break;
			
		default:
			System.out.print("unbekannt");
			break;
			
		}
		
		switch(stockwerk) {

		case -1:
			System.out.println("Parkhaus");
			break;
			
		case 0:
			System.out.println("Angebote");
			
			
		case 1:
			System.out.println("Damenbekleidung");
			
		case 2:
			System.out.println("Herrenbekleidung");
			
		case 3:
			System.out.println("Kinderbekleidung");
			
		default:
			System.out.println("unbekannt");
			break;
			
		}
		
	}

}
