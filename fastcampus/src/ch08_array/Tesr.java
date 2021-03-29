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
		System.arraycopy(library, 0, copylibrary, 0, 5); // 배열 복사 함수 , (원배열, 원배열 복사 시작 인덱스, 피배열, 피배열 저장시작 인덱스, 복사할 인자의 수)
														// 실제로는 참조 주소를 복사한다 떄문에 원 배열의 값을 수정하면 둘다 값이 변한다.
		for(Book b : copylibrary)
		{
			System.out.println(b); //주소가 같다
			b.showInfo();
			
		}
	}

}
