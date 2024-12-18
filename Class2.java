package My_Package;

public class Class2 {
	public static void printStarHypen() {
	int star=3,hyphen=2;
	for(int j=1;j<=hyphen;j++) {
		System.out.print("- ");
	}
	for(int k=1;k<=star;k++) {
		System.out.print("* ");
	}
	System.out.println();
	}
public static void main(String args[]) {
	printStarHypen();
}
}
