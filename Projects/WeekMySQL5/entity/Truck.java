package entity;

public class Truck {
	
	private int id;
	private String make;
	private String model;
	private Double price;
	
	public Truck(int id, String make, String model, Double price) {
		this.setId(id);
		this.setMake(make);
		this.setModel(model);
		this.setPrice(price);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
		
}


