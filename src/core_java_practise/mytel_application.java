package core_java_practise;

class one{
	public void show(String c) {
		System.out.println(c);
	}
	public void show1(String d) {
		System.out.println(d);
	}
	public void show2(String d) {
		System.out.println(d);
	}
}
class two {
	public void demo(String e) {
		System.out.println(e);
	}
	public void demo1(String f) {
		System.out.println(f);
	}
	public void demo2(String h) {
		System.out.println(h);
	}
}
public class mytel_application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one obj=new one();
		obj.show("Welcome to Mytel:");
		obj.show1("Enter option 1 for mobile recharge");
		obj.show2("Enter option 2 for pay bills");
		two obj1=new two();
		obj1.demo("Enter option 3 to convert prepaid to postpaid/postpaid to prepaid");
		obj1.demo1("ENter option 4 to know the balance");
		obj1.demo2("ENter option 5 for profile details");
System.out.println("Enter 0 to exit");

		
	}

}
