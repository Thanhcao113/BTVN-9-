package exercise1;
import java.util.Scanner;
import java.util.Random;
public class main {

	public static void main(String[] args) {
		Random rand = new Random();
		int tagetnumber = rand.nextInt(50)+1;
		Scanner scanner = new Scanner (System.in);
		int userguess = 0;
		
		System.out.println("hãy đoán 1 số từ 1 đến 50:");
		
		while (userguess != tagetnumber) {
			System.out.print("nhập số bạn đoán:");
			userguess = scanner.nextInt();
			
			if(userguess > tagetnumber) {
				System.out.println("số của bạn cao hơn.thử lại!");
				
			}else if (userguess < tagetnumber ) {
				System.out.println("số của bạn thấp hơn.thử lại!");
				
				
			}else {
				System.out.println("chúc mừng! bạn đã đoán đúng tỉ số " + tagetnumber);
			}						
		}
		scanner.close();
		
	}			
}
