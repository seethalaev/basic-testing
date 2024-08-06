package Exam;

import java.util.Scanner;

public class Reversw 
{
 public static void main(String[] args)
{
	int remainder,rev=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter numbr: ");
	int c=sc.nextInt();
	int num=c;
	while(c!=0)
	{
		remainder=c%10;
		rev=(rev*10)+remainder;
		c=c/10;
	}
	System.out.println(rev);
}
}
