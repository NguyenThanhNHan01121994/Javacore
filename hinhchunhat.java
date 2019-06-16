package kethua;

public class hinhchunhat extends hinhoc {
	public void chuvihinhchunhat(int a, int b) {
		chuvi = (a+b)*2;
		System.out.println("chu vi cua hinh chu nhat la: "+chuvi);
	}
	public void dientichhinhchunhat(int a, int b) {
		dientich = a*b;
		System.out.println("dien tich cua hinh chu nhat la: "+dientich);
	}
	public static void main(String[] args) {
		int a=8;  int b=10; int R=3;
		hinhchunhat hinhchunhat = new hinhchunhat();
		hinhchunhat.chuvihinhchunhat(a,b);
		hinhchunhat.dientichhinhchunhat(a,b);
		
	}
}
