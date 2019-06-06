package mang;
import java.util.*;
class viduvemang {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		    int n, sum = 0, tempSort;
		    float tbc;
		    Scanner scanner = new Scanner(System.in);
		         
		    do {
		        System.out.println("Nhập vào số phần tử của mảng: ");
		        n = scanner.nextInt();
		    } while (n < 0);
		         
		    // khởi tạo và cấp phát bộ nhớ cho mảng
		    int batman[] = new int[n];
		    for (int j=0; j<n ; j ++) {
		  System.out.println("Nhập các phần tử cho mảng: ");
		     for (int i = 0; i < n; i++) {
		        System.out.print("Nhập phần tử thứ " + i + ": ");
		      batman[i] = scanner.nextInt();
		    }
		         
		    // Hiển thị mảng vừa nhập
		    System.out.println("\nMảng ban đầu: ");
		    for (int i = 0; i < n; i++) {
		        System.out.print(batman[i] + "\t");
		    }
		         
		    // tính tổng các phần tử có trong mảng
		    for (int i = 0; i < n; i++) {
		        sum += batman[i];
		    }
		    System.out.println("\nTổng các phần tử có trong mảng = " + sum);
	
			// tính trung bình cộng 
			
		    tbc= (float)sum/n;
					System.out.println("\ntrung binh cong cua mang = " + tbc);
		    }
					scanner.close();
		    }
					
	}


	
	