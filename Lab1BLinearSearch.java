//Nikhil Malani
import java.util.*;

public class Lab1BLinearSearch{

   public static void main(String[] args) {
       //Initilize both the num and dat
       int[] num = {1, 4, 4, 22,22, -5, 10, 21, -47, 23};
       int[] data = new int[20];
       int index = linearSearch(num,22);
       System.out.println(index);
       
       // TO fill the data into the array and saving it into a new array, filledData
       int[] filledData = fillArray(data);
       // To print out the array
       System.out.println("Data: " + Arrays.toString(filledData));
       // To use linearSearch for the Filled Array using a key = 31
       int idx2 = linearSearch(filledData, 31);
       
       if(idx2==-1){
           System.out.println("Value not found in the array");
       }
       else {
           System.out.println(idx2);

       }
   }
   //To search for an element
   /*Write a method, called linearSearch, that returns the index of the key element if found in the array, otherwise it will return a -1*/
   static int linearSearch(int[] arr,int key)
   {
       //Loop for searching key into arr
       for(int i=0; i < arr.length; i++){
           if(arr[i] == key){
               return i;
           }
          
       }
        return -1;
   }
   
   //TO fill the array ,data using a range with maximum value= 100 and minimum value=-100
   static int[] fillArray(int[] a) {
       for(int i=0; i < 20; i++) {
           Random rand = new Random();
           int randomdata = (int)(-100 + 200 * rand.nextDouble());// to generate rand in the range
           a[i] = randomdata;
       }
   return a;  
   }

}
