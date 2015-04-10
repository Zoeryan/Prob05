import java.util.*;
import java.io.*;

            
public class Prob05
{
  public static void main (String[] args) throws FileNotFoundException
   {
      ArrayList myArray = new ArrayList();
      String inputString = "";
      int total = 0;
      Scanner file = new Scanner( new File( "Prob05.txt" ) );  
      while(file.hasNext())
    	 {
    	 System.out.println("yes");
    	 if(file.next().equals(0) || file.next().equals(1) || file.next().equals(2) || file.next().equals(3) || file.next().equals(4) || file.next().equals(5) || file.next().equals(6) || file.next().equals(7) || file.next().equals(8)|| file.next().equals(9))
    		 {
    		 myArray.add(file.next()); 
    		 System.out.println(file.next());
    		 }
    	 else
    		 {
    		 
    		 }
    	System.out.println(myArray);
    	 }
      for(int i = 0; i < myArray.size(); i ++)
    	  {
    	  inputString = inputString + (String) myArray.get(i);
    	  inputString = inputString.replaceAll("[^\\p{L}\\p{Nd}]+", "");
    	  myArray.clear();
    	  }
      
      for(int w = 0; w < inputString.length(); w++)
    	  {
    	  myArray.add(inputString.substring(w , w + 1));
    	  }

        for(int k = 0; k < myArray.size(); k ++)
          {
          System.out.println(k);
            if(k % 2 == 0)
            	{
            	int even = (int) myArray.get(k);
            	System.out.println("jdy");
            	System.out.println(myArray.get(k));
            	even = 1 * even;
            	System.out.println(even);
            	total += even;
            	}
            else
            	{
            	int odd = (int) myArray.get(k);
            	odd = 3 * odd;
            	total += odd;
            	System.out.println("yes");
            	}
          }
        if(total % 9 == 0)
        	{
        	System.out.println("VALID");
        	myArray.clear();
        	}
        else
        	{
        	System.out.println("re");
        	myArray.clear();
        	}
                 
    	 
       }
}
