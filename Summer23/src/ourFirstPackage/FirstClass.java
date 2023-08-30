package ourFirstPackage;

public class FirstClass {
	int a = 20;
	int b = 60;
	static int h = 50;
	static int y = 40;
	
	public static void main(String[] args) {
		FirstClass obj = new FirstClass();
		obj.myFirstMethod();
		obj.AAA(10, 20);
		obj.BBB();
		FirstClass.JJJ();
		obj.lll();
		obj.qqq();
	}

	public void myFirstMethod(){
		int a = 10;
		int b = 50;
		int c = a+b;
		System.out.println("The total is:"+ c);
	}
	public void AAA(int a, int b) {
		int d = a+b;
		System.out.println("My 2nd method result="+d);
	}	
	
	public void BBB () {
		int c = a+b;
		System.out.println("The 3rd total is:"+ c);
	}
	public static void JJJ() {
		int l = h+y;
		System.out.println("Just Print static value="+l);
	} 
	
	public int lll() {
		int a = 10;
		int b = 50;
		int c = a+b;
		System.out.println("It is return type:"+ c);
		return c;
	}
	public String qqq() {
		String name = "My Name is Nahid";
		System.out.println(name);
		return name;
	}
}
