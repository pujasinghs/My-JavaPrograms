package My_Package;
import java.util.*;
import java.io.*;

public class SquarePrint {

	public static void main(String[] args) {
           /*for (int i=1;i<=5;i++) {
        	   for(int j=1;j<=i;j++) {
        		   System.out.print("* ");
        	   }
        	   System.out.println();
        	   */
		/*int i=1,j;
            while(i<=5)
            {
            	j=1;
            	while(j<=i)
            	{
            		System.out.print("* ");
            		j++;
            	}
            	System.out.println();
            	i++;
            }
            */
		
		/*for (int k=1;k<=5;k++) {
     	   for(int j=5;j>=1;j--) {
     		   if(j<=k)
     			  System.out.print("*");
     			   
     		   else
     			  System.out.print(" ");
     	   }
     	   System.out.println();
	    }*/
		
		/*for (int k=1;k<=5;k++) {
	     	   for(int j=5;j>=1;j--) {
	     		   if(j<=k)
	     			  System.out.print("* ");
	     			   
	     		   else
	     			  System.out.print(" ");
	     	   }
	     	   System.out.println();
		    }
		    */
		
		int space=4 ,starprint=1;
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			space--;
			for (int k=1;k<=starprint;k++) {   
				System.out.print("*");
			}
			starprint+=2;
			System.out.println();
		}
		space=1;starprint=7;
		for (int l=1;l<5;l++)
		{
			for (int m=1;m<=space;m++)
			{
				System.out.print(" ");
			}
			space++;
			for(int n=1;n<=starprint;n++)
			{
				System.out.print("*");
			}
			starprint-=2;
			System.out.println();
		}
		
}}
        
