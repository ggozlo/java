package javaf2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ProductFileInput 
{
	public static void fileInput(ArrayList<Product> list)
	{
		
		
		try 
		{
			FileReader fr = new FileReader("E:/Test.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true)
			{
				String data =  br.readLine();
				if(data == null) break;
				String [] sa = data.split(",");
				int quantity = Integer.parseInt(sa[1]);
				int price = Integer.parseInt(sa[2]);
				list.add(new Product(sa[0],quantity,price,price*quantity));
			}
			br.close();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
