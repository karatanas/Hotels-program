
public class Apartment extends Abstract{
	public int balcony;
	public int baths;

	Apartment(int beds, float price, boolean status, String name, int baths, int balcony) {
		super(beds, price, status, name);
		this.baths = baths;
		this.balcony = balcony; 
		
	}
	
	@Override
		public void printInfo() {
		System.out.println( name + "'s "+ "Apartment:   "  + "  Status -  " + status + "  Beds -  " + beds + "  Price -  " + price + "$" + " Baths -  " + baths + " Balcony -  " + balcony);
	}
		
	

}
