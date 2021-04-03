package ch17.web.userinfo;

import java.io.FileInputStream;
import java.util.Properties;

import ch17.domain.userinfo.UserInfo;
import ch17.domain.userinfo.dao.UserInfoDao;
import ch17.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch17.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient 
{
	public static void main(String [] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("dp.properties");
		Properties prop = new Properties(); // ������ �ִ� �ڷ� (key = value) �� �� ������ �о�ü� ����
		prop.load(fis);
		String dbType = prop.getProperty("DBTYPE"); // DBTYPE �� ��Ī ���� ������
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("ggozlo");
		userInfo.setPassword("1133");
		userInfo.setUserNmae("���ѹ�");
		
		
		UserInfoDao userInfoDao = null ; // �������̽� ����
		
		if ( dbType.equals("ORACLE"))
		{
			userInfoDao = new UserInfoOracleDao(); // �������� Ȱ�� UserInfoOracleDao �� UserInfoOracleDao �� Ÿ���̱� ������ �ν��Ͻ��� ���ǵ� ��� ��� ����
		}
		else if ( dbType.equals("MYSQL"))
		{
			userInfoDao = new UserInfoMySqlDao();
		}
		else
		{
			System.out.println("db error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		
	}
}
