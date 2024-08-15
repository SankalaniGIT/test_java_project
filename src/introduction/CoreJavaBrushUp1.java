package introduction;

import java.util.ArrayList;
import java.util.Iterator;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {

		// int= primitive data type
		int myNum = 5;

		// String = non-primitive data type
		String website = "Apple Official website";

		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;

		System.out.println(myNum + "is the value stored in the myNum variable");

		System.out.println(website);

		// Arrays -

		int[] arr = new int[5];// 5, 10
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;

		int[] arr2 = { 1, 2, 4, 5, 6 };

		System.out.println(arr2[0]);

		// for loop arr.length - 5

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		String[] name = { "Ann", "Paul", "Peter" };

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		// enhancing for loop syntax
		for (String s : name) {
			System.out.println(s);
		}

		int[] arr3 = { 1, 2, 6, 4, 8, 9, 10, 222 };

//		Check if array has multiple of 2
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] % 2 == 0) {
				System.out.println(arr3[i]);
				break;
			} else {
				System.out.println(arr3[i] + "is not multiple of 2");
			}
		}

		
		

	}

}
