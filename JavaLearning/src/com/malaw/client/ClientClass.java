package com.malaw.client;

import com.malaw.dao.databaseConnection;
import com.malaw.simpleinterest.SimpleInterest;

public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		databaseConnection DBC = new databaseConnection();
		DBC.getMongoDBConnection();
		SimpleInterest SI = new SimpleInterest();
		SI.calculateSI(1,1,1);
		
		
	}

}
