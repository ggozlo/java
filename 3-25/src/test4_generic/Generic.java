package test4_generic;

import java.util.ArrayList;

public class Generic {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		Box<Integer> bb =new Box<Integer>();
//		bb.setKo(1133);
//		
//		Box<String> bx = new Box<String>();
//		bx.setKo("±º¿Õ»ê");
//		
//		System.out.println(bb.getKo());
//		System.out.println(bx.getKo());
		
		ArrayList<Score> list = new ArrayList<Score>();
		list.add(new Score("¹«±ÃÈ­",90,80,70));
		list.add(new Score("È«±æµ¿",68,57,74));
		list.add(new Score("±è´ë°¨",35,87,79));
		list.add(new Score("Á¤¾à¿ë",99,89,72));
		
		list.add(2,new Score("±Ý°­»ê", 99, 99, 99));
		for(Score k:list)
		{
			System.out.println(k.toString());

		}
	}

}
