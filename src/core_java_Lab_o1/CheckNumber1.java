package core_java_Lab_o1;

import java.util.*;

public class CheckNumber1 {
	 
	 public static void main(String[] args)
	 {
	   Scanner sc = new Scanner(System.in);    // Checks if the entered number is a power of two or not 
	  System.out.print(" Enter a value : ");
	  int n = sc.nextInt();
	  System.out.println(powerOf2(n));
	  sc.close();
	 }
	 
	 private static boolean powerOf2(int number)
	 {
	  if(number<=0)
	   {
	    return false;
	   }
	   
	  while(number > 1)
	   {
	    if(number % 2 != 0)
	     {
	      return false;
	     }
	    number = number / 2;
	   }
	  return true;
	 }
	 
	}
