package hotel;

//import java.util.ArrayList;

public class Room {
	
	String roomtype;
	String bedtype;
	Integer price;
	boolean booked;
	//ArrayList<Integer> guest;
	Integer rNumber;
	
	public Room(String roomtype, String bedtype, Integer rNumber, Integer price){
		//this.guest = new ArrayList<Integer>();
		this.roomtype = roomtype;
		this.bedtype = bedtype;
		this.rNumber=rNumber;
		this.price = price;
	}
	
	public void setPrice(Integer price){
		this.price = price;
	}
	
	public int getPrice(){
		return this.price;
	}

	
	public void book(boolean booked){
		this.booked = booked;
	}
	
}
