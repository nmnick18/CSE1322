import java.io.*;
import java.util.*;

public class test{
//define all variable

private String Firstname;
private String Lastname;
private int testmark[];
private double Avggrades;
private String grade;

//Constructor and constructors with parameter with the inputs that are given so far
public test(){
   Firstname = "";
   Lastname = "";
   testmark = new int[5];
   Avggrades = 0.0;
   grade = "";
} 
public test(String Firstname, String Lastname, int[] testmark){
   this.Firstname = Firstname;
   this.Lastname = Lastname;
   this.testmark = testmark;
   this.Avggrades = 0.0;
   this.grade = "";

}

//Getter and Setter
   public String getFirstname(){
      return Firstname;
   }
   public String getLastname(){
      return Lastname;
   }
   public int[] gettestmark(){
      return testmark;
   } 
   public void setFirstname(String Firstname){
      this.Firstname = Firstname;
   }
   public void setLastname(String Lastname){
      this.Lastname = Lastname;
   }
   public void settestmark(int[] testmark){
      this.testmark = testmark;
   }



//function to caluculate the average grade
   public void calculateavg(){
      double sum = 0.0;
      for(int i = 0; i<testmark.length; i++){
      testmark[i] = (int) sum + testmark[i];
      }
      Avggrades = sum/testmark.length;
   
   }

   public double getAvggrades(){
      calculateavg();
      return Avggrades;
   }
   
   public void gradeletter(){
      if (Avggrades >= 90){
      grade = "A";
      }
      else if(Avggrades>=80){
      grade = "B";
      }
      else if(Avggrades>=70){
      grade = "C";
      }
      else if(Avggrades>=60){
      grade = "D";
      }
      else{
      grade = "F";
      }
   }
   
   public String getgrade(){
      gradeletter();
      return grade;
      }

   public void modtestscore(int a, int marks){
      testmark[a] = marks;
   }     
   
   public String toString(){
      String result = "";
      result+=Firstname + "\t"+Lastname+"\t";
      for(int i=0; i<= testmark.length-1;++i){
         result+=testmark[i]+"\t";
         
         
      }
      result+=Avggrades + "\t"+ grade;
      return result;
   }
   
//in main method put in all the value that is given
public static void main(String[] args){
   
   test[] t = new test[10];
   t[0] = new test("Jack ", " Johnson",new int[]{85,83,77,91,76}); 
   t[1] = new test("Lisa  ", "  Aniston",new int[]{80,90,95,93,48}); 
   t[2] = new test("Andy  ", "  Cooper",new int[]{78,81,11,90,73}); 
   t[3] = new test("Ravi ", "  Gupta",new int[]{92,83,30,69,87}); 
   t[4] = new test("Bonny ", "  Blair",new int[]{23,45,96,38,59}); 
   t[5] = new test("Danny ", "  Clark",new int[]{60,85,45,39,67}); 
   t[6] = new test("Samantha ","  Kennedy",new int[]{77,31,52,74,83}); 
   t[7] = new test("Robin  ", " Bronson",new int[]{93,94,89,77,97}); 
   t[8] = new test("Sun ", "  Xie",new int[]{79,85,28,93,82}); 
   t[9] = new test("Kiran ", "  Patel",new int[]{85,72,49,75,63}); 
      double Sum1 = 0.0;
      double classAvg = 0.0;
   System.out.print("Firstname\tLastname\tTest1\tTest2\tTest3\tTest4\tTest5\tAverage_grade\tGrade_letter\n");
   for(int i=0; i<10;i++){
   Sum1 = t[i].getAvggrades() + Sum1;
      t[i].calculateavg();
      t[i].gradeletter();
      System.out.println(t[i].toString());
   }
   classAvg=Sum1/10;
   System.out.println("\nClass Average = " + classAvg);

}   
   

}