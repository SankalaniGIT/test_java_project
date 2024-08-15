package introduction;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		
		//		two ways to store string values
		
		//1. string is an object //String literal 
		//whether both values are same its create one object and one memory allocation it will refer to existing not create new object.
		String a = "test string values";
		String b = "test string values";
		
		//2. using new memory allocate operator
		//when creating string as an object every time its allocate new memory location whether values are same
		String s2 = new String("welcome");
		String s3 = new String("welcome");
		
		
		String s = "Apple offiicial web";

		String[] splittedString = s.split(" ");

		System.out.println(splittedString[0]);

		System.out.println(splittedString[1]);

		System.out.println(splittedString[2].trim());

		//in here we treet S as a array of character list
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
		
		
	}

}
