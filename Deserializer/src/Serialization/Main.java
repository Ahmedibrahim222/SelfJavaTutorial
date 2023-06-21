package Serialization;
import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		// Deserialization = The reverse of converting a byte stream into an object.
		//					 (Thin of this as if you are loading a saved file)
		
		//							steps to Deserialize
		//				-----------------------------------------------------------------
		//				1. Declare your object (don't instantiate)
		//				2. Your class should implement Serializable interface
		//				3. Add import java.io.Serializable;
		//				4. FileInputStream fileIn = new FileInputStream(file path);
		//				5. ObjectInputStream in = new ObjectInputStream(fileIn);
		//				6. objectNam = (Class) in.readObject();
		//				7. in.close(); fileIn.close();
		//				------------------------------------------------------------------
		// important notes	1. children classes of a parent class that implements Serializable will do so as well
		//					2. static fields are not serialized (they belong to the class, not an individual object)
		//					3. Fields declared as "transient" aren't serialized, they're ignored
		//					4. the class's definition ("class file") itself is not recorded, cast it as the object type
		//					5. serialVersionUID is a unique version ID 
		
		
		
		User user = null;
		
		FileInputStream fileIn = new FileInputStream("C:\\Users\\mckun\\eclipse-workspace\\Serializer\\UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (User) in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(user.name);
		System.out.println(user.password);
		user.sayHello();

	}

}
