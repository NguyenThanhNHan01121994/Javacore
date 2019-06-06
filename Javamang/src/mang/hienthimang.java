package mang;
import java.util.*;
class hienthimang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao do dai cua mang:");
		size = scanner.nextInt();
		int[] batman = new int[size];
		for (int i=0 ; i < size; i++) {
			System.out.println("Nhap vao phan tu thu " +i+":");
			batman[i]=scanner.nextInt();
		}
		for (int i =0;i < size; i++) {
			System.out.println("Phan tu thu " + i + " : " + batman[i]);
		scanner.close();
	}
	}
}
