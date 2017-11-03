package com.malaw.dao;

import java.net.UnknownHostException;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class databaseConnection {
	
	public void getMongoDBConnection() {
		
	try {
		MongoClient mongoClient = new MongoClient();
		
		DB db = mongoClient.getDB("mycustomers");
		
		DBCollection table = db.getCollection("customers");
		
		System.out.println(table.count());
		
		System.out.println(table.getCount());
		
		BasicDBObject searchQuery2 = new BasicDBObject().append("first_name", "Malaw");
		
		DBCursor cursor2 = table.find(searchQuery2);
		
		System.out.println("Inside the getMongoDBConnection Method ");
		
		while (cursor2.hasNext()) {
			System.out.println(cursor2.next());
		}
	}	
	catch(MongoException mge) {
		mge.printStackTrace();
	}	
	
	}
}
