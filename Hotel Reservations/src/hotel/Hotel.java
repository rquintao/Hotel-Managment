package hotel;

import java.util.ArrayList;

import interfaces.InterHotel;

public class Hotel implements InterHotel{
	String name;
	ArrayList<Room> lRooms;
	ArrayList<Customer> customers;
	
	public Hotel(String name){
		this.name = name;
		lRooms = new ArrayList<Room>();
		customers = new ArrayList<Customer>();
	}
	
	public void addRoom(String roomtype, String bedtype, Integer rNumber){
		this.lRooms.add(new Room(roomtype, bedtype, rNumber));
	}
	
	public void addCustomer(String s){
		this.customers.add(new Customer(s));
	}
	
	public void seeRooms(){
		for (Room nroom : lRooms){
			System.out.println("Room number: " + nroom.rNumber + " of type " + nroom.roomtype + " and bedtype " + nroom.bedtype + ".");
		}
	}
	
	public void seeEmptyRooms(){
		for (Room nroom : lRooms){
			if (nroom.booked == false){
				System.out.println("Room number " + nroom.rNumber + " is free.");
			}
		}
	}
	
	public void seeBookedRooms(){
		for (Customer cust : customers){
			if (cust.roomAssigned){
				System.out.println("Room number " + cust.roomNumber + " is occupied by customer " + cust.name + ".");
			}
		}
	}
	
	public void seeCustomers(){
		for (Customer cust : customers){
			System.out.println("Customer name : " + cust.name + " , customer age: " + cust.age + ".");
		}
	}
	
	public int assignRoom(String s){
		//String[] spliter = s.split("//|");
		String[] stringparts = s.split("\\|");
		
		for(Customer cust : this.customers){
			if (cust.name.trim().equals(stringparts[0].trim())){				
				if (cust.isAssigned()){
					System.out.println("Entra aqui!");
					return -1;
				}				
				for (Room nroom : lRooms){
					if (!nroom.booked && nroom.roomtype.trim().equals(stringparts[1].trim()) && nroom.bedtype.trim().equals(stringparts[2].trim())){
						nroom.book(true);
						cust.assignRoom(nroom.rNumber);
						return nroom.rNumber;
					}
				}
				return -1;
			}
		}
		
		return -1;
	}
	
	public int checkoutCustomer(String s){
		for(Customer cust : this.customers){
			if(cust.name.trim().equals(s.trim())){
				for (Room nroom : lRooms){
					if(nroom.rNumber == cust.roomNumber){
						nroom.booked=false;
						cust.checkoutCustomer();
						return 200;
					}
				}
			}
		}
		return -1;
	}
}
