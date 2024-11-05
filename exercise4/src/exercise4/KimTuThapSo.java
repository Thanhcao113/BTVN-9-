package exercise4;
import java.util.Scanner;
public class KimTuThapSo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập số hàng của kim tự tháp:");
		int n = scanner.nextInt();
		
		for(int i = 1 ; i <= n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j+"");
				
			}
			System.out.println();
			
		}
		scanner.close();

	}

}
