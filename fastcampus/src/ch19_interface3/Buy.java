package ch19_interface3;


public interface Buy 
{
	void buy();
	default void order()
	{
		System.out.println("buy order");
	}
}
