package com.aaa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aaa.service.AdminBiz;

/**
 * @author TeacherChen
 * @description 管理员业务控制器
 * @company AAA软件
 * @classname Qy78
 * 2019年1月19日下午1:48:16
 */
@Controller
public class AdminController {
	@Autowired
	private AdminBiz adminBizImpl;

	@RequestMapping("/findAllAdmins")
	public  ModelAndView findAllAdmins( ModelAndView mv) {
		System.out.println("================开始查询=================");
		long start=System.currentTimeMillis();
		List<Map<String,Object>> adminList= adminBizImpl.findAllAdmins();
		long end=System.currentTimeMillis();
		System.out.println("================结束查询=================");
		System.out.println("查询花费时间："+(end-start));
		mv.addObject("adminList", adminList);
		mv.setViewName("showAdmins");
		return mv;

	}
	
	@RequestMapping("/delAdminById")
	public String delAdminById(String id) {
		adminBizImpl.delAdminById(id);
		return "redirect:findAllAdmins";

	}
}
