
public class Room extends Abstract{

	public int TV;

	Room(int beds, float price, boolean status, String name, int TV) {
		super(beds, price, status, name);
		this.TV = TV;	
	}
	
	@Override
		public void printInfo() {
		System.out.println( name + "'s "+ "Room:   "  + "  Status -  " + status + "  Beds -  " + beds + "  Price -  " + price + "$" + "  TV -  " + TV);
	}
}
