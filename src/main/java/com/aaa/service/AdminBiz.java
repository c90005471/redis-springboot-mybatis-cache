package com.aaa.service;

import java.util.List;
import java.util.Map;

/**
 * @author TeacherChen
 * @description 管理员业务接口
 * @company AAA软件
 * @classname Qy78
 * 2019年1月19日下午1:51:48
 */
public interface AdminBiz {
	List<Map<String,Object>>	findAllAdmins();

	void delAdminById(String id);

}
