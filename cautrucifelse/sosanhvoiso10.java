package cautrucifelse;
import java.util.Scanner;
class sosanhvoiso10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float number;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao so can so sanh: ");
		number = scanner.nextFloat();
		if (number<10) {
		System.out.println("so vua nhap nho hon 10");
		}
		else if (number == 10) {
			System.out.println("so vua nhap bang 10");
		}
		else {
			
				System.out.println("so vua nhap lon hon 10");
			
		}
		
		

	}

}
