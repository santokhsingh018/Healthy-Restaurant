//polymorphism
//interface
interface AdditionalCharge{
	double gstTax=0.06;
	double sstTax=0.10;
	double serviceCharge=0.06;
	public double totalTax();}

//abstract
abstract class Totalpay{
	double pay;
	public void Totalpay(double p){pay=p;}
	public abstract double Totalpay();
	public double getPay(){return pay;}}

public class Charge extends Totalpay implements AdditionalCharge{
	double total;
	public double totalTax(){
		return gstTax+sstTax+serviceCharge;}

	public void setTotal(double total){this.total = total;}
	public double getTotal(){return total;};

	public double Totalpay(){
		return totalTax() * getTotal();}}




