// Find Digits exercise
// Jan Bogoryja-Zakrzewski

import java.util.Scanner;
import java.util.ArrayList;

public class FindDigits{

   public static int dividibles(int num)
   {
      int count = 0;
      String temp = Integer.toString(num);
      int divider;
      
      for (int i = 0; i < temp.length(); i++)
      {
         divider = Integer.parseInt(Character.toString(temp.charAt(i)));
         if(divider != 0 && num % divider == 0) count ++;
      }
      return count;
   }

   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      int n = console.nextInt();
      ArrayList<Integer> results = new ArrayList<Integer>();
      
      for(int i = 0; i < n; i++)
      {
        results.add(dividibles(console.nextInt()));
      }
      
      for(int i = 0; i < results.size(); i++)
      {
        System.out.println(results.get(i));
      }
      
   }
}