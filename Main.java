//exception handling
import java.util.*;
public class Main{
	public static void main (String[] arg){
		try{
			Scanner input = new Scanner(System.in);
			Customer customer = new Customer();
			Payment pay = new Payment();
			Order ord = new Order();
			System.out.println();
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("|                    Hi, Welcome to Healthy Restaurant!                       |");
			System.out.println("| In this restaurant we will suggest you menus that suitable with your BMI.   |");
			System.out.println("-------------------------------------------------------------------------------\n");
			customer.information();
			ord.calculateTotal();
			pay.print();}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
			System.exit(0);}}}



