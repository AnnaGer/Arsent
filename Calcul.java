public class Calcul {

	public static void main(String[] Ar) {
		System.out.println("Calculate..");
		int first=Integer.valueOf(Ar[0]);
		int second=Integer.valueOf(Ar[1]);
		int sum=first+second;
		System.out.println("Sum "+sum);
		System.out.println("subtraction " + (first - second));
  		System.out.println("Multiplying " + (first * second));
    		System.out.println("Divide  " + (first / second));
    		System.out.println("Exponent " + (Math.pow(first,second)));
	}


}