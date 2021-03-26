package test2_sync;

public class Run {

	public static void main(String[] args) 
	{
		Share ss = new Share();
		Down dd = new Down(ss);
		Up uu = new Up(ss);
		

		
		uu.start();
		dd.start();
	}

}


