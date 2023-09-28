package com.example.demo.domain.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.entity.TestEntity;

@Mapper
public interface TestMapper {
	
	TestEntity create();

}