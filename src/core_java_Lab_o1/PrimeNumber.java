package core_java_Lab_o1;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int p;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			p=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				p=1;
			}
			if(p==0)
				System.out.println(i);
		}
		sc.close();
	}

}