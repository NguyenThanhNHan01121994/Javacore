package cautrucifelse;
import java.util.Scanner;
class timsolonnhattrong3so {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ,b ,c , max ;
		
		java.util.Scanner scanner = new Scanner(System.in);
		System.out.println("nhap a");
		a = scanner.nextInt();
		System.out.println("nhap b");
		b = scanner.nextInt();
		System.out.println("nhap c");
		c = scanner.nextInt();
		if ( a >= b) {
			if( a>=c) {
				max = a;
				}
			else { max = c;
		}} else if (b >= c) {
			max = b;
		} else {max =c ;
		}
		System.out.println("so lon nhat trong 3 so" + a + " ,"+ b+" va" + c +"la" + max );
		}
		
		
		

	}
}


