import java.util.*;
public class Order extends Customer{//inheritance
	ArrayList <Order> r = new ArrayList<Order> ();
	private int orderId;
	private double price;
	Charge chg;//composition

	//constructor
	public Order(){}
	public Order(int orderId, double price){
		this.orderId= orderId;
		this.price=price;}

	//mutator
	public void setOrder(int orderId){this.orderId= orderId;}
	public void setPrice(double price) {this.price= price;}

	//accessor
	public int getOrder(){return orderId;}
	public double getPrice(){return price;}

	//ArrayList
	public void addOrder(int order,double price){
		Order ord = new Order(order,price);
		r.add(ord);}

	public void deleteOrder(int ord){
		r.remove(ord);}

	//overloading
	public void print(ArrayList <Order> r){
		super.print();
		System.out.println("Total order: " +r.size());
		System.out.println(" ");

		for(int i=0; i<r.size(); i++){
			System.out.println("Order " +i+ ": \n" + "Menu: " +r.get(i).getOrder());}}

	public void calculateTotal(){
		double total=0;
		for(int i=0; i<r.size(); i++){
			total+=r.get(i).getPrice();
			chg.setTotal(total);}}}