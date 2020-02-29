package epam.Oops;

public class Ladoo extends Weight{
	float weight;
	float price;
	int quantity;
	@Override
	float calculatewt(int quantity, float weight) { 
		// TODO Auto-generated method stub
		float totalwt;
		totalwt = quantity * weight;
		return 0;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Ladoo(float weight, float price, int quantity) {
		super();
		this.weight = weight;
		this.price = price;
		this.quantity = quantity;
	}
	public Ladoo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DryFruitsChocolate [weight=" + weight + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
