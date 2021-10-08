package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	//Mask Date
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	private Date manufactureDate;

	
	//Constructors
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	//Methods Getters and Setters
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	//Method of class
	@Override
	public String priceTag() {
		return getName()+" (used) $ "+String.format("%.2f", getPrice()) 
				+" (Manufacture date: "+ sdf.format(manufactureDate)+")";
	}
	

}
