package epam.Oops;

public class DairyMilk extends PlainChocolate {
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
	public DairyMilk(float weight, float price, int quantity) {
		super();
		this.weight = weight;
		this.price = price;
		this.quantity = quantity;
	}
	public DairyMilk() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	float calculatewt(int quantity, float weight){
		return super.calculatewt(quantity, weight);
	}
}
