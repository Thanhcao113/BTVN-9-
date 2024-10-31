package BT;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)){
		System.out.print("nhap ten:");
		String name = scanner.nextLine();
		
		System.out.print("nhap tuoi:");
		String age =scanner.nextLine();
		
		System.out.print("nhap gioi tinh:");
		String gender = scanner.nextLine();
		
		System.out.print("nhap GPA:");
		String gpa = scanner.nextLine();
		
		System.out.print("nhap chuyen nganh:");
		String major = scanner.nextLine();
		
		System.out.print("nhap que quan:");
		String hometown = scanner.nextLine();
		
		System.out.println("\n nhap thong tin sinh vien:");
		System.out.println("nhap ten:" +name);
		System.out.println("nhap tuoi:" +age);
		System.out.println("nhap gioi tinh:"+ gender);
		System.out.println("nhap GPA:"+gpa);
		System.out.println("nhap chuyen nganh:"+ major);
		System.out.println("nhap que quan:"+ hometown);	
	}

	}

}
