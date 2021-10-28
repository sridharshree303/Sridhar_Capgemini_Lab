package core_java_Lab_o1;

import java.util.*;

public class CheckNumber
 {
	public static void main(String[] args) 
	 {
       int num;
       boolean flag = false;

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter a number : ");
       num = scanner.nextInt();

       int curDgt = num % 10;
       num = num/10;
       scanner.close();

       while(num>0)
       {
           if(curDgt <= num % 10)
           {
               flag = true;
               break;
           }
           curDgt = num % 10;
           num = num/10;
       }
       if(flag)
       {
           System.out.println("Digits are not in increasing order.");
       }
       else
       {
           System.out.println("Digits are in increasing order.");
       }
    }
}
