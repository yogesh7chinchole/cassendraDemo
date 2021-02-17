package org.suite.cass.test.services;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.suite.cass.test.convertor.InputToModelConvertor;
import org.suite.cass.test.interfaces.ICassendraRepo;
import org.suite.cass.test.interfaces.ITestService;
import org.suite.cass.test.model.TestInput;
import org.suite.cass.test.model.TestModel;

@Service
public class TestService implements ITestService {

	
	InputToModelConvertor inputToModelConvertor;
	
	ICassendraRepo repo;
	
	@Autowired
	TestService(ICassendraRepo cassRepo,InputToModelConvertor inputToModelConvertor){
		this.inputToModelConvertor = inputToModelConvertor;
		this.repo = cassRepo;
	}
	
	
	@Override
	public Serializable create(Serializable testInput) {
		TestInput test = (TestInput) testInput;
		TestModel model;
		
		model = inputToModelConvertor.convert(test);
		
		//this.repo.save(model);
		this.repo.insert(model);
		return model;
	}

	

}
