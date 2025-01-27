package com.v2;

public class Hello {

// changes by kavindra done today


     // Method for addition
    public static int addition(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    public static int subtraction(int a, int b) {
        return a - b;
    }

//added multilication and modulo in new branch

    public static int multiplication(int a, int b) {
        return a * b;
    }

    // Method for modulo
    public static int modulo(int a, int b) {
        return a % b;
    }

	//instance  variable  object creation is needed for 
	
	int i =10 ; // instance variabe  // instance  Heap memory   objects
	static int  k =18; //static  //class area  method area   u need no to create any object 
	public static void main(String[] args) {
		Hello hello = new Hello();
   System.out.println(hello.i);
      int j=15; //local variable  //stack
      System.out.println(Hello.k);  // static  String organisation = "wipro"
      
      System.out.println(j);
System.out.println("first changes in git ");
System.out.println("Second  changes in git ");



	}

	

}
