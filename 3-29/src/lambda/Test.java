package lambda;

public class Test 
{

	public static void main(String[] args) 
	{
//		Korea kk = new Korea();
//		Thread tt = new Thread(kk);
//		tt.start();
		
//		Korea kk = new Korea();
//		kk.start();
		
//		//�͸� Ŭ���� - Ŭ���� ���� ���� ���� 1ȸ�� Ŭ���� ����
//		Runnable rr = new Runnable() 
//		{
//			
//			@Override
//			public void run() 
//			{
//				for(int i=0;i<=10;i++)
//				{
//					System.out.println(i);
//				}	
//			}
//		};
//		Thread th = new Thread(rr);
//		th.start();
		
		// ���ٽ�
//		Runnable rr = ()->{ for(int i=0;i<=10;i++)System.out.println(i); };
//		Thread td = new Thread(rr);
//		td.start();
		
		Thread tr = new Thread( () -> { for(int i=0;i<=10;i++) System.out.println(i); } );
		tr.start();
	}

}
