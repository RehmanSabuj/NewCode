package javaDemoProject;

public class LoopClass {

	public static void main(String[] args) {
		LoopClass obj = new LoopClass();
		obj.loopTest();
		obj.loopTest2();
		obj.loopTest3();
		obj.loopTest4();

	}

	public void loopTest() {
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				System.out.println("even number" + i);
			} else
				System.out.println("odd number" + i);
		}
	}

	public void loopTest2() {
		for (int i = 3; i < 10; i = i + 2) {
			System.out.println("Hello sri" + i);
		}
		System.out.println("I am out side loop");
	}

	public void loopTest3() {
		for (int i = 3; i <= 30; i++) {
			if (i % 5 == 0)
				System.out.println("print green" + i);
			if (i % 3 == 0) {
				System.out.println("print red" + i);
				if (i % 2 == 0) {
					System.out.println("print yellow" + i);
				}
			} else if (i % 3 == 0) {
				System.out.println("print red " + i);
			}
		}
		System.out.println("any color");
	}
	public void loopTest4 () {
		for(int i = 1; i<=15; i= i+2) {
			//System.out.println(i);
			if(i ==7) {
				System.out.println("print Bird");
				break;
			}
			System.out.println(i);
		}
	}
}
