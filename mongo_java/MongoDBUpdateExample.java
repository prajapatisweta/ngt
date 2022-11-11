import java.net.UnknownHostException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;

import com.mongodb.DBCollection;
import com.mongodb.DBObject;

import com.mongodb.MongoClient;
import com.mongodb.WriteResult;


public class MongoDBUpdateExample 
{

	public static void main(String[] args) throws UnknownHostException 
	{
		MongoClient mongo = new MongoClient("localhost", 27017);

	System.out.println("Connected to the database successfully");  
      
    
     

		DB db = mongo.getDB("myDb1");
		
		DBCollection col = db.getCollection("sampleCollection1");
 		System.out.println("Collection sampleCollection1 selected successfully");		
		
		//Update single field in a single document
		DBObject query = new BasicDBObject("id", "10");
		DBObject update = new BasicDBObject();
		
		update.put("$set", new BasicDBObject("likes",300));		
		WriteResult result = col.update(query, update);		
		System.out.println("Error updating");
		//mongo.close();
				
	}

}