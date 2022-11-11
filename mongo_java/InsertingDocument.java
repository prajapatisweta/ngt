import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase; 

import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;

import org.bson.Document;    

public class InsertingDocument 
{   
   public static void main( String args[] ) 
   {  
      MongoClient mongo = new MongoClient( "localhost" , 27017 ); // Creating a Mongo client 
      System.out.println("Connected to the database successfully");  
      
     MongoDatabase database = mongo.getDatabase("myDb1");  // Accessing the database 

      MongoCollection<Document> collection = database.getCollection("sampleCollection1"); //accessing collection
      System.out.println("Collection sampleCollection1 selected successfully");

      Document document = new Document(); 
      document.append("id", 1);
      document.append("description", "AWP"); 
      document.append("likes", 100) ;
      document.append("url", "http://www.awp.com"); 
      document.append("by", "DOT NET Framework"); 
	document.append("project_by","Nutan");

	  
      collection.insertOne(document); 
	  
      System.out.println("Document inserted successfully");     
   } 
}
