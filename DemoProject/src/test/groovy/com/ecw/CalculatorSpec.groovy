package com.ecw

import mockit.MockUp
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class CalculatorSpec extends Specification {
	
    Calculator c = new Calculator(); 
	
	
	
	@Unroll
	
	def setupSepc()
	{
		
	}
	
	def GetTotalOfGivenNumber () {
		given: "Input String is given"
		
		when:"Input String should be number"
		def result = c.add(str);
		
		then: "it should return proper value"
		results == result  
		
		where:
		str      | results
		""       | 0
		"1"      | 1
		"1,2"    | 3
		"1,2,3"  | 6
		"1\n2,3" | 6
	}
	
}
