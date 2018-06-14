import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float MaxPrice_of_Room = 0F;
		float MinPrice_of_Apartment = 9999.9F;

		ArrayList<Abstract> arr = new ArrayList<>();
		System.out.println("Enter number of Room: ");
		int NoR = sc.nextInt();

		for (int i = 0; i < NoR; i++) {
			System.out.println("Enter information of Room:  Beds---Price---Status---Name---TV");
			arr.add(new Room(sc.nextInt(), sc.nextFloat(), sc.nextBoolean(), sc.next(), sc.nextInt()));
		}

		System.out.println("Enter number of Apartment: ");
		int NoA = sc.nextInt();

		for (int i = 0; i < NoA; i++) {
			System.out.println("Enter information of Apartment:  Beds---Price---Status---Name---Baths---Balcony");
			arr.add(new Apartment(sc.nextInt(), sc.nextFloat(), sc.nextBoolean(), sc.next(), sc.nextInt(),
					sc.nextInt()));
		}

		System.out.println();
		System.out.println();

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getClass().getSimpleName().equals("Room")) {
				if (arr.get(i).price > MaxPrice_of_Room)
					MaxPrice_of_Room = arr.get(i).price;
			}
			if (arr.get(i).getClass().getSimpleName().equals("Apartment")) {
				if (arr.get(i).price < MinPrice_of_Apartment)
					MinPrice_of_Apartment = arr.get(i).price;

			}
			arr.get(i).printInfo();

		}
		System.out.println();
		System.out.println("Max price of rooms:  " + MaxPrice_of_Room + "$");
		System.out.println("Min price of apartments:  " + MinPrice_of_Apartment + "$");
		sc.close();
	}
}