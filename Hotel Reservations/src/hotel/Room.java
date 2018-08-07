package hotel;

//import java.util.ArrayList;

public class Room {
	
	String roomtype;
	String bedtype;
	Integer price;
	boolean booked;
	//ArrayList<Integer> guest;
	Integer rNumber;
	
	public Room(String roomtype, String bedtype, Integer rNumber){
		//this.guest = new ArrayList<Integer>();
		this.roomtype = roomtype;
		this.bedtype = bedtype;
		this.rNumber=rNumber;
	}
	
	public void setPrice(Integer price){
		this.price = price;
	}
	
	/*public void setGuest(Integer idGuest){
		this.guest.add(idGuest);
		System.out.println("Guest was matched to room!");
	}*/
	
	public void book(boolean booked){
		this.booked = booked;
	}
	
}
