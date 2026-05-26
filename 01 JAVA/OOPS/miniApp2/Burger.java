package OOPS.miniApp2;

public class Burger extends FoodItem
{
	boolean isCheeseAdded;
	
	
	public Burger()
	{
		
	}


	public Burger(String name , double price , int qty , boolean isCheeseAdded)
	{
		super(name , price , qty);
		this.isCheeseAdded = isCheeseAdded;
		
		
	}
	

}
