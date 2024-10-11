package project2;

import java.util.*;

public class pro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner task=new Scanner(System.in);
		System.out.println("Student Grade tracker");
		System.out.println("Enter no.of subject:-");
		int std=task.nextInt();
		int total=0;
		for(int i=0;i<std;i++) {
	System.out.println("Enter the marks for the subject "+(i+1)+":-");
			int marks=task.nextInt();
			total+=marks;
		}
		float avg=(float)total/std;
		char grade;
		if(avg>=90) {
			grade='O';
			}
		else if(avg>=80) {
			grade='A';
			}
		else if(avg>=70) {
			grade='B';
			}
		else if(avg>=60) {
			grade='C';
			}
		else if(avg>=50) {
			grade='D';
			}
		else if(avg>=40) {
			grade='E';
			}
		else{
			grade='F';
		}
System.out.println("The total marks scored are:-"+total);
System.out.println("Average percentage gained is:-"+avg+"%");
System.out.println("Grade:-"+grade);
	}

}
