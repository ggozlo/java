package ch17.domain.userinfo.dao;

import ch17.domain.userinfo.UserInfo;

public interface UserInfoDao
{
	void insertUserInfo(UserInfo userinfo);
	void updateUserInfo(UserInfo userinfo);
	void deleteUserInfo(UserInfo userinfo);
}
