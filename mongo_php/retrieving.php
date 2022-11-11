<?php 
   // connect to mongodb 
   $m = new MongoClient(); 
   echo "Connection to database successfully"; 
  
   // select a database 
   $db = $m->mydb; 
   echo "Database mydb selected"; 
   $collection = $db->mycol; 
   echo "Collection selected succsessfully"; 
 
   $cursor = $collection->find(); 
   // iterate cursor to display title of documents 
  
   foreach ($cursor as $document) { 
      echo "<br>". $document["title"] . "<br>"; 
      echo "<br>". $document["description"] . "<br>"; 
      echo "<br>". $document["url"] . "<br>"; 
      echo "<br>". $document["likes"] . "<br>"; 
   }
?>