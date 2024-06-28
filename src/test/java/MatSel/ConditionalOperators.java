package MatSel;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=500;
		int b=200;
		
		if(b>=a) {
		System.out.println("b is greater than or equal to a");

	}
		else {
			System.out.println("a is greater than b");
	}
		
		// > < = >= <= !=
		
		int total =100;
		int tax =50;
		int finalamount = total +tax;
		
		int pendingamount = 250;
		
		if(finalamount==pendingamount) {
			System.out.println("Bill is paid");
		}
		else {
			System.out.println("Please pay the pending amount");
		}
		
		//String Comparison
		
		String s1 ="This is Java";
		String s2 ="This is java";
		
		if(s1.equals(s2)) {
			System.out.println("Both are equal");
		
}
		else {
			System.out.println("Both are not equal");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Both are equal");
		
}
		else {
			System.out.println("Both are not equal");
		}
		
		//cross browser with selenium
		
		String browser = "safari";
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("launch chrome");
}
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.out.println("launch firefox");
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			System.out.println("launch edge");
		}
		
		else {
			System.out.println("Browser is not suported" + "  " +browser);
		}
		
		//marks
		
		String Studentname ="Ramesh";
		int marks =0;
		
		if(Studentname.equalsIgnoreCase("Nadia")){
			marks=80;
			System.out.println(Studentname + "-- " +marks);
		}
		
		else if(Studentname.equalsIgnoreCase("Veeersh")){
			marks=95;
			System.out.println(Studentname + "-- " +marks);	
}
		else if(Studentname.equalsIgnoreCase("Gopi")){
			marks=90;
			System.out.println(Studentname + "-- " +marks);	
	}
		
		else {
			System.out.println(Studentname + " is not available");	
	}
		
		//if -if -if
		
		int amount =90;
		
		if(amount>=100) {
			if(amount<150) {
				System.out.println("Bill is paid");
			}
			else {
				System.out.println("Bill is over paid");
		}
		}	
			else {
			System.out.println("Bill is not paid");
		}
		
		//WAP to print the highest number among 4 numbers
		int x=3000;
		int y=4000;
		int z=1000;
		int q=1000;
		
		if(x>y && x>z && x>q) {
			System.out.println("x is the highest");
		}
		
		else if(y>z && y>q) {
			System.out.println("y is the highest");
		}
		
		else if(z>q) {
			System.out.println("z is the highest");
		}
		else{
			System.out.println("q is the highest");
		}
}
}

