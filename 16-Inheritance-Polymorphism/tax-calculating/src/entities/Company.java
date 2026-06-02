package entities;

public class Company extends TaxPayer {

	private int numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public double tax() {
		double basicTax = 0.0;
		if(numberOfEmployees > 10) {
			basicTax = getAnualIncome() * 0.14;
		}
		else {
			basicTax = getAnualIncome() * 0.16;
		}
		return basicTax;
	}
}
