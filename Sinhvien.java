package javaclass1;



public class Sinhvien {
	public String ten;
	public String masv;
	public int namsinh;
	public double diem;
	
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	 

	public String getTen() {
		return ten;
	}
	public String getMasv() {
		return masv;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public double getDiem() {
		return diem;
	}
	public void inketqua() {
		System.out.println("Thông Tin SV");
		System.out.println("Tên Sinh Viên: "+getTen());
		System.out.println("Năm Sinh Sinh Viên: "+getNamsinh());
		System.out.println("Mã Sv Sinh Viên: "+getMasv());
		System.out.println("Điểm Sinh Viên:"+getDiem());
		System.out.println("-------");
	}
	
	public static void main(String[] args) {
		Sinhvien sv1 = new Sinhvien();
		Sinhvien sv2 = new Sinhvien();
		sv1.setTen("thanh nhân");
		sv1.setNamsinh(1994);
		sv1.setMasv("sv01");
		sv1.setDiem(7.87);
		sv1.inketqua();
		
		
		sv2.setTen("van ky");
		sv2.setNamsinh(1996);
		sv2.setMasv("sv02");
		sv2.setDiem(7.87);
		sv2.inketqua();
		
		
		
	}
	
	
}