package com.example.demo.domain.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.dao.TestMapper;
import com.example.demo.domain.dto.TestDto;
import com.example.demo.domain.service.TestService;

@Service
public class TestServiceimpl implements TestService {

	@Autowired
	private TestMapper testMapper;

	@Override
	public TestDto create(TestDto testdto){
		
		testMapper.create();
		
		return testdto;
	}

}