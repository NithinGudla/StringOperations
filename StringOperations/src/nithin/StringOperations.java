package nithin;

public class StringOperations {

	public String removeCharA(String string) {
		if(string.length() > 1)
		if(string.charAt(1) == 'A')
			string = string.charAt(0) + string.substring(2);
		if(string.length() >= 1)
		if(string.charAt(0) == 'A')
			string = string.substring(1);
		
		return string;
	}
	
	
}
