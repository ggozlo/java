package ch10_arraylist;

import java.util.ArrayList;

import ch08_array.Book;


public class ArrList 
{

	public static void main(String[] args)
	{
		ArrayList<Book> library = new ArrayList<Book>(); // 배열, 제네릭 선언
		library.add(new Book("백두산1", "금강산1")); // 추가 
		library.add(new Book("백두산2", "금강산2"));
		library.add(new Book("백두산3", "금강산3"));
		library.add(new Book("백두산4", "금강산4"));
		library.add(new Book("백두산5", "금강산5"));
		
		library.forEach(l -> l.showInfo()); // 람다식 출력
	}
}
