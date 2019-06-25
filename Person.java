//Nikhil Malani
//CSE 1322L
//Saurav Debnath
public class Person{
//define the variable that would be in a person(name, address, phone number, email)
   String name;
   String address;
   int phone;
   String email;
   
   
   //constructor with parameter
   Person(String name, String address, int phone, String email){
      this.name = name;
      this.address = address;
      this.phone = phone;
      this.email = email;
   }
   //
   
   


}

   class Student extends Person{
      final int freshman = 1;
      final int sophmore = 2;
      final int junior = 3;
      final int senior = 4;
      String Status = "student";
      //constructors with parameter
      public Student(String name, String address, int phoNUM, String email, int status){
         this.name = name;
         this.address = address;
         this.phone = phoNUM;
         this.email = email;
         
         if(status == 1){
         Status = "freshman";
         }
         else if(status == 2){
         Status = "sophmore";
         }
         else if(status == 3){
         Status = "junior";
         }
         else if(status == 4){
         Status = "senior";
         }
      
         Status = "student";
      }               
            public String toString (){
            return Student.toString() + "   " + status;
            }    

   }

   class Employees extends Person{
   
   
   }

   class Staff extends Employees{
   
   }
   
   class Faculty extends Employees{
   
   }


public class lab2A{
public static void main(String[] args){



}

}