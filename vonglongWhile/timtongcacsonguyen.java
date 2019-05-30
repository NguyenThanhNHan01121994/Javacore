package vonglongWhile;
import java.util.Scanner;

class timtongcacsonguyen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number , sum = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("nhap vao so nguyen bat ky");
			number =scanner.nextInt();
			sum += number;
		} while (sum < 100);
		System.out.println("tong cac so nguyen vua nhap =" +sum);
		}

	}


