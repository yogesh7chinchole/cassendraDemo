package org.suite.cass.test.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.suite.cass.test.interfaces.ITestService;
import org.suite.cass.test.model.TestInput;


@RestController
@RequestMapping("/cassendra")
public class CassendraController {

	
	@Autowired
	ITestService testService;
	
	@RequestMapping(value = "/createTest", method = RequestMethod.POST)
	public Serializable createTest(@RequestBody TestInput testInput) {
		
		return testService.create(testInput);
		
	}
	
	
}
