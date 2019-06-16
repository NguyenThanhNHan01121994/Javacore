package kethua;

public class hinhtron extends hinhoc{
	public void chuvihinhtron(float PI, int R) {
		chuvi =2*PI*R;
		System.out.println("chu vi cua hinh tron la: "+chuvi);
	}
	public void dientichhinhtron(float PI, int R) {
		dientich = PI*R*R;
		System.out.println("dien tich cua hinh tron la: "+dientich);
	}

	public void dientichhinhvuong(int a) {
		dientich =a*a;
		System.out.println("dien tich hinh vuong: "+dientich);
	}
	public void chuvihinhvuong(int a) {
		chuvi =a*4;
		System.out.println("dien tich hinh vuong: "+chuvi);
	}
	
	public void chuvihinhbinhhanh(int canhlon, int canhnho) {
		chuvi = (canhlon+canhnho)*2;
		System.out.println("chu vi cua hinh binh hanh la: "+chuvi);
	}
	public void dientichhinhbinhhanh(int canhlon, int chieucao) {
		dientich =canhlon*chieucao;
		System.out.println("dien tich cua hinh chu nhat la: "+dientich);
	}
	public static void main(String[] args) {
		int R=3; float PI=3.14f; int a= 5; int canhlon = 20; int chieucao=10; int canhnho =12 ;
		hinhtron hinhtron = new hinhtron();
		hinhtron.chuvihinhtron(PI,R);
		hinhtron.dientichhinhtron(PI,R);
		hinhtron.dientichhinhvuong(a);
		hinhtron.chuvihinhbinhhanh(canhlon, canhnho);
		hinhtron.dientichhinhbinhhanh(canhlon, chieucao);
	}
}

