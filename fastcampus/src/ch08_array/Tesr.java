package ch08_array;

public class Tesr {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Book[] library = new Book[5];
		Book[] copylibrary = new Book[5];
//		for(int i=0;i<library.length;i++)
//		{
//			System.out.println(library[i]);
//		}
		
		library[0] = new Book("car","park");
		library[1] = new Book("car1","1park");
		library[2] = new Book("car2","2park");
		library[3] = new Book("car3","3park");
		library[4] = new Book("car4","4park");
		
		for(int i=0;i<library.length;i++)
		{
			System.out.println(library[i]);
			library[i].showInfo();
		}
		System.out.println("==========================");
		System.arraycopy(library, 0, copylibrary, 0, 5); // �迭 ���� �Լ� , (���迭, ���迭 ���� ���� �ε���, �ǹ迭, �ǹ迭 ������� �ε���, ������ ������ ��)
														// �����δ� ���� �ּҸ� �����Ѵ� ������ �� �迭�� ���� �����ϸ� �Ѵ� ���� ���Ѵ�.
		for(Book b : copylibrary)
		{
			System.out.println(b); //�ּҰ� ����
			b.showInfo();
			
		}
	}

}
