package mytel_projrct;

import java.util.Scanner;

class options{
	public  void mytel() {
		System.out.println("Welcome to Mytel:");
		System.out.println("Enter option 1 for mobile recharge");
		System.out.println("Enter option 2 for pay bills");
		System.out.println("Enter option 3 to convert prepaid to postpaid/postpaid to prepaid");
		System.out.println("ENter option 4 to know the balance");
		System.out.println("ENter option 5 for profile details");
		System.out.println("Enter 0 to exit");
	}
}
class card_details{
	public static void card_details_method(){
		System.out.println("Enter payment details:");
		System.out.println("Enter debit card/credit card number:");
		Scanner bb=new Scanner(System.in);
		int cardnumb=bb.nextInt();
		
		System.out.println("Enter Expiry date:");
		Scanner cc=new Scanner(System.in);
		int expnumb=cc.nextInt();
		
		System.out.println("Enter CVV number:");
		Scanner dd=new Scanner(System.in);
		int cvvnumb=dd.nextInt();
	}
}
class mobile_recharge{
	public static void recharge_method() {
		System.out.println("Enter mobile number:");
		Scanner sc=new Scanner(System.in);
		int mnumb=sc.nextInt();
		
		System.out.println("packages:"+"\n"+"package 1"+"\n"+"Amount 200"+"\n"+"validity 30days"+"\n"+"Data 3GB/day");
		System.out.println("package 2"+"\n"+"Amount 300"+"\n"+"validity 30days"+"\n"+"Data 6GB/day");
		
		System.out.println("Enter the appropriate package number to proceed further");
		Scanner aa=new Scanner(System.in);
		int packnumb=aa.nextInt();
		
		card_details.card_details_method();
		
		System.out.println("Congratulations...your recharge is successful...");
	}
}
class bill_pay_module{
	public static void bill_pay_method() {
		System.out.println("Enter post paid number:");
		Scanner ee=new Scanner(System.in);
		int postnumb=ee.nextInt();
		
		System.out.println("Bill due amount is 600 INR");
		card_details.card_details_method();
		
		System.out.println("Congratulations...your bill amount is paid successful...");
	}
}
class conversion_module{
	public static void convertion_method() {
		System.out.println("Enter mobile number:");
		Scanner ff=new Scanner(System.in);
		int mobilenumb=ff.nextInt();
		
		System.out.println("Enter option 6 to convert prepaid to post");
		System.out.println("ENter option 7 to convert post to prepaid");
		
		Scanner gg=new Scanner(System.in);
		int convertionnumb=gg.nextInt();
		
		System.out.println("Congrats!!your request is received.You new SIM will be delivered within 2 days to your address");
		
	}
}
class balance_module{
	public static void balance_method() {
		System.out.println("Enter mobile number:");
		Scanner hh=new Scanner(System.in);
		int mobnumb=hh.nextInt();
		
		System.out.println("Balance:"+"\n"+"sms"+"\n"+"Talktime:unlimited"+"\n"+"Data:1.GB");
	}
}
class profile_details_module{
	public static void profile_details_method() {
		System.out.println("Enter your Mobile Number:");
		Scanner jj=new Scanner(System.in);
		long monumb=jj.nextLong();
		
		System.out.println("Enter your Name:shiva");
	
		System.out.println("Enter your Address:Hayathnagar,Telangana.");
	
	}
}
public class project {
public static void main(String[] args) {
	options obj=new options();
	obj.mytel();
	
	Scanner oo=new Scanner(System.in);
	int option=oo.nextInt();
	
	if(option==1) {
		mobile_recharge.recharge_method();
	}
	else if(option==2) {
		bill_pay_module.bill_pay_method();
	}
	else if(option==3) {
		conversion_module.convertion_method();
	}
	else if(option==4) {
		balance_module.balance_method();
	}
	else if(option==5) {
		profile_details_module.profile_details_method();
			}
	else if(option==0) {
		System.exit(0);
	}
	System.out.println("Enter option 9 to go back to main options."+"\n"+"Enter 0 to exit.");
	Scanner zz=new Scanner(System.in);
	int exit=zz.nextInt();
	if(exit==9) {
		project.main(args);
	}
	else if(exit==0) {
		System.exit(0);
	}
}
}
