public class W3CodingAssignment {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initial variables
		double itemPrice1 = 15.35;
		double itemPrice2 = 7.00;
		double walletMoney1 = 20.01;
		double walletMoney2 = 10.27;
		double numFriends1 = 10;
		double numFriends2 = 250;
		double ageYears1 = 30;
		double ageYears2 = 25;
		String fName1 = "Bob";
		String fName2 = "John";
		String lName1 = "Jones";
		String lName2 = "Jameson";
		char mInitial1 = 'A';
		char mInitial2 = 'J';
		
		//Variables built by operations. 
		double usedWallet1 = walletMoney1-itemPrice1;
		double usedWallet2 = walletMoney2-itemPrice2;
		double friendsperYear1 = numFriends1/ageYears1;
		double friendsperYear2 = numFriends2/ageYears2;
		String fullName1 = fName1+ " " + mInitial1 + ". " + lName1;
		String fullName2 = fName2+ " " + mInitial2 + ". " + lName2;
		
		//Operation-built variables used to introduce people and their finances after paying for something.
		System.out.println("My name is " + fullName1 + ".");
		System.out.println("I made " + friendsperYear1 + " friends each year.");
		System.out.println("I have $"+String.format("%.2f",usedWallet1)+" left after buying an XBOX.");
		System.out.println("My name is " + fullName2 + "."); 
		System.out.println("I befriended " + friendsperYear2 + " people each year.");
		System.out.println("I have $"+String.format("%.2f",usedWallet2)+" left after paying my bills.");
	}

}
