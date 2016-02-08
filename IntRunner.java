import java.util.Scanner;

// Start of calculator. Support entering of variables 

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
	}
}