
import java.util.Scanner;
import java.util.*;
class Binary{
public static void main(String[] args)
{
     int Array[] = {5,10,15,20,25,30,35};
     int k = 25;
     int first = 0;
     int last=Array.length-1;
     int mid = (first + last)/2;  
     while(first<=last)
     {
         if(Array[mid] < k)
        {  
            first = mid + 1;    
        }
       
        else if(Array[mid] == k )
        {
           
            System.out.println("Element is found at index: " + mid);  
            break;  
        }
        else
        {
           
            last = mid - 1;  
        }
       
        mid = (first+last)/2;  
   }  
   if(first>last)
   {  
      System.out.println("Element is not found!");  
   }
}
}