package interface1;

public class hinhthang implements Toanhoc{
	public double canhday1,canhday2,chieucao,canhben1,canhben2;
	public hinhthang(double a, double b, double c, double d, double e){
		this.canhday1= a;
		this.canhday2=b ;
		this.chieucao= c;
		this.canhben1=d;
		this.canhben2=e;
	}
	
	public double calS(){
		
		return chieucao*((canhday1+canhday2)/2);
	}
	public double calP() {
		// TODO Auto-generated method stub
		return canhday1+canhday2+canhben1+canhben2;
	}

public void println() {
	
	System.out.println("dien tich hinh thang:" +calS());

	System.out.println("chu vi hinh thang:" +calP());
}

	
}

