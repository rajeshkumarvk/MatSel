package MatSel;

public class BasicOperator {

	public static void main(String[] args) {
		
	//	int x=9/0; //ArithmeticException
			
			
		int x=0/9;
		
		System.out.println(x);
		
		//Modulus
		
		int p =10;
		int q= p%2;
		System.out.println(q);
		
		int num =11;
		if(num %2 == 0) {
			System.out.println("Even number");
		}
		
		else {
			System.out.println("Odd number");
		}
      if(num>0) {
    		System.out.println("positive number");
      }
      else if(num<0) {
    		System.out.println("negative number");
      }
      else {
    		System.out.println(" number is zero");
      }
      
      //Ternary Operators ?  :
      
      int z=10;
      String s =(z>12) ? "hi" : "bye";
      
  	System.out.println(s);
  	
  	int n=10;
  	int m=20;
  	int max;
  	
  	max=(n>m) ? n : m;
  	
	System.out.println("The max number is  "   + max);
	
	String browser ="FF";
	String s1=(browser.equalsIgnoreCase("chrome")) ? "launch chrome" : "launch ff";
	System.out.println(s1);
	
	//dead code
	boolean flag =true;
	if(true) {
		System.out.println("this is true");
	}
	else {
		System.out.println("bye");
	}
	
	boolean flag1=true;
	if(flag1) {
		System.out.println("this is java");
		}
		else {
			System.out.println("bye");
	}
	String name ="Rajesh";
	if(!name.equalsIgnoreCase("")) {
		System.out.println("the name is "  +name);
	}
	else {
		System.out.println("the name is blank");
	}
	}
}


