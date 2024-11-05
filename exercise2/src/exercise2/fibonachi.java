package exercise2;
import java.util.Scanner;
public class fibonachi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("nhập số phần tử n của dẩy fibonachi:");
		int n = scanner.nextInt();
		
		if (n<=0) {
			System.out.println("số phần tử phải lớn hơn 0:");
			
		}else {
			System.out.print("dẫy fibonahci:");
			long a = 0, b = 1;
			for(int i = 0; i <=n; i++) {
			if (i==0) {
				System.out.print(a);
			}else {
				long next = a+b;
				System.out.print(","+ next);
				a = b;
				b = next;
			}
			}
			System.out.println();
			
		}
		scanner.close();			
	}

}
