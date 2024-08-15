package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {

		// Dynamic array
		ArrayList<String> a= new ArrayList<String>();
		a.add("list one");
		a.add("list two");
		a.add("list three");
		a.add("list four");
		System.out.println(a.get(3));
		System.out.println("***********************");

		//Arraylist index count can get through the .size() not from .length()
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("***********************");
		//enhased for loop to print arraylist
		for(String var:a) {
			System.out.println(var);
		}
		System.out.println("***********************");
		
		//check item is present in ArrayList
		System.out.println(a.contains("list two"));
		
		System.out.println("***********************");
		
		//we cant use this contains for normal array instead of that we need assign that array in to array list
		String[] num= {"one","two","three"};
		List<String> nameArrayList = Arrays.asList(num);
		nameArrayList.contains("one");
		
		
		
		
	}

}
