//Nikhil Malani

import java.util.Arrays;
import java.util.Random;
public class Lab1BBinarySearch {
 public static void main(String[] args) {
 //initialize array
 int[] arr = {1, 4, 4, 22, -5, 10, 21, -47, 23};
 //sort the array
    Arrays.sort(arr);
    System.out.println("arr:");
    printarray(arr);
       System.out.println("Key 6 position: " + binarySearch(arr, 6));
       //array of size 20
      int[] data = new int[20];
       System.out.println("The array data: ");
       fillarray(data);
       Arrays.sort(data);
      System.out.println("The array data sorted: ");
       printarray(data);
       System.out.println("\nKey 45 position: " + binarySearch(data, 45));
   }
   //fill in the random data
  public static void fillarray (int[] datab){
       Random rand = new Random();
       for(int i=0; i<20; i++) {
           int randomdata = (int)(-100 + 200 * rand.nextDouble());
           datab[i] = randomdata;
       }
       for(int i=0; i<20; i++) {
           System.out.print(datab[i] + " ");
       }
  
  
  }
  //Print the array when sorted
public static void printarray(int[] array){
      for(int i=0;i<array.length;i++){
      if (i == array.length-1){
         System.out.println(array[i]);
      
      }
      else
         System.out.print(array[i] + ",");
      }

}

//method for binary search
/*23.	Write a method, called binarySearch, that returns the index of the key element if found in the array, 
otherwise it will return the value of minus 
*/
  public static int binarySearch(int[] inputarray, int keyp) {
       int start = 0; int end = inputarray.length - 1;
       while (start <= end) {
           int mid = (start + end) / 2;
           if (keyp == inputarray[mid]) {
               return mid;
           }
           if (keyp < inputarray[mid]) {
               end = mid - 1;
           }
           else {
               start = mid + 1;
           }
         }
         return (start + 1)*-1;
   }

  
}