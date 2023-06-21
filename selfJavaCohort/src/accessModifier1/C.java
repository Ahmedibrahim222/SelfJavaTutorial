package accessModifier1;
import Accessmodifier.*;

public class C {
	
	// all classes/package can access public within the project folder
	public String publicMessage = "This is public";
	
	//accessible to a different class in different package as long as it's a sub class of the protected class
	protected String protectedMessage = "This is protected";
	
	//only class in the same package can access default
	String defaultMessage = "This is the default";
	
	//only the private class as access.
	private String privateMessage = "This is private";
	

}
