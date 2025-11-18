package assignmments;

public class Assignment14b_Interface_powerN implements Assignment14a_InterfaceClass_powerN {

	public static void main(String[] args) {
		
		Assignment14b_Interface_powerN obj = new Assignment14b_Interface_powerN();
		
		double XpowerN = obj.powerOf(2, 3);
		 System.out.println("Exponential value: " + XpowerN );
		
	}

	@Override
	public double powerOf(double num, int power) {

	
		double exp =1;
		
		for (int i=1;i<=power;i++) {
			exp *= num;
		}
		return exp;
	}

}
