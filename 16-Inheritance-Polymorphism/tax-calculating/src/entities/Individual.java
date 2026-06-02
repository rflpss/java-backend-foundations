package entities;

public class Individual extends TaxPayer {

	private double healthExpenditures;
	private double amount = 20000.00;

	public Individual() {
		super();
	}
	
	public Individual(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public double tax() {
		double basicTax = 0.0;
		if (getAnualIncome() < amount) {
			basicTax = getAnualIncome() * 0.15;
		}
		else  {
			basicTax = getAnualIncome() * 0.25;
		}
		if (healthExpenditures > 0) {
		basicTax = basicTax - (getHealthExpenditures() * 0.5);
		}
		return basicTax;
		}
	}
	

