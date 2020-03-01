package epam.Oops;
import java.util.*;
public class Gifts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sweetsList = new String[100];
		int quantityList[] = new int[100];
		int ch;
		Boolean n = true;
		int quantity;
		int weight;
		int price;
		Weight sweets;
		float totalwt;
		float giftboxwt = 0;
		int choice;
		int i = 0;
		while(n){
			System.out.println("Choose a sweet or candy");
			System.out.println("These are the chcolates");
			System.out.println("1. DairyMilk");
			System.out.println("2. Snickers");
			System.out.println("These are the sweets");
			System.out.println("3. Kala Jamun");
			System.out.println("4. Ladoo");
			System.out.println("enter the option");
			ch = sc.nextInt();
			switch(ch){
			case 1:
				System.out.println("enter the quantity");
				quantity = sc.nextInt();
				System.out.println("enter the weight");
				weight = sc.nextInt();
				System.out.println("enter the price");
				price = sc.nextInt();
				sweets = new DairyMilk(weight, price, quantity);
				totalwt = sweets.calculatewt(quantity, weight);
				sweetsList[i] = "DairyMilk";
				quantityList[i] = quantity;
				giftboxwt += totalwt;
				System.out.println("The weight of Dairymilk chocolates in gift is " + totalwt);
				System.out.println("Dailymilk counting done!!");
				System.out.println("Do you want to select any other sweet? Please type 1 for yes and 0 for no..");
				choice = sc.nextInt();
				i++;
				if(choice == 1){
					n = true;
					break;
				}else{
					n = false;
					break;
				}
				
			case 2:
				System.out.println("enter the quantity");
				quantity = sc.nextInt();
				System.out.println("enter the weight");
				weight = sc.nextInt();
				System.out.println("enter the price");
				price = sc.nextInt();
				sweets = new Snickers(weight, price, quantity);
				totalwt = sweets.calculatewt(quantity, weight);
				sweetsList[i] = "Snickers";
				quantityList[i] = quantity;
				giftboxwt += totalwt;
				i++;
				System.out.println("The weight of Snickers chocolates in gift is " + totalwt);
				System.out.println("Snickers counting done!!");
				System.out.println("Do you want to select any other sweet? Please type 1 for yes and 0 for no..");
				choice = sc.nextInt();
				if(choice == 1){
					n = true;
					break;
				}else{
					n = false;
					break;
				}
				
			case 3:
				System.out.println("enter the quantity");
				quantity = sc.nextInt();
				System.out.println("enter the weight");
				weight = sc.nextInt();
				System.out.println("enter the price");
				price = sc.nextInt();
				sweets = new KalaJamun(weight, price, quantity);
				totalwt = sweets.calculatewt(quantity, weight);
				sweetsList[i] = "KalaJamun";
				quantityList[i] = quantity;
				giftboxwt += totalwt;
				System.out.println("The weight of Kala Jamun sweets in gift is " + totalwt);
				System.out.println("Kalajamun counting done!!");
				System.out.println("Do you want to select any other sweet? Please type 1 for yes and 0 for no..");
				choice = sc.nextInt();
				i++;
				if(choice == 1){
					n = true;
					break;
				}else{
					n = false;
					break;
				}
				
			case 4:
				System.out.println("enter the quantity");
				quantity = sc.nextInt();
				System.out.println("enter the weight");
				weight = sc.nextInt();
				System.out.println("enter the price");
				price = sc.nextInt();
				sweets = new Ladoo(weight, price, quantity);
				totalwt = sweets.calculatewt(quantity, weight);
				sweetsList[i] = "Ladoo";
				quantityList[i] = quantity;
				giftboxwt += totalwt;
				System.out.println("The weight of Ladoo chocolates in gift is " + totalwt);
				System.out.println("Ladoo counting done!!");
				System.out.println("Do you want to select any other sweet? Please type 1 for yes and 0 for no..");
				choice = sc.nextInt();
				i++;
				if(choice == 1){
					n = true;
					break;
				}else{
					n = false;
					break;
				}
				default :
					System.out.println("Please enter numbers from 1 to 4 only");
			}
		}
		System.out.println("the total weight of gift box is " + giftboxwt);
		System.out.println("The sweets in the box are ");
		for(int j = 0; j < sweetsList.length; j++){
			System.out.println(sweetsList[j]);
		}
	}

}
