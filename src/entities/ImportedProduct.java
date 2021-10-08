package entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	//Constructors
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	//Methods Getters and Setters
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	//Method of class
	@Override
	public String priceTag() {
		return getName()+" $ "+String.format("%.2f", totalPrice())
			+ " (Customs fee: $ "+String.format("%.2f", customsFee)+")";
	}
	public double totalPrice() {
		return getPrice()+ customsFee;
	}
	

}
