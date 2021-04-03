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
		Properties prop = new Properties(); // 쌍으로 있는 자료 (key = value) 를 한 쌍으로 읽어올수 있음
		prop.load(fis);
		String dbType = prop.getProperty("DBTYPE"); // DBTYPE 의 대칭 값을 가져옴
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("ggozlo");
		userInfo.setPassword("1133");
		userInfo.setUserNmae("양한범");
		
		
		UserInfoDao userInfoDao = null ; // 인터페이스 선언만
		
		if ( dbType.equals("ORACLE"))
		{
			userInfoDao = new UserInfoOracleDao(); // 다형성을 활용 UserInfoOracleDao 는 UserInfoOracleDao 의 타입이기 떄문에 인스턴스에 정의된 기능 사용 가능
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
