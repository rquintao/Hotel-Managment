package hotel;

public class Customer {
	String name;
	Integer age;
	Boolean roomAssigned;
	Integer roomNumber;
	
	public Customer(String nameaux){

		System.out.println(nameaux);
		String[] stringparts = nameaux.split("\\|");

		this.name = stringparts[0];
		this.age =  Integer.parseInt(stringparts[1]);
		
		roomAssigned = false;
	}
	
	public boolean isAssigned(){
		return roomAssigned;
	}
	
	public void assignRoom(Integer n){
		this.roomNumber = n;
		this.roomAssigned = true;
	}
	
	public void checkoutCustomer(){
		this.roomAssigned = false;
		this.roomNumber = null;
	}
}
