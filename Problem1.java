package CodingPracticeTest;

import java.util.Scanner;

public class Problem1 { 

	public static void main(String[] args) {
		
		int i;
		Scanner scanner = new Scanner(System.in); //inintialising scanner 
		System.out.println("Enter the range of age : ");
		int a = scanner.nextInt();
		
		int age[] = new int[a]; // inintialising array
		
		System.out.println("Enter your age : ");
		
		int count=0,count1=0,count2=0;  //creating count variable
		
		for(i=0;i<a;i++)  //loop 
		{
			age[i]=scanner.nextInt();
		}
		
		for(i=0;i<a;i++)
		{
			if(age[i]<18) 
			{
				count++;
			}
			
			else if(age[i]>= 18 && age[i]<=54)
			{
				count1++;
			}
			
			else
			{
				count2++;
			}
		}
		
		System.out.println("Children : "+count); //this will count children < 18 and print
		System.out.println("Adult : "+count1);  //this will count adult  and print
		System.out.println("Senior Citizen : "+count2);  //this will count senoir citizen and print
		
		scanner.close();

	}
}
		
		



