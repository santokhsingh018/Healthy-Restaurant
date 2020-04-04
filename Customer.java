import java.util.*;
public class Customer{
	private String name, address, phoneNum;
	private double height, weight, bmi;
	int num;
	Menus menu; //composition
	protected Customer[] cust; //array

	//overloading constructor
	public Customer(){}

	public Customer(String name, String address, String phoneNum){
		this.name= name;
		this.address= address;
		this.phoneNum= phoneNum;}

	public Customer(String name, String address, String phoneNum, double weight, double height, double bmi){
		this.name= name;
		this.address= address;
		this.phoneNum= phoneNum;
		this.weight=weight;
		this.height=height;
		this.bmi=bmi;}

	//mutator
	public void setName(String name) {this.name=name;}
	public void setAddress(String address) {this.address=address;}
	public void setphoneNum(String phoneNum) {this.phoneNum=phoneNum;}
	public void setWeight(double weight) {this.weight=weight;}
	public void setHeight(double height) {this.height=height;}
	public void setBMI(double bmi) {this.bmi=bmi;}
	public void setNum(int num) {this.num=num;}

	//accessor
	public String getName(){return name;}
	public String getAddress() {return address;}
	public String getphoneNum() {return phoneNum;}
	public double getWeight() {return weight;}
	public double getHeight() {return height;}
	public double getBMI() {return bmi;}
	public int getNum(){return num;}

	public double calcBMI(double weight, double height){
		return weight/((height/100)*(height/100));}

	//overriding
	public void print(){
		for(int i=0; i<num; i++){
			System.out.println("Name: " + cust[i].getName());
			System.out.println("Address: " + cust[i].getAddress());
			System.out.println("PhoneNum: " +cust[i].getphoneNum());
			System.out.println("Weight: " +cust[i].getWeight());
			System.out.println("Height: " +cust[i].getHeight());
			System.out.println("BMI: " + cust[i].getBMI());}}

	//array
	public void information(){
		Menus menu = new Menus();
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter number of people: ");
		int num = in.nextInt();
		setNum(num);
		System.out.println();
		cust = new Customer[num];

		System.out.println("Please enter your details below: ");
		for(int i=0; i<num; i++){
			Scanner input = new Scanner(System.in);
			System.out.println("Customer " +(i+1));
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("Address: ");
			String address = input.nextLine();
			System.out.print("Phone number: ");
			String phoneNum = input.nextLine();
			System.out.print("Weight(kg): ");
			double weight = input.nextDouble();
			System.out.print("Height(cm): ");
			double height = input.nextDouble();
			System.out.println();
			double bmi=calcBMI(weight,height);
			cust[i] = new Customer (name, address, phoneNum, weight, height,bmi);
			menu.print(bmi,name);}}}

