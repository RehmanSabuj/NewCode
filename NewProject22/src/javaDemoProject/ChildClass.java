package javaDemoProject;

public class ChildClass extends ParentClass {
	int i = 32;
	int j = 35;
	int y = 12;

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.testClass();
		obj.firstMethod();
		obj.testClass2();
		obj.testClass5();
	}

	public void testClass() {
		int y = i + j;
		System.out.println("print the sum of number " + y);
	}
	public void testClass2 () {
		int s = j - i;
		System.out.println("print the deduction of numbers " + s);
	}
	public void testClass5 () {
		int v = j - super.y;
		System.out.println("print the value of " + v);
		int vb = j - this.y;
		System.out.println("print the value of " + vb);
	}

}
