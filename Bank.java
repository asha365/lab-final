 //3. Write a Java program using overriding method where Parent class name Bank and child
//classes are EximBank and DhakaBank. Parent class has a variable named salary which
//holds 25000 taka. Child class will extends this salary 10% for EximBank and 12% for
//DhakaBank. After increasing salary for each child class, output should be printed from
//main method.
 
 class BankSal{
		double salary = 25000;
		
	double getSalary(){
		return salary;
	}
}
 class EximBank extends BankSal{
	double getSalary(){
		salary = salary + salary * .10;
		return salary;
	}
}

 class DhakaBank extends BankSal{
	double getSalary(){
		salary = salary + salary * .12;
		return salary;
	}
}
class Bank{
	public static void main(String args[]){
	EximBank sl = new EximBank();
	DhakaBank s2 = new DhakaBank();
	
	System.out.println("The salary of Exim bank is:"+ sl.getSalary());
	System.out.println("The salary of dhaka bank is:"+ s2.getSalary());

	}
}