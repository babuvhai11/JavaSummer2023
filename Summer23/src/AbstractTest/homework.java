package AbstractTest;

public class homework {

	public void gread(double number, String subject) {
		
		if(number>=40 && number<60) {
			System.out.println(subject+" = D");
		}else if(number>=60 && number<=70) {
			System.out.println(subject+" = C");
		}else if(number>=71 && number<=80) {
			System.out.println(subject+" = B");
		}else if(number>=81 && number<=90) {
			System.out.println(subject+" = A");
		}else if(number>=91 && number<=100) {
			System.out.println(subject+" = A+");
		}else if(number>=0 && number<40) {
			System.out.println(subject+" = F");
		}else {
			System.out.println("Error: something went wrong"+subject);
		}		
	}

}
