import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase;

import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;   

import org.bson.Document; 
import java.util.Iterator; 
import com.mongodb.client.FindIterable; 

public class RetrievingAllDocuments 
{    
   public static void main( String args[] ) 
   {        
      MongoClient mongo = new MongoClient( "localhost" , 27017 );       
      System.out.println("Connected to the database successfully");  
      
      MongoDatabase database = mongo.getDatabase("myDb1");      
    
      MongoCollection<Document> collection = database.getCollection("sampleCollection1");
      System.out.println("Collection sampleCollection selected successfully"); 
      
      FindIterable<Document> iterDoc = collection.find(); // Getting the iterable object 
      int i = 1; 
      
      Iterator it = iterDoc.iterator(); // Getting the iterator 
    
      while(it.hasNext()) 
	  {  
			System.out.println(it.next());  
			i++; 
      }
   } 
}
