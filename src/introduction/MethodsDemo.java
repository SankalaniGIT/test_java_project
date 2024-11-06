package introduction;

public class MethodsDemo {

	static String x="This is a static variable";
	
	public static void main(String[] args) {
		MethodsDemo d = new MethodsDemo();

		String name = d.getData();

		System.out.println(name);

		MethodsDemo2 d1 = new MethodsDemo2();

		d1.getUserData();

		getData2();
		
		//inside static method we can only call static variables
		System.out.println(x);
	}

	public String getData() {
		System.out.println("hello world");
		return "return value";
	}

//	static will move your your method to class level now class level access is now provided to your method by giving static keyword
//	this belongs to class not tied up to object now you can directly call it without object ex;- getData2();
	public static String getData2() {
		System.out.println("hello world static method");
		return "static method return value";
	}

}
