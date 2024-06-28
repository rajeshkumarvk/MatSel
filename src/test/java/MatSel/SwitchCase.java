package MatSel;

import org.bouncycastle.oer.Switch;

public class SwitchCase {

	public static void main(String[] args) {
		
		int i =1;
		
		switch (i) {
		case 1:
			System.out.println("case 1");
			break;			
		case 2:
			System.out.println("case 2");
			break;
		case 3:
			System.out.println("case 3");
			break;			
		case 4:
			System.out.println("case 4");
			break;			
		default:
			System.out.println("case not found");
			break;
		}

		//launch browser with switch case:
		
		String browserName="opera";
		
		switch (browserName) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		
		case "firefox":
			System.out.println("launch firefox");
			break;
		
		case "IE":
			System.out.println("launch IE");
			break;
		
		case "safari":
			System.out.println("launch safari");
			break;
		
		default:
			System.out.println("browser not found :" + browserName);
			break;
		}
	}

}
