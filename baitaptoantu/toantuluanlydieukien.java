package baitapvenha;

import java.util.Scanner;

class toantuluanlydieukien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber, secondNumber;  
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        firstNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        secondNumber = scanner.nextInt();
         
        // Sử dụng toán tử luận lý điều kiện
        System.out.println("Kết quả của (firstNumber < 10) && (secondNumber < 10) là " +
                 ((firstNumber < 10) && (secondNumber < 10)));   
        System.out.println("Kết quả của (firstNumber < 10) || (secondNumber < 10) là " + 
                 ((firstNumber < 10) || (secondNumber < 10)));  
        scanner.close();
	}

}
