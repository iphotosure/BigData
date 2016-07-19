/**********************************************************************
 * 
 * Company: Neusoft Xikang Healthcare Technology Co., Ltd.
 * Department: Terminal product development department
 * Copyright: Copyright (c) 2012 
 *
 * @Title  DataServer.java
 * @Package  org.ioc.UserServer
 * @Description  TODO
 * 
 * @author  Terminal-sure
 * @date  2016年7月18日 下午4:57:10
 * @version  Ver.0.1
 * 
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * @Change:
 *
 * @Rev.			@Date				@By				@Remark
 *  
 ***********************************************************************/


package org.ioc.DataServer;

import org.ioc.server.procol.DataObject;
import org.ioc.server.procol.QueryObject;

/**
 *
 * @ClassName  DataServer
 * 
 * @Description  TODO
 * 
 * @author sure
 * 
 * @date 2016年7月18日 下午4:57:10
 * 
 */

public interface DataManage {

	    /*
	     * 用于用户上传数据
	     */
		public void PutData(DataObject data);
		/*
		 * 用于第三方用户实时监控数据
		 */
		public DataObject ShowData(int UserID);
		/*
		 * 用于查询历史数据
		 */
		public 	DataObject Query(QueryObject query);
		
}
