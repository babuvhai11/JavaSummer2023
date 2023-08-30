package ourFirstPackage;

public class IfElseTest {
	int age = 25;

	public static void main(String[] args) {
		IfElseTest obj = new IfElseTest();
		//obj.elseIf();
		obj.VotingResult();
	}

	public void elseIf() {
		if (age > 18) {
			System.out.println("Adult");
			if (age>=100) {
				System.out.println("Need to check personally");
			}
		} else if (age>=0 && age<= 18) {
			System.out.println("Noy Adult");
		} else if (age < 0) {
			System.out.println("Error: negative age");
		} else {
			System.out.println("system error");
		}
	}
	
	public void VotingResult() {
		if (age < 18) {
			System.out.println("This person is not a voter");
		}else if(age>=18 && age<40) {
			System.out.println("This person is a young voter");
		} else if(age>=40 && age<80) {
			System.out.println("This person is a Senior voter");
		}else if(age>=80 && age<100) {
			System.out.println("This person is a Special voter");
		}else {
			System.out.println("not a voter");
		}
		}
}
