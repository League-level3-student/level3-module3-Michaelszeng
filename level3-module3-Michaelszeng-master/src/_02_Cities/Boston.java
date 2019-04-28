package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double taxes = population * growthRate + 0.5*population;
		System.out.println("Boston: " + taxes);
		return taxes;
	}

}
