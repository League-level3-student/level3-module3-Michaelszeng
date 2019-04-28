package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		double taxes = population * 0.5 * growthRate;
		System.out.println("LA: " + taxes);
		return taxes;
	}
	
}
