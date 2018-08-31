package com.capgemini.day6;

public class CarDetails  implements Comparable<CarDetails> {
	private String company;
	private String model;
	private int year;
	private int price;
	public CarDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarDetails(String company, String model, int year, int price) {
		super();
		this.company = company;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CarDetails [company=" + company + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(company,model,year,price);
	}
@Override
	public int compareTo(CarDetails Car) {
		
		int result = this.company.compareTo(Car.company);
		if(result == 0)
			return this.model.compareTo(Car.model);
		return result;
	}

	
	

}
