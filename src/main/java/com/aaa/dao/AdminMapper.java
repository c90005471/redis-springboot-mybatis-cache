package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
@Component
@Mapper
public interface AdminMapper {
	List<Map<String,Object>>	findAllAdmins();
	void  delAdminById(String id) ;

}
