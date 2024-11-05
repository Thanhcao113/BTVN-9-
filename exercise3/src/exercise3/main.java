package exercise3;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		for(int so = 1; so <= 10; so++) {
			System.out.println("bảng cửu chương cho số "+ so+ ":");
			for(int i =1; i<=10; i++) {
				System.out.println(so+"x"+i+"="+(so*i));
			}
			System.out.println();	
		}

	}

}
