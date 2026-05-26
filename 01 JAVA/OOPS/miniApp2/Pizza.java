package OOPS.miniApp2;

public class Pizza extends FoodItem
{
	String size;
	
	
	public Pizza()
	{
		super();
	}
	
	public Pizza(String name , double price , int qty , String size)
	{
		super(name , price , qty);
		this.size = size;
		
		
	}

}
