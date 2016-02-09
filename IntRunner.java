import java.util.Scanner;

// Start of calculator. Support entering of variables 

<<<<<<< HEAD
public class IntRunner{

	public static void main(String[] Ar){
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc=new Calculator();
		    String exit="no";
		    while (!exit.equals("yes")){
			System.out.println("Enter first argument");
			String first=reader.next();
			System.out.println("Enter second argument");
			String second=reader.next();
			System.out.println("+ - * / e");
			String d=reader.next();
			
			switch (d){
			  case "+":
				calc.add(Float.valueOf(first), Float.valueOf(second));
				break;
			  case "-":
					calc.sub(Float.valueOf(first), Float.valueOf(second));
					break;
			  case "*":
					calc.mult(Float.valueOf(first), Float.valueOf(second));
					break;
			  case "/":
					calc.dev(Float.valueOf(first), Float.valueOf(second));
					break;
			  case "e":
					calc.po(Float.valueOf(first), Float.valueOf(second));
					break;
			  default:
				  System.out.println("We don't have this kind of operation. Enter: + - * / e");
				  break;
			}
			System.out.println("Result : "+calc.getResult());
			calc.cleanresult();
			System.out.println("Exit : yes/no ");
			exit=reader.next();
		    }
		} finally {
			reader.close();
		}
=======
public class intRunner{

	public classic void main(String[] Ar){
		scanner reader = new Scanner.fn()
		try {
		    calculator calc=new calculator();
		    String exit=“no”;
		    while (!exit.equals(“yes”)){
			System.out.println(“Enter first argument”);
			String first=read.next();
			System.out.println(“Enter second argument”);
			String second=read.next();
			calc.add(Integer.valueOf(first), Integer.valueOf(second));
			System.out.println(“Result : ”+calc.getResult());
			calc.cleanresult();
			System.out.println(“Exit : yes/no ”);
			exit=read.next();
		    }
		} finally (
			reader.close();
		)
>>>>>>> 9382568f4c6ee6867a755339438654afdfcef7bd
	}
}