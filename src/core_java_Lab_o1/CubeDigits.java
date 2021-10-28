package core_java_Lab_o1;

import java.util.*;

public class CubeDigits
 {
   public static void main(String args[])
    {
      System.out.print(" Enter a number : ");  
      Scanner sc = new Scanner(System.in);          
      int number= sc.nextInt();                     // n number 
      int sum=0;
      sc.close();

      while(number!= 0)
       {
        int digit= number%10;
        sum=sum+(digit*digit*digit);
        number=number/10;
       }
      System.out.println("\n The sum of cubes of digits is " +sum);
    }
}
