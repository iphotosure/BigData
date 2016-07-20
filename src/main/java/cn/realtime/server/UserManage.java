/**********************************************************************
 * 
 * Company: Neusoft Xikang Healthcare Technology Co., Ltd.
 * Department: Terminal product development department
 * Copyright: Copyright (c) 2012 
 *
 * @Title  UserManage.java
 * @Package  org.ioc.UserServer
 * @Description  TODO
 * 
 * @author  Terminal-sure
 * @date  2016年7月18日 下午5:14:30
 * @version  Ver.0.1
 * 
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * @Change:
 *
 * @Rev.			@Date				@By				@Remark
 *  
 ***********************************************************************/


package cn.realtime.server;

import java.util.List;

import cn.realtime.procol.UserObject;

/**
 *
 * @ClassName  UserManage
 * 
 * @Description  TODO
 * 
 * @author sure
 * 
 * @date 2016年7月18日 下午5:14:30
 * 
 */

public interface UserManage {

	/*
	 * 用户注册接口 
	 */
	public UserObject UserRegister(UserObject user);
	/*
	 * 用于用户登录
	 * 
	 */
	public UserObject UserLogin(String UserName,String Passwd);
	/*
	 * 用于获得用户信息
	 */
	public UserObject GetUserInfo(int UserID);
	/*
	 * 用于更给用户个人信息
	 */
	public UserObject ChangeUserInfo(UserObject user);
	/*
	 * 用于修改用户密码
	 */
	public UserObject ChangePwd(String UserName,String NewPasswd,String OldPasswd);
	/*
	 * 用于找回用户密码
	 * 具体方式未定
	 */
	public String FindPasswd(String TellNum);
	/*
	 * 用户获取该用户所管理的用户
	 */
	public List<UserObject> GetUserList(int UserID); 
	/*
	 * 用于添加该用户所管理的用户
	 */
	public List<UserObject> AddUserList(int UserID); 
	/*
	 * 用于获得用户所在分组
	 */
	public int GetGroupInfo(int UserID);
}
