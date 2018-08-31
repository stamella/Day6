package com.capgemini.day6;

import java.util.Objects;

public class CellPhone {
	private String company;
	private String model;
	private String description;
	private String operatingSystem;
	private double price;
	public CellPhone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CellPhone(String company, String model, String description, String operatingSystem, double price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CellPhone [company=" + company + ", model=" + model + ", description=" + description
				+ ", operatingSystem=" + operatingSystem + ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		CellPhone c2 = (CellPhone) obj;
		return this.company == c2.company && this.model == c2.model && this.operatingSystem == c2.operatingSystem; 
     }
	@Override
	public int hashCode() {
		return Objects.hash(company,model,operatingSystem);
	}
	
	public int compareTo(CellPhone c2) {
		
		
		int result = this.company.compareTo(c2.company);
//		int result = this.model.compareTo(c2.model);
		int reult = this.operatingSystem.compareTo(c2.operatingSystem);
		if(result == 0)
			return this.model.compareTo(c2.model);
		return (int) result;
	}
	
}


