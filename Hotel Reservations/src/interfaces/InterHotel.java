package interfaces;

public interface InterHotel {
	public void addRoom(String roomtype, String bedtype, Integer rNumber, Integer price); 
	public void addCustomer(String nameaux);
	public void seeCustomers(); 
	public void seeRooms();
	public void seeEmptyRooms();
	public int assignRoom(String s);
	public void seeBookedRooms();
	public int checkoutCustomer(String s);
	public void getPrice(Integer n);
}


