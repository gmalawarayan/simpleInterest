package com.malaw.simpleinterest;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService

public class SimpleInterest {
	
	int intPrinciple;
	int intRateOfInterest;
	int intNumberOfYears;
	int intSimpleInterest;
	int intAmount;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleInterest SI = new SimpleInterest();
		SI.calculateSI(10000, 7, 5);
		
		
		
	}
	@WebMethod
	public void calculateSI(int intPrinciple, int intRateOfInterest, int intNumberOfYears){
		
		intSimpleInterest = (intPrinciple * intRateOfInterest * intNumberOfYears)/100;
		
		System.out.println("Simple Interest Calculation Program");
		System.out.println("Principle: >>>"+intPrinciple);
		System.out.println("Number of Years: >>>"+intNumberOfYears);
		System.out.println("Rate Of Interest: >>>"+intRateOfInterest);
		System.out.println("Simple Interest: >>>"+intSimpleInterest);
		
		intAmount = intPrinciple + intSimpleInterest;
		
		System.out.println("Total Amount After Computing Simple Interest : >>>"+intAmount);
		
		
		
		
		
		
	}

}
