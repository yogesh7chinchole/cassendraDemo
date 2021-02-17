package org.suite.cass.test.convertor;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.suite.cass.test.model.TestInput;
import org.suite.cass.test.model.TestModel;

@Component
public class InputToModelConvertor implements Converter<TestInput,TestModel>{

	@Override
	public TestModel convert(TestInput source) {
			
		TestModel testModel = new TestModel();
		
		//testModel.setId(UUID.randomUUID());
		testModel.setDescription(source.getDescription());
		testModel.setPrice(source.getPrice());
		
		return testModel;
	}
	
	
	

}
