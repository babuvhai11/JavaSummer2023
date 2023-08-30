package ourFirstPackage;

public class KingKong {

	KingKong(){
		System.out.println("Print me");
	}	
	KingKong(int a){
		System.out.println(a);
	}	
	public static void main(String[] args) {
		KingKong shikot = new KingKong();
		KingKong Nahid = new KingKong(20);
		shikot.ABC();
		shikot.ifTest();
	}
	
	public int ABC() {
		int a = 10;
		int b = 50;
		int c = a+b;
		System.out.println("It is return type:"+ c);
		return c;
	}
	public int ABC(int j) {
		return j;
	}

	public void ifTest() {
		 int age= 10;
		if(age>18) {
			System.out.println("Adult");
		}
	}
}
