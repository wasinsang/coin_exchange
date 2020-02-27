
package coin_exchange;
import java.util.Scanner;
public class Myclass {
	static int in(int a,int b) {
		int summary = a * b;
	    
	    return summary;
	  }
	public static void main(String[] args) {
		int one = 100;
		int five = 100;
		int ten = 100;
		while(true)
		{
			Scanner bank = new Scanner(System.in);  // Create a Scanner object
			System.out.println("We can receive 20 50 and 100 banknote type");
			System.out.println("You can exchange 1 5 and 10 bath coins");
	    	System.out.print("Enter banknote type :");
	    	String bank_1 = bank.nextLine();  // Read bank input
	    	int bank_2 = Integer.parseInt(bank_1);	
	    	System.out.println("Banknote type is: " + bank_1);  // Output user input
	    
	    	Scanner num = new Scanner(System.in);  // Create a Scanner object
	    	System.out.println("Enter number");
	    	String number = num.nextLine();
	    	int number_1 = Integer.parseInt(number);	
	    	System.out.print("Number of banknote is: " + number);  // Output user input
	    	
	    	int sum = in(number_1,bank_2);
	    	
	    	int one_count = sum;
		    int five_count = sum / 5;
		    int ten_count = sum / 10;
		    System.out.print("You can exchange 1 bath coin ");
		    System.out.println(one_count + "coin");
		    System.out.print("You can exchange 5 bath coin ");
		    System.out.println(five_count + "coin");
		    System.out.print("You can exchange 10 bath coin ");
		    System.out.println(ten_count + "coin");
		    System.out.println("what do you want to exchange.");
		    System.out.println("if you want to exchange 1 bath coin type 1");
		    System.out.println("if you want to exchange 5 bath coin type 5");
		    System.out.println("if you want to exchange 10 bath coin type 10");
		    System.out.println("if you want to cancle type *");
		    
	    	Scanner input = new Scanner(System.in);
	    	System.out.print("What will you do");
	    	String input1 = input.nextLine();
	    	if(isNumeric(input1) == false)
	    	{
	    		if(input1.equals("*") == true)
	    		{
	    			System.out.println("cancle");	
	    		}
	    		else
	    		{
	    			System.out.println("error");
	    		}
	    	}
	    	else
	    	{
	    		int input_number = Integer.parseInt(input1);
		    	if(input_number == 1)
		    	{
		    		if(one_count > one)
		    		{
		    			System.out.println("Not enough coin");
		    		}
		    		else
		    		{
		    			one = one - one_count;
		    			System.out.println("Receive" + one_count + "coins");
		    		}
		    		
		    	}
		    	else if(input_number == 5)
		    	{
		    		if(five_count > five)
		    		{
		    			System.out.println("Not enough coin");
		    		}
		    		else
		    		{
		    			five = five - five_count;
		    			System.out.println("Receive" + five_count + "coins");
		    		}
		    	}
		    	else if(input_number == 10)
		    	{
		    		if(ten_count > ten)
		    		{
		    			System.out.println("Not enough coin");
		    		}
		    		else
		    		{
		    			ten = ten - ten_count;
		    			System.out.println("Receive" + ten_count + "coins");
		    		}
		    	}
		    	else
		    	{
		    		System.out.println("Not in option");
		    	}
		    	System.out.println("Ten coins remain:" + ten);
		    	System.out.println("five coins remain:" + five);
		    	System.out.println("one coins remain:" + one);
	    	}
		}
	  }
	public static boolean isNumeric(final String str) {

        // null or empty
        if (str == null || str.length() == 0) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;

    }
}
