package stream;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Korea> list = new ArrayList<Korea>();
		list.add(new Korea("��λ�", 20,70));
		list.add(new Korea("���ǻ�", 15,70));
		list.add(new Korea("����", 60,70));
		list.add(new Korea("�Ѷ��", 88,60));
		list.add(new Korea("���ǻ�", 97,60));
		list.add(new Korea("���ջ�", 97,70));
		
//		List<Korea> list =  Arrays.asList(
//				new Korea("��λ�", 20,50),
//				new Korea("���ǻ�", 15,70),
//				new Korea("���ѻ�", 60,78),
//				new Korea("�Ѷ��", 88,56),
//				new Korea("�ݰ���", 97,89));
		
//		for(Korea k : list)
//		{
//			System.out.println(k.toString());
//		}
//		System.out.println("Lambda");
//		list.forEach(s -> {System.out.println(s.toString());});
		
//		System.out.println("�̴�������");
//		Iterator<Korea> it = list.iterator();
//		while(it.hasNext())
//		{
//			Korea s = it.next();
//			System.out.println(s.toString());
//		}
//		
//		System.out.println("��Ʈ��");
//		Stream<Korea> st = list.stream();
//		st.forEach( s -> 
//		{  	String name = s.getName();
//			int age = s.getAge();
//			int score = s.getScore();
//			System.out.println(name+age+score); } );
		
		//���� ���                  ������ ������ Ÿ�� Ŭ���� �޽��    ��� ���ϱ�  �������·�(�ʼ�)
//		double avg = list.stream().mapToInt(Korea :: getScore).average().getAsDouble();
//		System.out.println(avg);
//		DecimalFormat df = new DecimalFormat("#,##0.##");
//		System.out.println(df.format(avg));
//		
//		// ���� ��
//		int tot = list.stream().mapToInt(Korea :: getScore).sum();
//		System.out.println(tot);

//		//���ǻ� ��ճ���
//		double average = list.stream().filter(m -> m.getName()=="���ǻ�").mapToInt(Korea::getAge).average().getAsDouble();
//		System.out.println(average);
		
//		// ���ǻ� �̸鼭 ������ 65�̻� 
//		double mmage = list.stream().filter(m -> m.getName()=="���ǻ�" && m.getScore() >=65 ).mapToInt(Korea::getAge).average().getAsDouble();
//		System.out.println(mmage);
		
		// �������� ����
		List<Korea> blist = list.stream().sorted(Comparator.comparing(Korea :: getAge).reversed()).collect(Collectors.toList());
		for(Korea k : blist)
		{
			System.out.println(k.toString());
		}
		
		//�������� ����
		list.stream().sorted(Comparator.comparing(Korea :: getName).reversed()).forEach(s-> System.out.println(s.toString()));
	}

}
