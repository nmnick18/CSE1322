//Nikhil Malani
//CSE 1322/L
//Assignment1B
import java.util.*;

public class Tests{
   private String Firstname;
   private String Lastname;
   private int[] TestMarks;
   private double AvgMarks;
   private char Grade;
   
   //Constructor
   public Tests(){
       Firstname="";
       Lastname="";
       TestMarks=new int[5];
       AvgMarks=0.0;
       Grade='\0';
   }
   
   //Constructor with parameters
   public Tests(String Firstname,String Lastname,int[] TestMarks){
       this.Firstname=Firstname;
       this.Lastname=Lastname;
       this.TestMarks=TestMarks;
       AvgMarks=0.0;
       Grade='\0';

   }

  

   //Getters

   public String getFirstName(){
   return Firstname;
   }
   public String getLastName(){
   return Lastname;
   }
   public int[] getTestMarks(){
   return TestMarks;
   }
   
   //Setter
   
   public void setFirstName(String Firstname){
   this.Firstname = Firstname;
   }
   public void setLastName(String Lastname){
   this.Lastname = Lastname;
   }
   public void setTestMarks(int[] TestMarks){
   this.TestMarks = TestMarks;
   }
   
    //method for grade calculation

   public void GradeCalculation(){
        if(AvgMarks>=90){
        Grade='A';
        }
        else if(AvgMarks>=80 && AvgMarks<90){
        Grade='B';
        }
        else if(AvgMarks>=70 && AvgMarks<80){
        Grade='C';
        }
        else if(AvgMarks>=60 && AvgMarks<70){
        Grade='D';
        }
        else{
         Grade='F';
        }

   }
  //return the letter grade 
   public char returnGrade(){
      GradeCalculation();
      return Grade;
   }   
   
 //method to calculate test average
public void calculateTestAverage(){
       double sum=0.0;
       for(int i=0;i<TestMarks.length;i++){
           sum = sum + TestMarks[i];
       }
       AvgMarks=sum/TestMarks.length;
   }
//return the test average calculation
   public double returnTestAverage(){
   calculateTestAverage();
   return AvgMarks;
   }
   //method to modify test score
   public void modifyTestScore(int a,int marks){
       TestMarks[a]=marks;
   }

   public String toString(){
       String Result="";
       Result+=Firstname+"\t"+Lastname+"\t";
       for(int i=0;i<TestMarks.length;i++){
           Result = Result + TestMarks[i]+"\t";
       }
       Result = Result + AvgMarks+"\t"+Grade;
       return Result;
   }

   //Main Method with all inputs from the word document and the class average

   public static void main(String[] args){
      Tests[] std=new Tests[10];
      std[0]=new Tests("Jack","Johnson",new int[]{85,83,77,91,76});
      std[1]=new Tests("Lisa","Aniston",new int[]{80,90,95,93,48});     
      std[2]=new Tests("Andy","Cooper",new int[]{78,81,11,90,73});
      std[3]=new Tests("Ravi","Gupta",new int[]{92,83,30,69,87});
      std[4]=new Tests("Bonny","Blair",new int[]{23,45,96,38,59});
      std[5]=new Tests("Danny","Clark",new int[]{60,85,45,39,67});
      std[6]=new Tests("Samantha","Kennedy",new int[]{77,31,52,74,83});
      std[7]=new Tests("Robin","Bronson",new int[]{93,94,89,77,97});
      std[8]=new Tests("Sun","Xie",new int[]{79,85,28,93,82});
      std[9]=new Tests("Kiran","Patel",new int[]{85,72,49,75,63});
       double Sum = 0.0;
       double OverallAverage = 0.0;
System.out.println("First_Name\tLast_name\tTest_1\tTest_2\tTest_3\tTest_4\tTest_5\tAvgGrade");
       for(int i=0;i<std.length;i++){
           std[i].calculateTestAverage();
           std[i].GradeCalculation();
           Sum = Sum + std[i].returnTestAverage();
           System.out.println(std[i].toString());
       }
       OverallAverage=Sum/std.length;
       System.out.println("\nClass Average = "+ OverallAverage);
   }

}