package lesson1;

public class Fruit {
	private String material;
	private String color;
	private int price;
	private int weight;
	
	
	public Fruit(String material, String color, int price, int weight) {
		super();
		this.material = material;
		this.color = color;
		this.price = price;
		this.weight = weight;
	}


	public String getMaterial() {
		return material;
	}


	public String getColor() {
		return color;
	}


	public int getPrice() {
		return price;
	}


	public int getWeight() {
		return weight;
	}


	@Override
	public String toString() {
		return "This " + this.material + " has a color of " + this.color + ". The price is $" + this.price + 
				 ". And its weight is " + this.weight + "lbs.";
	}
	
	
	
	
}
