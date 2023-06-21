package Serialization;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// Serialization = The process of converting an object into a byte system.
		//				   Persists (saves the state) the object after program exists
		//				   This byte stream can be saved as a file or sent over a network
		//				   Can be sent to a different machine
		//				   Byte stream can be saved as a file (. ser) which is platform independent
		//				   (think of this as if you are saving a file with the object's information)
		//				Steps to Serialize
		//				----------------------------------------------------------------------
		//				1. Your object class should implement Serializable interface
		//				2. add import java.io.Serializable;
		//				3. FileoutputStream fileout = new fileOutputStream(file path)
		//				4. ObjectoutputStream out = new ObjectOutputStream(fileout);
		//				5. out.writeObject(objectName)
		//				6. out.close(); fileOut.close()
		
		//  SerialVersionUID =	serialVersionUID is a unique ID that functions like a version #
		//					verifies that the sender and receiver of a serialized object,
		//					have loaded classes for that object that are compatible
		//					Ensures object will be compatible between machines
		//					Number must match. otherwise this will cause a InvalidClassException
		//					A SerialVersionUID will be calculated based on class properties, members, etc.
		//					A serializable class can declare its own serialVersionUID explicitly (recommended)
		
		
		
		
		User user = new User();
		
		user.name = "Ahmed";
		user.password = "Password123";
		
		FileOutputStream fileout = new FileOutputStream("UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileout);
		out.writeObject(user);
		out.close();
		fileout.close();
		
		System.out.println("object info saved! :");

	}

}
