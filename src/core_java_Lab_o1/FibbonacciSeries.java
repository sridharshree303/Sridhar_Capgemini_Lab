package core_java_Lab_o1;

import java.util.*;

public class FibbonacciSeries
{
    /*
	public static void main(String[] args)                //non-recursive method for fibbonacciSeries
	{
		Scanner sc=new Scanner(System.in);              // if we implements in same method we can say non-recursive
		int a=1,b=1,c=0,n;
		
		System.out.print("Enter value of n:");
		n=sc.nextInt();                                 // number of values of n
		System.out.print(a);
		System.out.print(" "+b);
		for(int i=0;i<n-2;i++) 
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
		System.out.println();
		sc.close();
	}
	*/
	public static void main(String args[])              // Recursive method for Fibbonacciseries
	 {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of n:");
		int n = sc.nextInt();
		
		System.out.print("Fibonacci Series of "+n+" numbers: ");    // if we implements in multiple methods we can called as recursive
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(fibonacciRecur(i) +" ");
		}
		sc.close();
	}
	public static int fibonacciRecur(int n)
	{
		if(n == 0)
		 {
			return 0;
		 }
		if(n == 1 || n == 2)
		 {
			return 1;
		 }
		return fibonacciRecur(n-2) + fibonacciRecur(n-1);
	}
	
}
