//1. Write a Java method to find the smallest number among three numbers using Scanner
//method.
import java.util.Scanner;  
public class SmallestNumber{  
public static void main(String args[]){  

//number of variable
int num1, num2, num3, smallest, result;  
//Scanner class  
Scanner s = new Scanner(System.in);  

//recived input user  
System.out.print("Enter the first number:");  
num1 = s.nextInt();  
System.out.print("Enter the second number:");  
num2 = s.nextInt();  
System.out.print("Enter the third number:");  
num3 = s.nextInt(); 

//comparing num1 and num2 variable  
result=num1<num2?num1:num2;  

//smallest number storing result variable
smallest=num3<result?num3:result;  
//prints the smallest number  

System.out.println("The smallest number is: "+smallest);  
	}  
}  