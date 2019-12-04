// Missing Numbers exercise
// Jan Bogoryja-Zakrzewski

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer;  

import java.util.ArrayList;
import java.util.Collections;

public class MissingNumbers{

   private static BufferedReader br;
   private static StringTokenizer st;
   public static void main(String[] args)
   {
      try
      {
         br = new BufferedReader( new InputStreamReader(System.in));
         st = new StringTokenizer(br.readLine()); 
      } catch(Exception e) {}
      int n = Integer.parseInt(st.nextToken()); 
      
      ArrayList<Integer> arr = new ArrayList<Integer>();
      ArrayList<Integer> brr = new ArrayList<Integer>();
      ArrayList<Integer> results = new ArrayList<Integer>();
      try
      {
         st = new StringTokenizer(br.readLine()); 
      } catch(Exception e) {}
      
      for(int i = 0; i < n; i++)
      {
        arr.add(Integer.parseInt(st.nextToken()));
      }
      
      // Second array with all numbers
      try
      {
         st = new StringTokenizer(br.readLine()); 
      } catch(Exception e) {}
      n = Integer.parseInt(st.nextToken());
      try
      {
         st = new StringTokenizer(br.readLine()); 
      } catch(Exception e) {}
      for(int i = 0; i < n; i++)
      {
        brr.add(Integer.parseInt(st.nextToken()));
      }
      
      // Exit if the difference between min and max is > 100
      Collections.sort(arr);
      Collections.sort(brr);
      
      if(brr.get(brr.size()-1) - brr.get(0) > 100) System.exit(0);
      
      // Actual comparison
      int count1 = 0;
      int count2 = 0;
      int number;
      for(int i = 0; i < brr.size(); i++)
      {
         number = brr.get(i);
         if (!results.contains(number))
         {
            for(int j = 0; j < arr.size(); j++)
            {
               if(number == arr.get(j)) count1++;
            }
            
            for(int j = 0; j < brr.size(); j++)
            {
               if(number == brr.get(j)) count2++;
               if(count2 > count1) break;
            }
            if (count1 != count2)
            {
               results.add(number);
            }
            count1 = 0;
            count2 = 0;
         }
      }
      
      Collections.sort(results);
      
      for(int i = 0; i < results.size(); i++)
      {
        System.out.print(results.get(i) + " ");
      }  
   }
}