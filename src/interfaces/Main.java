package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculator calculator  = getCalculator();
		calculator.calculatetax();
		

	}
	public static TaxCalculator getCalculator() //method directly caled from main
	{
		return new TaxCalculator2019();
		
		
	}

}
