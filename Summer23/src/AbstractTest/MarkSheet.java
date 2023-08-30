package AbstractTest;

public class MarkSheet extends homework {

	static double bangla = 85;
	static double english = 75;
	static double math = 85;

	public static void main(String[] args) {
		MarkSheet obj = new MarkSheet();
		obj.gread(bangla, "Bangla");
		obj.gread(english, "English");
		obj.gread(math, "Math");
		System.out.println("Total Average Mark= " + CGPA());
		obj.gread(CGPA(), "CGPA");
		MarkSheet.CGPA();
		System.out.println(CGPA()+10);
	}

	public static double CGPA() {
		double F = 0.00;
		if (bangla < 40 || english < 40 || math < 40) {
			System.out.println("You have one or more fail subject");
			return F;
		} else if (bangla > 100 || english > 100 || math > 100){
			System.out.println("Error: out of boundary");
			return F;
		}else{
			double totalAvgMark = (bangla + english + math) / 3;
			return totalAvgMark;
		}
	}

}
