package com.ecw

import mockit.MockUp
import spock.lang.Specification
import mockit.Mock



class DemoSpec extends Specification {
	MockUp<Demo> mockDemoDAO



	void mockMessageService(){
		mockDemoDAO = new MockUp<Demo>() {
					@Mock public String getName(DemoDAO objDAO) {
						return "TEST"
					}
				}
	}




	def getDataName() {
		given: "DemoDAO Object pass as Input paramter"
		def objDemoDAO = new DemoDAO()
		objDemoDAO.setName("Jaydip")
		when:"Calling getName method from DemoDAO class"
		mockMessageService()
		def demo= new Demo()
		def result = demo.getName(objDemoDAO)
		print result;
		then:"result should be true"
		result.equalsIgnoreCase("TEST")
	}
}

