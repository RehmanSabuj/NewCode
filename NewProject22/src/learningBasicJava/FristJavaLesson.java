package learningBasicJava;

public class FristJavaLesson {
	int a = 300;
	int b = 400;
	int c = a + b;
	String Shaiyan = "Hello friend";
	boolean r = true;

	public static void main(String[] args) {
		FristJavaLesson obj = new FristJavaLesson();
		obj.fristMethod();
		System.out.println("This is my frist java practice");
		// System.out.println("print the addition :" + c);
	}

	public void fristMethod() {
		int x = 45;
		int y = 31;
		int z = x - y;
		System.out.println("print the number " + z);
		System.out.println("print the number " + c);
		System.out.println("print the name: " + Shaiyan);
		System.out.println("print the number " + r);
		System.out.println("testing new branch");
	}
	
}
