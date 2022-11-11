import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase; 

import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential; 

import org.bson.Document;   
import com.mongodb.client.model.Filters; //it store filter property

public class DeletingDocuments 
{ 
   
   public static void main( String args[] ) 
   {   
      MongoClient mongo = new MongoClient( "localhost" , 27017 );// Creating a Mongo client   
      
      System.out.println("Connected to the database successfully");        
      
      MongoDatabase database = mongo.getDatabase("myDb1"); // Accessing the database 

      MongoCollection<Document> collection = database.getCollection("sampleCollection1");
      System.out.println("Collection sampleCollection selected successfully"); 

      // Deleting the documents 
      collection.deleteOne(Filters.eq("id", 1)); 
      System.out.println("Document deleted successfully...");        
   } 
}