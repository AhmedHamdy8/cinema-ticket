
package main;

public class Seat {
      protected  int seatNumber;
	protected String isReserved;
	
	public Seat(String isReserved, int seatNumber)
	{
		this.isReserved = isReserved;
		this.seatNumber = seatNumber;
	}
	
	
	public void setSeatNumber(int seatNumber)
	{
		this.seatNumber = seatNumber;
	}
	
	public int getSeatNumber()
	{
		return this.seatNumber;
	}
	

	
		
}
