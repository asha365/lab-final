//2. Write a Java Program using overloading method where methods name will be as like sum
//(int, float, double), sum(float, double) and sum(). Among these methods third method
//will return a string which string will be printed from sum() method and others methods
//will return their output from main methods.

class Display{
	public void sum(int a, float b, double c){
		System.out.println("Method A");
	}
	public void sum(float b, double c){
		System.out.println("Method B");
	}
		public void sum(){
		System.out.println("without Method");
	}
}

class Overloading{
	public static void main(String args[]){
		Display obj = new Display();
		obj.sum(100,20.67f,500.35356536);
		obj.sum(100, 20.67f);
		obj.sum();
	}
}