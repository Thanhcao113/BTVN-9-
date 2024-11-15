package lecture_09;
import java.util.Scanner;
import java.util.ArrayList;
public class Student {
	 String studentId, fullName, dateOfBirth, major;
	    float gpa;

	    void enterStudentInfo() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter ID: "); studentId = sc.nextLine();
	        System.out.print("Enter Name: "); fullName = sc.nextLine();
	        System.out.print("Enter DOB: "); dateOfBirth = sc.nextLine();
	        System.out.print("Enter Major: "); major = sc.nextLine();
	        System.out.print("Enter GPA: "); gpa = sc.nextFloat();
	    }

	    void displayStudentInfo() {
	        System.out.println("ID: " + studentId + ", Name: " + fullName + ", DOB: " + dateOfBirth +
	                           ", Major: " + major + ", GPA: " + gpa);
	    }
	}

	class StudentList {
	    ArrayList<Student> studentList = new ArrayList<>();

	    void displayAllStudents() {
	        for (Student s : studentList) s.displayStudentInfo();
	    }

	    Student findStudentById(String idToFind) {
	        for (Student s : studentList) if (s.studentId.equals(idToFind)) return s;
	        return null;
	    }

	    boolean deleteStudentById(String idToDelete) {
	        Student s = findStudentById(idToDelete);
	        if (s != null) {
	            studentList.remove(s);
	            return true;
	        }
	        return false;
	    }

	    boolean editStudentById(String idToEdit) {
	        Student s = findStudentById(idToEdit);
	        if (s != null) {
	            s.enterStudentInfo();
	            return true;
	        }
	        return false;
	    }
	}

	public class Processor {
	    public static void main(String[] args) {
	        StudentList sl = new StudentList();
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("1. Add | 2. Display | 3. Find | 4. Delete | 5. Edit | 6. Exit");
	            System.out.print("Your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine(); // Consume newline
	            switch (choice) {
	                case 1 -> {
	                    Student s = new Student();
	                    s.enterStudentInfo();
	                    sl.studentList.add(s);
	                }
	                case 2 -> sl.displayAllStudents();
	                case 3 -> {
	                    System.out.print("Enter ID to find: ");
	                    Student s = sl.findStudentById(sc.nextLine());
	                    if (s != null) s.displayStudentInfo();
	                    else System.out.println("Student not found.");
	                }
	                case 4 -> {
	                    System.out.print("Enter ID to delete: ");
	                    System.out.println(sl.deleteStudentById(sc.nextLine()) ? "Deleted successfully." : "Student not found.");
	                }
	                case 5 -> {
	                    System.out.print("Enter ID to edit: ");
	                    System.out.println(sl.editStudentById(sc.nextLine()) ? "Edited successfully." : "Student not found.");
	                }
	            }
	        } while (choice != 6);
	    }
	}
	
