package implementation;

public class Checkout 
{
	private int totalPrice = 0;
	
	public void add(int count, int price) 
	{
		totalPrice += (count * price);
	}
	
	public int total()
	{
		return totalPrice;
	}
}