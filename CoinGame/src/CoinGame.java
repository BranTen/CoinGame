/*
* Class: CMSC201
* Instructor: Monshi
* Description: this program tosses three coins a dime, nickel, and quarter. the side 
* of the coin that faces heads gets added to your balance and if your balance is 100 then the game ends and you win
* Due: 04/03/2016
* I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Print your Name here: Brandon Tennyson
*/

public class CoinGame {

	public static void main(String[] args) { // start of the program
		int balance = 0;
		// tell the user their starting balance and number of heads/tails
		System.out.println("Lets start. Your Balance is " + balance);
		System.out.println("number of heads " + Coin.getnHeads());
		System.out.println("number of tails " + Coin.getnTails() + "\n");

		// call the coin class and sent it to the default constructor
		Coin quarter = new Coin();
		// call the coin class but pass the value 10
		Coin dime = new Coin(10);
		// call the coin class but pass the value 5
		Coin nickel = new Coin(5);

		while (balance < 100) { // while loop to make the program end

			System.out.println("Tossing three coins, a quarter, a dime, and a nickel...");

			quarter.toss(); // use the toss method to toss the quarter
			if (quarter.isHeads()) { // only if it is heads
				balance = balance + quarter.getValue();// add balance
			}
			dime.toss();
			if (dime.isHeads()) {
				balance = balance + dime.getValue();
			}
			nickel.toss();
			if (nickel.isHeads()) {
				balance = balance + nickel.getValue();
			}
			// tell the user the results of each toss
			System.out.println("The quarter toss resulted in " + quarter.getSideUp());
			System.out.println("The dime toss resulted in " + dime.getSideUp());
			System.out.println("The nickel toss resulted in " + nickel.getSideUp());
			System.out.println("Your Balance is $" + balance);
			System.out.println("number of heads " + Coin.getnHeads());
			System.out.println("number of tails " + Coin.getnTails() + "\n");

		}
		// let the user know if they won or lost
		if (balance == 100) {
			System.out.println("YOU WON.");
		} else {
			System.out.println("YOU LOST.");

		}
	}
}
