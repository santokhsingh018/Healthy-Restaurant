import java.util.*;
public class Menus{

	protected int n;
	protected int choice;
	protected double bmi,total,price=0;
	protected String nm;
	Order ord;//composition

	//overloading
	public void print(double bmi, String nm)
	{
		Order ord = new Order();
		Scanner input = new Scanner (System.in);
		System.out.println("Dear " + nm+ ", ");
		if (bmi < 18.5)
		{
			System.out.println("Oh no, You are UNDERWEIGHT!\n");
			System.out.print("You should intake 2000 calories per day!!!\n");
			System.out.print("		Carbohydrate-250g\n");
			System.out.print("		Protein-100g\n");
			System.out.print("		Fat-66g\n\n");

			System.out.println("Here is the suggestion menu for you");
			System.out.print("1. Set 1\n");
			System.out.println("    a)Butter cookies\n    b)Chicken fried rice");
			System.out.print("2. Set 2\n");
			System.out.println("    a)Oreo biscuits\n    b)Maggi Goreng");
			System.out.print("Please enter the set that you want(1/2): ");
			n= input.nextInt();
			if (n == 1){
				choice = 1;
				menuList(1);}
			else{
				choice = 2;
				menuList(2);}
		}
		else if(bmi > 18.5 && bmi < 24.9){
			System.out.println("Congratulations! You are NORMAL!\n");
			System.out.print("You should intake 1600 calories per day!!!\n");
			System.out.print("		Carbohydrate-200g\n");
			System.out.print("		Protein-80g\n");
			System.out.print("		Fat-53g\n\n");

			System.out.println("Here is the suggestion menu for you");
			System.out.print("  1. Set 1\n");
			System.out.println("    a)Hwa Seng biscuits\n    b) Nasi Lemak Goreng\n");
			System.out.print("  2. Set 2\n");
			System.out.println("    a)Butter cookies\n    b)Chicken fried rice\n");
			System.out.print("Please enter the set that you want(1/2): ");
			n = input.nextInt();
			if (n == 1){
				choice = 3;
				menuList(3);}
			else{
				choice = 4;
				menuList(4);}
		}
		else{
			System.out.println("Oh no, You are OVERWEIGHT!\n");
			System.out.print("You should intake 1200 calories per day!!!\n");
			System.out.print("		Carbohydrate-150g\n");
			System.out.print("		Protein-60g\n");
			System.out.print("		Fat-40g\n\n");

			System.out.println("Here is the suggestion menu for you");
			System.out.print("  1.Set 1\n");
			System.out.println("    a)Oreo biscuits\n    b)Maggi Goreng\n");
			System.out.print("  2. Set 2\n");
			System.out.println("    a)Hwa Seng biscuits\n    b)Nasi Lemak Goreng\n");
			System.out.print("Please enter the set that you want(1/2): ");
			n= input.nextInt();
			if (n == 1){
				choice = 5;
				menuList(5);}
			else{
				choice = 6;
				menuList(6);}
		}

		System.out.println("Your menu choice is: ");
		menuList(choice);
		System.out.println("The price of the set is "+ total);
		System.out.println();
		ord.addOrder(choice, total);
	}

	public void menuList(int ch ) {

		switch(ch) {
			case 1:
				System.out.println("a)Butter cookies\nb)Chicken fried rice\n");
				price=21.0;
				total+=price;
				break;
			case 2:
				System.out.println("a)Oreo biscuits\nb)Maggi Goreng\n");
				price=22.5;
				total+=price;
				break;
			case 3:
				System.out.println("a)Hwa Seng biscuits\nb)Nasi Lemak Goreng\n");
				price=17.5;
				total+=price;
				break;
			case 4:
				System.out.println("a)Butter cookies\nb)Chicken fried rice\n");
				price=17.5;
				total+=price;
				break;
			case 5:
				System.out.println("a)Oreo biscuits\nb)Maggi Goreng\n");
				price=17.5;
				total+=price;
				break;
			case 6:
				System.out.println("a)Hwa Seng biscuits\nb)Nasi Lemak Goreng]n");
				price=17.5;
				total+=price;
				break;
			default:
				System.out.println("Invalid choice");
				break;
		}
	}}