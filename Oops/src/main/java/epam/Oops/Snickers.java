package epam.Oops;

public class Snickers extends DryFruitsChocolate {
	float weight;
	float price;
	int quantity;
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
	public Snickers(float weight, float price, int quantity, float weight2, float price2, int quantity2) {
		super(weight, price, quantity);
		weight = weight2;
		price = price2;
		quantity = quantity2;
	}
	public Snickers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Snickers(float weight, float price, int quantity) {
		super(weight, price, quantity);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DairyMilk [weight=" + weight + ", price=" + price + ", quantity=" + quantity + "]";
	}
}
