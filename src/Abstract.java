
public abstract class Abstract {
	public int beds;
	public float price;
	public boolean status;
	public String name;
	
	Abstract(int beds, float price, boolean status, String name){
		this.beds = beds;
		this.price = price;
		this.status = status;
		this.name = name;
	}	
	
	public float price() {
		return price;
	}	
	
	public abstract void printInfo();
	
}
