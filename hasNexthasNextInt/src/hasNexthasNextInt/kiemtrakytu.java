package hasNexthasNextInt;

public class kiemtrakytu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("chuoi");
		if(scanner.hasNext()) {
		String input = scanner .next();	
		System.out.println("ky tu nhap vao chuoi:" +input);
		
		
		}else {
		System.out.println("ky tu nhap vao khong phai chuoi:");	
		}
		
		System.out.print("nhap so nguyen:");
		if(scanner.hasNextInt()) {
			int number = scanner.nextInt();
		System.out.println("ky tu nhap vao la so nguyen:"+ number);	
				
		}else {
			System.out.println("ky tu nhap vao khong phai la so nguyen:");
		}
		scanner.close();
	}

}
