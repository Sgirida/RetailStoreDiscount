package day3_assignments;

import java.util.Scanner;

public class RetailStore {
	static double markedprice;

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		System.out.println("Hii "+name+" Choose the one which you belong to: ");
		System.out.println("Grociries ? \\n1.Yes 2.No ");
		int v=sc.nextInt();
		if(v==1) {
			System.out.println("we dont have discount on groceries");
			System.out.println("enter marked price:");
			markedprice =sc.nextDouble();
			System.out.println("bill is" +markedprice);
		}
		else {
			System.out.println("1.Employee of the store\n2.Affliate of the store\n3.Customer");
			int n=sc.nextInt();


			switch(n) {
			case 1:
				double s, marketprice, discount1, bill;
				System.out.println("enter marked price:");
				discount1 = 30; //30 means 30%
				markedprice =sc.nextDouble();
				if(markedprice>100) {
					s = 100-discount1;
					bill = (s*markedprice)/100;
					System.out.println("as you are employee of	the	store you are getting 30% discount");
					System.out.println("bill after discount" +bill);
				}
				else {
					System.out.println("bill is"+markedprice);

				}break;
			case 2:
				double discount2;
				System.out.println("enter marked price:");
				discount2 = 10; //10 means 10%
				markedprice =sc.nextDouble();
				if(markedprice>100) {
					s = 100-discount2;
					bill = (s*markedprice)/100;
					System.out.println("as you are affiliate of	the store you are getting 10% discount");
					System.out.println("bill after discount" +bill);
				}
				else {
					System.out.println("bill is"+markedprice);

				}break;
			case 3:
				double discount3;
				System.out.println("enter marked price:");
				discount3 = 5; //5 means 5%
				markedprice =sc.nextDouble();
				if(markedprice>100) {
					s = 100-discount3;
					bill = (s*markedprice)/100;
					System.out.println("As you are customer for over 2years you are getting 5% discount");
					System.out.println(" bill after discount" +bill);
				}
				else {
					System.out.println("bill is"+markedprice);
				}



			}


		}
	}
}
