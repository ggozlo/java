package ch17.domain.userinfo.dao.mysql;

import ch17.domain.userinfo.UserInfo;
import ch17.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao
{

	@Override
	public void insertUserInfo(UserInfo userinfo)
	{
		System.out.println("Insert into MySQL DB userID =" + userinfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userinfo) 
	{
		System.out.println("Update into MySQL DB userID =" + userinfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userinfo) 
	{
		System.out.println("Delete into MySQL DB userID =" + userinfo.getUserId());
		
	}

}
