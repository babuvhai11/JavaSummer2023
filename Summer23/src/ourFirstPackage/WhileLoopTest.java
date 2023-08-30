package ourFirstPackage;

public class WhileLoopTest {

	public static void main(String[] args) {
		WhileLoopTest obj = new WhileLoopTest();
		obj.whileloop();

	}
	public void whileloop() {
		
	int i = 0;
	while(i<=10) {
		System.out.println("print me="+i);
		i=i+2;
		if(i==12) {
			System.out.println("abcd"+i);
		}
		
	}
	}

}
