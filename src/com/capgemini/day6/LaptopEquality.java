package com.capgemini.day6;

import java.util.Objects;

public class LaptopEquality {
	private String company;
	private String model;
	private String operatingSystem;
	private String processor;
	public LaptopEquality() {
		super();
		
	}
	public LaptopEquality(String company, String model, String operatingSystem, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
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
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		LaptopEquality c2 = (LaptopEquality) obj;
		return this.company == c2.company && this.model == c2.model; 
     }
	@Override
	public int hashCode() {
		return Objects.hash(company,model);
	}
	
	public int compareTo(LaptopEquality c2) {
		
		int result = this.company.compareTo(c2.company);
		if(result == 0)
			return this.model.compareTo(c2.model);
		return result;
	}

	 

}
