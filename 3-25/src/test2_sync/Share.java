package test2_sync;

public class Share
{
	int data;
	void up()
	{
		
//		if(data>=3)
//		{
//			try
//			{
//				System.out.println("증가중시!");
//				wait();
//			}
//			catch (InterruptedException e)
//			{
//				e.printStackTrace();
//				// TODO: handle exception
//			}
//		}
		
		data++;
	//	notifyAll();
		System.out.println("1 증가"+data);
	}
	
	void down()
	{
		
		
//		if(data<1)
//		{
//			try
//			{
//				System.out.println("감소중지");
//				wait();
//			}
//			catch (InterruptedException e)
//			{
//				e.printStackTrace();
//				// TODO: handle exception
//			}
//		}
		
		data--;
//		notifyAll();
		
		System.out.println("1 감소"+data);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
}
