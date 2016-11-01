import java.util.Scanner;

public class VersatileSnitSoft {

	public static void main(String args[]) {
		Scanner tastiera = new Scanner(System.in);
		double amount;
		
		System.out.print("What's the price of a CD-ROM? ");
		
		amount = tastiera.nextDouble();
		// amount gets the value from the User input
		
		amount = amount + 25;
		
		System.out.print("We will bill $");
		System.out.print(amount);
		System.out.println(" to your credit card.");
		
		tastiera.close();
		
	}
}
