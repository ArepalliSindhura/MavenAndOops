package epam.Oops;

public class DryFruitsChocolate extends Weight{
	float weight;
	float price;
	int quantity;
	@Override
	float calculatewt(int quantity, float weight) { 
		// TODO Auto-generated method stub
		/*float totalwt;
		totalwt = quantity * weight;*/
		return quantity*weight;
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
	public DryFruitsChocolate(float weight, float price, int quantity) {
		super();
		this.weight = weight;
		this.price = price;
		this.quantity = quantity;
	}
	public DryFruitsChocolate() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DryFruitsChocolate [weight=" + weight + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
