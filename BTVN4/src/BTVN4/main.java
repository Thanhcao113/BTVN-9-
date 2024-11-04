package BTVN4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int tongchan = 0;
		int tongle = 0;
		
		for (int i = 1; i <= 100; i ++) {
			if ( i % 2 == 0) {
				tongchan += i;
			}else {
				tongle += i; 
			}
		}
		System.out.println("tổng các số chẵn từ 1 điến 100 là:" + tongchan);
		System.out.println("tông các số lẽ từ 1 đến 100 là:" +tongle);
	

        Scanner sacnner = new Scanner(System.in);
        System.out.println("nhập số nguyên n:");
        int n = sacnner .nextInt();
        int tongchuso = 0;
        int temp = n;
        
        while (temp != 0) {
            tongchuso += temp % 10;
            temp /= 10;
        }
        System.out.println("Tổng các chữ số của " + n + " là: " + tongchuso);
        System.out.println("các số nguyên tố từ 1 đến 100 là :");
        for (int i=1; i<=100; i++) {
        	if (lasonguyento(i)) {
        		System.out.print(i+"");		
        	}
        }
}
	public static boolean lasonguyento(int n) {
		if(n < 2) {
			return false;
		}
		for (int i = 2; i<= Math.sqrt(n); i++) {
			if ( n % i ==0) {
				return false;
			}
		}
		return true;
	}      	           
}
