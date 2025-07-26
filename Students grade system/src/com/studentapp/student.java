package com.studentapp;
import java.util.ArrayList;
public class student {
	// wrapping the variables (encapsulation)
		private String name;
		private int rollnumber;
		private ArrayList<Integer> marks;// marks in subjects
		
		// constructor: new student obj is created
		public student(String name, int rollnumber) {
			this.name = name;
			this.rollnumber = rollnumber;
			this.marks = new ArrayList<>();
		}
		
		public int getRollnumber() {
			return rollnumber;
		}
		public void addMarks(ArrayList<Integer> marks) {
			this.marks = marks;
		}
		public double getAverage() {
			if(marks.isEmpty())
				return 0.0;
			int sum = 0;
			for(int mark : marks) {
				sum += mark;
			}
			return (double) sum / marks.size();
		}
		public char getGrade() {
			double avg = getAverage();
			
			if(avg >= 90)
				return 'A';
			else if(avg >= 75)
				return 'B';
			else if(avg >= 60)
				return 'C';
			else if(avg >= 40)
				return 'D';
			else return 'F';
		}
		public void displayInfo() {
			System.out.println("\n--- Student Info ---");
			System.out.println("Name : " + name);
			System.out.println("Roll Number : " + rollnumber);
			System.out.println("Marks : " + marks);
			System.out.println("Average : " + getAverage());
			System.out.println("Grade : " + getGrade());
		}
}
