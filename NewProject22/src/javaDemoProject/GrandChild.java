package javaDemoProject;

public class GrandChild extends ChildClass{

	public static void main(String[] args) {
		GrandChild obj = new GrandChild();
		obj.testClass2();
		obj.testClass4();
	}
	public void testClass4() {
		int f = 23;
		int g = 43;
		int d = g - f;
		System.out.println(d);
	}
}
