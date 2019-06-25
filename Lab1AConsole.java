//Nikhil Malani
import java.util.Scanner;

public class Lab1AConsole{
public static void main(String[] args){
   //Scanner for entering name and age   
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter name:");
   String name = sc.next();
   System.out.println("Enter age:");
   String age = sc.next();
   //Display age and name
   System.out.println("Hello! "+ name);
   System.out.println("your age is: "+ age);

}

} 