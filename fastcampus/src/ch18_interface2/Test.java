package ch18_interface2;

// �������̽� 
// ��� �޼��尡 �߻�޼���� ����� (public abstract)
// ��� ������ ����� �����(public static final)
// ��������� ������ ����
public class Test
{

	public static void main(String[] args) 
	{
		int a = 10;
		int b = 2;
		Calc calc = new CompleteClalc(); // completecalc �� calc �� Ÿ���̱� ������ calc �� ȣ���ص� calc�� ������ �޼ҵ��
										// ����Ҽ� �ִ� ������ showInfo �޼ҵ�� completecalc������ ���̶� completecalc�� �����ؾ� �Ѵ�.
		System.out.println(calc.add(a, b));
		System.out.println(calc.substract(a, b));
		System.out.println(calc.times(a, b));
		System.out.println(calc.divide(a, b));

		calc.description();
		
		int [] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));
		
	}

}
// �������̽� ��� ���� 
// Ŭ������ ���α׷��� �����ϴ� ����� ��������� ���� 
// ������ Ŭ���̾�Ʈ �ڵ���� ����̸� Ŭ������ ���α׷��� �����ϴ� ��
//Ŭ���̾�Ʈ ���α׷��� �������̽��� ����� �޼��� ���� ���� �̸� ������ Ŭ������ ����Ҽ� ����
// � ��ü���ϳ��� �������̽� Ÿ���̶�� ���� �� �������̽��� �����ϴ� ��� �޼��带 �����ߴٴ� �ǹ���
// dao  = ������ ���� ������Ʈ



//java 8
//����Ʈ �޼��� 
//Ŭ������ �ν��Ͻ�ȭ ������ ��� ���� 
//default Ű���� ��� -> �޼ҵ� �����Ҽ� ����, �����ǵ� ������

//���� �޼��� �ν��Ͻ� ������ ��� ���� �������̽� Ÿ������ ��� ������ �޼���

//java 9
//private �޼��� 
//�������̽� ���ο��� ����ϱ� ���� �����ϴ� �޼��� 
//default �޼��峪 static �޼��忡�� ���
