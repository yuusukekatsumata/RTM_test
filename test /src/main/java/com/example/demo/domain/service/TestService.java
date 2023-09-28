package com.example.demo.domain.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.dto.TestDto;

@Service
public interface TestService {

	public TestDto create(TestDto testdto);
	
}

