package day4;

import java.util.Scanner;

public class Sumfor {
	public void disp()
	{
		System.out.println("Enter number you want a sum");
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int num;
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("Summation is "+sum);
	}
	
	public static void main(String args[])
	{
		Sumfor E=new Sumfor();
		E.disp();
	}

}
