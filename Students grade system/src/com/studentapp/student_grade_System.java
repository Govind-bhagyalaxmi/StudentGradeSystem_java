package com.studentapp;
import java.util.ArrayList;
import java.util.Scanner;
public class student_grade_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<student> students = new ArrayList<>();
		while (true) {
			System.out.println("\n=== Student Grade System Menu ===");
			System.out.println("1. Add New Student");
			System.out.println("2. Add Marks to Student");
			System.out.println("3. Display Student Info");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					System.out.println("Enter Student name : ");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.println("Enter rollnumber : ");
					int roll = sc.nextInt();
					students.add(new student(name, roll));
					System.out.println("Student added successfully!");
					break;
				case 2:
					if(students.isEmpty()) {
						System.out.println("No students available. Please add students first.");
						break;
					}
					System.out.println("Enter student roll number:");
					int searchRoll = sc.nextInt();
					student found = null;
					
					for(student s: students) {
						if(s.getRollnumber() == searchRoll) {
							found = s;
							break;
						}
					}
					if(found != null) {
						System.out.println("Enter number of subjects: ");
						int subjects = sc.nextInt();
						ArrayList<Integer> marks = new ArrayList<>();
						for(int i = 1; i <= subjects;i++) {
							System.out.print("Enter marks for subject " + i + ": ");
							marks.add(sc.nextInt());
						}
						found.addMarks(marks);
						System.out.println("Marks added successfully.");
					}
					else {
						System.out.println("Student not found");
					}
					break;
				case 3:
					if(students.isEmpty()) {
						System.out.println("No Studdents to dispaly.");
					}
					else {
						for(student s : students) {
							s.displayInfo();
						}
					}
					break;
				case 4:
					System.out.println("Exiting... Goodbye!");
					sc.close();
					System.exit(0);
				
				default:
					System.out.println("Invalid choice. please try again.");
			}
		}
	}
}
