package javaclass1;

public class Person {
	
	   
	    private String cmnd;
	    private String hoTen;
	     
	  
	    public String getCmnd() {
	        return cmnd;
	    }
	     
	   
	    public void setCmnd(String cmnd) {
	        this.cmnd = cmnd;
	    }
	    public String getHoTen() {
	        return hoTen;
	    }
	    public void setHoTen(String hoTen) {
	        this.hoTen = hoTen;
	    }
	
	public static void main(String[] args) {
        Person person = new Person();
         
        // gán giá trị họ tên cho đối tượng person vừa tạo thông qua setHoTen() 
        // và gán số chứng minh nhân dân thông qua setCmnd()
        person.setHoTen("Trần Văn Bình");   
        person.setCmnd("212321678");
       
        // truy cập đến tên của đối tượng person thông qua phương thức getHoten()
        // và số chứng minh nhân dân thông qua phương thức getCmnd()
        System.out.println("Tên: " + person.getHoTen() + ", số cmnd: " + person.getCmnd());
        person.setHoTen("Nguyễn Thanh Nhân");
        person.setCmnd("191827890");
      System.out.println("Tên: " + person.getHoTen() + ", số cmnd: " + person.getCmnd());
 }
}

