package package1;

import org.bson.Document;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class trab1 {

	
	public static void main(String[] args) {
		MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		MongoDatabase database = mongoClient.getDatabase("Banco");
		MongoCollection<Document> collection = database.getCollection("Collection1");
		
		Document person = new Document("id", 1)
				.append("name", "mocela")
				.append("age", 22)
				.append("address", new Document("line1", "heuheu")
						.append("number", "229"));
		
		collection.insertOne(person);
		mongoClient.close();
	}
}