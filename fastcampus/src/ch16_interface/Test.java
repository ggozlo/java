package ch16_interface;

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

	}

}
// �������̽� ��� ���� 
// Ŭ������ ���α׷��� �����ϴ� ����� ��������� ���� 
// ������ Ŭ���̾�Ʈ �ڵ���� ����̸� Ŭ������ ���α׷��� �����ϴ� ��
//Ŭ���̾�Ʈ ���α׷��� �������̽��� ����� �޼��� ���� ���� �̸� ������ Ŭ������ ����Ҽ� ����
// � ��ü���ϳ��� �������̽� Ÿ���̶�� ���� �� �������̽��� �����ϴ� ��� �޼��带 �����ߴٴ� �ǹ���
// dao  = ������ ���� ������Ʈ