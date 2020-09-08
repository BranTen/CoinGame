
public class Coin {

	private int value = 25; // for default value
	private String sideUp;
	private static int nHeads = 0, nTails = 0;

	Coin() { // default constructor

	}

	public Coin(int newValue) { // this constructor gets used if a value was
								// passed
		this(); // calls default constructor
		value = newValue;
	}

	public void toss() { // this method tosses the coins one after another
		int t = (int) (Math.random() * 2); // results in 0 or 1

		if (t == 0) {
			setSideUp("Heads");
			nHeads++;// if heads increment nHeads
		} else {
			setSideUp("Tails");
			nTails++;// if tails increment nTails
		}
	}

	public int getValue() {// getter
		return value;
	}

	public String getSideUp() {// getter
		return (sideUp);
	}

	private void setSideUp(String sideUp) {// setter
		this.sideUp = sideUp;
	}

	public boolean isHeads() {// this method sets a boolean value to heads and
								// tails

		if (getSideUp().equals("Heads")) {

			return true;
		}
		return false;

	}

	public boolean isTails() {

		return (!isHeads());

	}

	public static int getnHeads() {// getter
		return nHeads;
	}

	public static int getnTails() {// getter
		return nTails;
	}

}
