package lambda;
//������ �ڷ�� ��Ȯ�� ���� �Է¹ޱ⸦ ���Ѵ� ���
// �����Է�
public class EnumTest
{
	enum gender {MAN,WOMAN}
	static String MAN = "����";
	static String WOMAN ="����";
	
	enum week {MONDAY, TUSEDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
	String MONDAY = "������";
	String TUSEDAY = "ȭ����";
	String WEDNESDAY = "������";
	String THURSDAY = "�����";
	String FRIDAY = "�ݿ���";
	String SATURDAY = "�����";
	String SUNDAY = "�Ͽ���";
	
	public static void main(String[] args)
	{	
//		gender gd; // ������ ����ϴ� ����
//		gd = gender.WOMAN;
//		System.out.println(gd);
		
//		String ab;
//		ab= EnumTest.MAN;
//		System.out.println(ab);
//		System.out.println(gender.valueOf("SAL"));
//		System.out.println(gender.MAN); 
		
		System.out.println(getMAN());
	}

	public static String getMAN() {
		return MAN;
	}

	public static String getWOMAN() {
		return WOMAN;
	}
	

}
