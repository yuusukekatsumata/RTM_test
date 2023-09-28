package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.controller.form.TestForm;
import com.example.demo.domain.dao.TestMapper;
import com.example.demo.domain.dto.TestDto;
import com.example.demo.domain.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	TestMapper testMapper;
	
	@Autowired
	TestService testService;
	
	@GetMapping("/hellow")
	public String hello(Model model,TestForm testForm) {
	       model.addAttribute("form",testForm);
			   return "index";
	}
	
	@PostMapping("/post")
	public String displayList(Model model,@ModelAttribute TestForm form) {
		System.out.println(form.getName());
		TestDto testdto = new TestDto();
		TestDto returndto = new TestDto();
		TestForm returnform = new  TestForm();
		BeanUtils.copyProperties(form, testdto);
		returndto = testService.create(testdto);
		BeanUtils.copyProperties(returndto, returnform);
		model.addAttribute("form", returnform);
		return "index";
	}

//	@GetMapping("/")
//	public String index() {
//		
//		testMapper.insert();
//		return "index";
//	}
}
