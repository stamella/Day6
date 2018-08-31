package com.capgemini.day6;

import java.util.Objects;

public class Car {
	private String make;
	private String model;
	private long year;
	private double price;
      public Car() {
	  super();
	
      }
    public Car(String make, String model, long year, double price) {
	  super();
	  this.make = make;
	  this.model = model;
	  this.year = year;
	  this.price = price;
      }
     public String getMake() {
	   return make;
     }
    public void setMake(String make) {
	    this.make = make;
     }
     public String getModel() {
	    return model;
      }
     public void setModel(String model) {
	    this.model = model;
     }
    public long getYear() {
	  return year;
     }
    public void setYear(long year) {
	   this.year = year;
      }
    public double getPrice() {
	   return price;
    }
    public void setPrice(double price) {
	   this.price = price;
    }
    @Override
    public String toString() {
	    return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
    }
    @Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		Car c2 = (Car) obj;
		return this.make == c2.make && this.model == c2.model; 
     }
	@Override
	public int hashCode() {
		return Objects.hash(make,model);
	}
	
	public int compareTo(Car c2) {
		
		int result = this.make.compareTo(c2.make);
		if(result == 0)
			return this.model.compareTo(c2.model);
		return result;
	}
}



