//Nikhil Malani
//CSE 1322L
//Sarav Debanth
///Lab1A Array Operation
import java.util.Random;
import java.util.*;
public class Lab1AArrayOperation{
public static void main(String[] args){
//initialize nums
   int nums[] = {1, 4, 13, 43, -25, 17, 22, -37, 29, 52,52,58,56};
//start a data array with 20 array
   int data[] = new int[20];
   fillarray(data);
   System.out.print("data: ");
   printarray(data);
   System.out.println("Largest num array: " + findLargest(nums));
   System.out.println("Largest data array: "+ findLargest(data));

//get the combine value of both max in the array

   int combine = findLargest(nums) + findLargest(data);
   System.out.println("Combine the largest: "+combine);
//print the longest positive in the array   
   int longpositive = longestposi(data);
   System.out.println("Largest continous positive data: "+ longpositive);
   int longpositive2 = longestposi(nums);
   System.out.println("Largest continous positive nums: "+ longpositive2);


}
//return the largest value by coparing the values to the next
public static int findLargest(int[] array){
   int largest = array[0];
   for(int i=0; i<array.length;i++){
   if(array[i]>largest){
   largest = array[i];
   }
   }
   return largest;
}

 //TO fill the array ,data using a range with maximum value= 100 and minimum value=-100
public static void fillarray(int[] array){
   for(int i=0;i<array.length;i++){
   Random rand = new Random();
   int randnumber = rand.nextInt(201)-100;
   array[i] = randnumber;
   
   
   } 
}
//make the array data more formated
    public static void printarray(int[] array){
      for(int i=0;i<array.length;i++){
      if (i == array.length-1){
         System.out.println(array[i]);
      
      }
      else
         System.out.print(array[i] + ",");
      }

}

public static int longestposi(int[] array){
      int len = 0;
      int max = 0;
      for(int i=0; i<array.length;i++){
         
         if(array[i]>0){
         len++;
            if(len > max){
               max = len;
            }
         
         }
         else{
          len = 0;
         }
      }
         return max;
   }

}
