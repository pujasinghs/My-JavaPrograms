package My_Package;


/* 

 * * * - -
 - - * * *
 * * * - -
 
 * */

public class Rectangle {
	public static void main(String args[]) {
		int star=3,hyphen=2;
		for (int i=1;i<=5;i++) {
			
			if(i%2!=0) {
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			for(int k=1;k<=hyphen;k++) {
				System.out.print("- ");
			}}
			else
			{
				for(int j=1;j<=hyphen;j++) {
					System.out.print("- ");
				}
				for(int k=1;k<=star;k++) {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}
	

}
