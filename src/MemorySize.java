import java.util.Scanner;

public class MemorySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter memory size in ##GB or ##MB format: ");
		String grossMemory = scanner.next();
		calculateMemory(grossMemory);
	}

	public static void calculateMemory(String grossMemory) {
		String gNumber = grossMemory.substring(0, grossMemory.length() - 2);
		String gType1 = grossMemory.substring(grossMemory.length() - 2);
		String gType = gType1.toUpperCase();
		double num = Double.parseDouble(gNumber);
		num *= 0.97;
		if((num < 1) &&(gType.compareTo("GB") == 0)) {
			gType = "MB";
			num *= 1000;
		}
		System.out.println(String.format("%.2f", num) + gType);
	}

}
