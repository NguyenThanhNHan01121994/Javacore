package mang;
import java.util.*;
class bangdiemmang2chieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m , sum=0,number;
		float tbcn,tbcm;
	     
	    Scanner scanner = new Scanner(System.in);
	    
	         
	    System.out.println("Nhập vào số dòng của mảng: ");
	   n = scanner.nextInt();
	    System.out.println("Nhập vào số cột của mảng: ");
	    m = scanner.nextInt();
	         
	    // khai báo và cấp phát bộ nhớ cho mảng
	    int[][]diem = new int[n][m];
	    for (int a=0; a<n-1 ; a ++) {
	    	for(int b=0; b<m-1; b++)
	   
			  System.out.println("Nhập các phần tử cho mảng: ");
	    }
			     
	         
	    // Để nhập giá trị các phần tử cho mảng
	    // chúng ta sẽ sử dụng 2 vòng lặp for
	    // vòng lặp for bên ngoài sẽ duyệt i từ 0 đến soDong - 1
	    // và vòng lặp for bên trong sẽ duyệt j từ 0 đến soCot - 1
	    // mỗi lần như vậy thì sẽ nhập vào phần tử tại vị trí i, j
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < m; j++) {
	            System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
	            diem[i][j] = number=scanner.nextInt();
	            sum+=number;
	        }
	    }
	         
	    // hiển thị các phần tử trong mảng vừa nhập
	    // chúng ta cũng sử dụng 2 vòng lặp for như khi nhập
	    System.out.println("Mảng vừa nhập: ");
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < m; j++) {
	            System.out.print(diem[i][j] + "\t");
	        }
	        // sau khi viết xong 1 dòng thi xuống hàng
	        System.out.println("\n"); 
	        
	    }
	       
	   
	    System.out.println("tong cac hang va cot="+sum);
		 //tính tổng trung bình
		        tbcm= (float)sum/(m-1);
		        System.out.println("trung binh cong cua m="+tbcm);
		        tbcn= (float)sum/(n-1);
		        System.out.println("trung binh cong cua m="+tbcn);
		        scanner.close();
	    }
	}


