package sivatask1;


import java.util.Scanner;

public class simple {

	public static void main(String[] args) {
		int num1,num2;
		// TODO Auto-generated method stub
    Scanner siva=new Scanner(System.in);
    System.out.println("Enter your first number:-");
    num1=siva.nextInt();
    System.out.println("Enter your second number:-");
    num2=siva.nextInt();
  
    System.out.println("Additon = "+(num1+num2));
    System.out.println("subtraction = "+(num1-num2));
    System.out.println("Multiplication = "+(num1*num2));
    System.out.println("Division = "+(num1/num2));
	}

}
