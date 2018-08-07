package starter;

import hotel.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
	static Hotel nhotel;
	static String[] roomtype = {"Penthouse", "Suite", "Normal"};
	static String[] bedtype = {"Single", "Double", "Queen"};
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		
		nhotel = new Hotel("BoraBora");
		
		//creating 15 rooms
		for (int i = 0; i < 15; i++){
			nhotel.addRoom(roomtype[rand.nextInt(2)], bedtype[rand.nextInt(3)],i+100);
		}
		
		loop:while(true){
			
			System.out.println("Enter 1 to see the rooms.");
			System.out.println("Enter 2 to see the empty rooms.");
			System.out.println("Enter 3 to create a new customer.");
			System.out.println("Enter 4 to see all customers.");
			System.out.println("Enter 5 to assign a room to a customer.");
			System.out.println("Enter 6 to see the rooms assigned.");
			System.out.println("Enter 7 to checkout customer.");
			System.out.println("Enter 0 to exit.");
			int n = scan.nextInt();
			
			switch(n){
				case 0: break loop;
				case 1: nhotel.seeRooms();
						break;
				case 2: nhotel.seeEmptyRooms();
						break;
				case 3: System.out.println("Enter the name|age.");
						scan.nextLine(); //to absorv the /n not read by nextInt
						String nameaux = scan.nextLine();
						nhotel.addCustomer(nameaux);
						break;
				case 4: nhotel.seeCustomers();
						break;
				case 5: System.out.println("Enter customer name|typeofbedroom|typeofbed.");
						scan.nextLine(); //to absorv the /n not read by nextInt
						String s = scan.nextLine();
						Integer result = nhotel.assignRoom(s);
						if (result>0){
							System.out.println("Room number " + result + " is assigned");
						}
						else{
							System.out.println("Error assigning room to customer!");
						}
						break;
				case 6: nhotel.seeBookedRooms();
						break;
				case 7: System.out.println("Enter customer name checkout.");
						scan.nextLine(); //to absorv the /n not read by nextInt
						Integer result2 = nhotel.checkoutCustomer(scan.nextLine().trim());
						if (result2 > 0) {
							System.out.println("Customer checked out");
						}
						else{
							System.out.println("Error checking out customer!");
						}
						break;		
			}
		}
		scan.close();
	}
	

}
