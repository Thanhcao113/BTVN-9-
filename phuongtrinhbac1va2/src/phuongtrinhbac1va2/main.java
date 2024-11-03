package phuongtrinhbac1va2;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("chọn 1 phương trình bậc 1 ,2 cho phương trình bậc 2:");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			System.out.print("nhập a và b:");
			double a = scanner.nextDouble(), b = scanner.nextDouble();
			System.out.println(a == 0 ? (b == 0 ?"vo so nghiem": "vo nghiem") : "nghiệm x = " + (-b/a));
			}
		else if(choice == 2 );
		System.out.print("nhập a,b và c:");
		double a = scanner.nextDouble(),b = scanner.nextDouble(), c = scanner.nextDouble();
		
		if(a == 0) {
			System.out.println(b == 0 ?(c == 0 ?"vô số nghiệm": "vô nghiệm") : "nghiệm x = " + (-c/b));
		}else {
			double delta = b * b - 4 * a * c;
			System.out.println(delta > 0 ? "x1 = " + ((-b + Math.sqrt(delta)) / (2 * a)) + 
                    ", x2 = " + ((-b - Math.sqrt(delta)) / (2 * a)) :
                    delta == 0 ? "Nghiệm kép x = " + (-b / (2 * a)) : "Vô nghiệm");
        }
        }else{
System.out.println("Lựa chọn không hợp lệ.");
}
scanner.close();
		
		
		
		

	}

}
