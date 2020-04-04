import java.util.*;
public class Payment extends Order{//inheritance
	private double totalPrice;
	private String paymentType;
	Charge charg;//composition

	//constructor
	public Payment(){}
	public Payment(String paymentType){this.paymentType=paymentType;}

	//mutator
	public void setpaymentType(String paymentType){this.paymentType=paymentType;}

	//accessor
	public String getpaymentType(){return paymentType;}

	//overriding
	public void print(){
		Scanner input = new Scanner (System.in);
		System.out.println("Please choose type of payment: ");
		System.out.println("  1.Visa\n  2.Cash\n");
		System.out.print("Choice: ");
		int choice = input.nextInt();
		System.out.println();

		if(choice ==1){
			setpaymentType("Visa");}
		else{
			setpaymentType("Cash");}

		super.print();
		System.out.println("Your total bill is " + charg.Totalpay());
		System.out.println("Type of payment is " + getpaymentType());
		System.out.println("Thank you for coming here! Hope you enjoy the meal!");}}
