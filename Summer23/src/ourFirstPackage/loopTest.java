package ourFirstPackage;

public class loopTest {

	public static void main(String[] args) {
		loopTest obj = new loopTest();
		// obj.firstLoop();
		// obj.whileloop();
		obj.doWhileTest();
	}

	public void firstLoop() {
		int i;
		for (i = 1; i <= 10; i++) {
			if (i % 5 == 0) {
				System.out.println("Red" + i);
			} else if (i % 3 == 0) {
				System.out.println("Yello" + i);
			} else if (i % 4 == 0) {
				System.out.println("green" + i);
			}
		}
	}

	public void whileloop() {
		int i = 1;
		while (i < 11) {
			System.out.println("print me=10000" + i);
			i++;
		}
	}

	public void doWhileTest() {
		int i = 1;
		do {
			i++;
			System.out.println("Age mair pore kotha"+i);
		} while (i < 10);
	}
}
