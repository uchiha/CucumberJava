package implementation;
import java.util.ArrayList;
import java.util.List;

public class Checkout 
{
	private int totalPrice = 0;
	private int totalBananaPrice = 0;
	private int totalApplePrice = 0;
	private List<Integer> totalPricesOfBananas  = new ArrayList<>();
	private List<Integer> totalPricesOfApples  = new ArrayList<>();
	
	public void add(int count, int price, String fruitName) 
	{
		if(fruitName.startsWith("banana"))
		{
			 totalPricesOfBananas.add(count * price);
	    }
		else
			totalPricesOfApples.add(count * price);
	}
	
	private void totalMyBananas()
	{
		int sum = 0;
		for (int i = 0; i < totalPricesOfBananas.size(); i++)
		{
			sum += totalPricesOfBananas.get(i);
		}
		totalBananaPrice = sum;
	}
	
	private void totalMyApples()
	{
		int sum = 0;
		for (int i = 0; i < totalPricesOfApples.size(); i++)
		{
			sum += totalPricesOfApples.get(i);
		}
		totalApplePrice = sum;
	}
	
	public int total()
	{
		
		totalMyBananas();
		totalMyApples();
		//System.out.println("the Banana is: " + totalBananaPrice);
		//System.out.println("the Apple is: " + totalApplePrice);
		totalPrice = totalApplePrice + totalBananaPrice;
		return totalPrice;
	}
}