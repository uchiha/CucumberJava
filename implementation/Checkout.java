package implementation;

public class Checkout 
{
	int totalPrice;
	
	public void add(int count, int price) 
	{
		totalPrice = count * price;
	}
	
	public int total()
	{
		return totalPrice;
	}
}