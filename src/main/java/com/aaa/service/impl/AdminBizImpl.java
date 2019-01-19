package com.aaa.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.AdminMapper;
import com.aaa.service.AdminBiz;

@Service
public class AdminBizImpl implements AdminBiz {
	
	@Autowired
	private AdminMapper adminMapper;

	@Override
	public List<Map<String, Object>> findAllAdmins() {
		
		return adminMapper.findAllAdmins();
	}

	@Override
	public void delAdminById(String id) {
		adminMapper.delAdminById(id);
		
	}

}
