package ch10_arraylist;

import java.util.ArrayList;

import ch08_array.Book;


public class ArrList 
{

	public static void main(String[] args)
	{
		ArrayList<Book> library = new ArrayList<Book>(); // �迭, ���׸� ����
		library.add(new Book("��λ�1", "�ݰ���1")); // �߰� 
		library.add(new Book("��λ�2", "�ݰ���2"));
		library.add(new Book("��λ�3", "�ݰ���3"));
		library.add(new Book("��λ�4", "�ݰ���4"));
		library.add(new Book("��λ�5", "�ݰ���5"));
		
		library.forEach(l -> l.showInfo()); // ���ٽ� ���
	}
}
