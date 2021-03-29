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
		
//		//익명 클래스 - 클래스 파일 생성 없이 1회용 클래스 생성
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
		
		// 람다식
//		Runnable rr = ()->{ for(int i=0;i<=10;i++)System.out.println(i); };
//		Thread td = new Thread(rr);
//		td.start();
		
		Thread tr = new Thread( () -> { for(int i=0;i<=10;i++) System.out.println(i); } );
		tr.start();
	}

}
