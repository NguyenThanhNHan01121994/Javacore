package baitapvenha;
import java.text.DecimalFormat;
import java.util.Scanner;

class tinnhdientichvathetichhinhcau {
public static final float PI = 3.14f;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println("Nhap vao ban kinh hinh cau(r>0): ");
		float radius = scanner.nextFloat();
		float area = 4* PI * radius * radius;
		System.out.println("Dien tich hinh cau la:"+ decimalFormat.format(area));
		float Vol= (float)4/3* PI * radius * radius * radius;
		System.out.println("The tich hinh cau la:" +decimalFormat.format(Vol));
		scanner.close();

	}

}
