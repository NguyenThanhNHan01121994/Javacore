package cautrucifelse;
import java.util.Scanner;

import sun.tools.java.ScannerInputReader;
class kiemtrasochanle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so can kiem tra: ");
		number = scanner.nextInt();
		if (number % 2 == 0){
			System.out.println("la so chan");
			}  else {
			System.out.println(number + "la so le");
			scanner.close();
		}
		
	}

}

