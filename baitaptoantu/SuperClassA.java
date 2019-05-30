package baitapvenha;

public class SuperClassA {

	public static void foo() {
		// TODO Auto-generated method stub
		System.out.println("SuperclassA");
   }
public class SubclassB extends SuperClassA{
	public static void bar() {
		System.out.println("SubclassB");
	}
}
public class Test{
	public static void main(String args[]) {
		SubclassB a = new SubclassB();
		a.foo();
		a.bar();
	}
}

}
