// Kangaroo, first Exercise
// jan Bogoryja-Zakrzewski

import java.util.Scanner;

public class Kangaroo{

   public static boolean compareLocation(int x1, int x2) // Cmpare 2 locations, return true if the are the same
   {
      if (x1 == x2) return true;
      else return false;
   }
   
   public static void main(String[] args)
   {
      int x1,x2;  // Kangaroo Location
      int v1,v2;  // Kangaroo Velocity
      int count = 0; // 
      boolean kangaroosMet = false;
      
      Scanner console = new Scanner(System.in);
      x1 = console.nextInt();
      v1 = console.nextInt();
      x2 = console.nextInt();
      v2 = console.nextInt();
      
      while(!(x1 >= 10000 || x2 >= 10000 || count >= 10000))
      {  
         if ( compareLocation(x1, x2))
         {
            kangaroosMet = true;
            break;
         }
         x1 += v1;
         x2 += v2;
         
         count++;
      }
      
      if (kangaroosMet) System.out.print("YES");
      else System.out.print("NO");
   }
}