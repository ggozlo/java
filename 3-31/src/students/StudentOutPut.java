package students;

import java.util.ArrayList;

public class StudentOutPut
{
	public static void printStudents(ArrayList<Student> list)
	{
		list.stream().forEach(s->
		System.out.println("�б���:"+s.getSchool()+" ��:"+s.getSchoolClass()+" �̸�:"+s.getName()+" ����:"+s.getKor()+
				" ����:"+s.getEng()+" ����:"+s.getMat()+" ����:"+s.getSci()+" ����:"+s.getTot()
				+" ���:"+s.getAvg()+" ����:"+s.getGredes()+" ����:"+s.getOrder()));
	}
}
