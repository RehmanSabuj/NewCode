package javaDemoProject;

public class SampleTest {
	
	int x = 30;
	int y = 45;
	int z = 55;
	String k = "weather is cold today";
	
	public SampleTest() {
		System.out.println("Print Constructor");
	}

	public static void main(String[] args) {
		SampleTest obj = new SampleTest();
		obj.methodTest();
		obj.methodTest2();
		obj.parameter(20, 25);
		obj.methodTest3();
		obj.heLLoMethod();
		//System.out.println("The sum of two numbers are: " + name);
	}
	
	public void methodTest() {
		int m = 100;
		int n = 150;
		int t = n-m;
		int q = m - z;
		System.out.println("The sum of two numbers are: " + t);
		System.out.println("The sum of two numbers are: " + q);	
	}
	
	public void methodTest2() {
		int i = 70;
		int j = 80;
		int h = i + j;
		System.out.println("The sum of two numbers are: " + h);
		System.out.println(k);
	}
	
	public void parameter(int a, int b) {
		int c = a + b;
		System.out.println("The sum of two numbers are: " + c);
	}
	
	public static void methodTest3() {
		int v = 49;
		int w = 59;
		int u = v - w;
		System.out.println("The sum of two numbers are: " + u);
	}
	
	public String heLLoMethod() {
		String name = "My name is Green";
		return name;
	}
}
