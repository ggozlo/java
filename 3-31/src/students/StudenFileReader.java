package students;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class StudenFileReader 
{
	static void sfr(ArrayList<Student> list)
	{

		try 
		{
			FileReader fr = new FileReader("E:/Students.txt");
			BufferedReader br =new BufferedReader(fr);
			while(true)
			{

				String line = br.readLine();
				if(line==null) break;
				String [] data = line.split(" ");
				Student st = new Student();
				st.setSchool(data[0]);
				st.setSchoolClass(Integer.parseInt(data[1]));
				st.setName(data[2]);
				st.setKor(Integer.parseInt(data[3]));
				st.setEng(Integer.parseInt(data[4]));
				st.setMat(Integer.parseInt(data[5]));
				st.setSci(Integer.parseInt(data[6]));
				list.add(st);
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
	}
}
