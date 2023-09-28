package com.example.demo.domain.dao.daoimpl;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.dao.TestMapper;
import com.example.demo.domain.entity.TestEntity;

@Mapper
public class TestDaoimpl implements TestMapper{

	@Override
	public
	TestEntity create(){

		return null;
	}
	
}
