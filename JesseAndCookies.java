// Jesse and Cookies exercise
// Jan Bogoryja-Zakrzewski

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer;  
import java.util.ArrayList;
import java.util.Collections;

public class JesseAndCookies{
   
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
      int k = Integer.parseInt(st.nextToken()); 
      
      ArrayList<Integer> cookies = new ArrayList<Integer>();
      try
      {
         st = new StringTokenizer(br.readLine()); 
         for(int i = 0; i < n; i++)
         {
           cookies.add(Integer.parseInt(st.nextToken()));
         }
      } catch(Exception e) {}
      
      Collections.sort(cookies);
      
      int count = 0;
      while(cookies.get(0) < k && cookies.size() > 1)
      {
         cookies.set(1, cookies.get(0) + 2*cookies.get(1));
         cookies.remove(0);
         Collections.sort(cookies);
         count++;
      }
      
      if(cookies.get(0) < k) System.out.print("-1");
      else System.out.print(count);
   }
}