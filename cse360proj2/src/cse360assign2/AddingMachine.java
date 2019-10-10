/*
 * @author Fernando Angel
 * 
 * Description: adding machine that adds and subtracts and also has a string that keeps
 * track of it all and when you print it should have spaces in between.
 */

package cse360assign2;

public class AddingMachine {

	private int total;
	private String sTotals;
	
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	// get the total
	public int getTotal () {
		return total;
	}
	//add value and total
	public void add (int value) {
		total = total + value;
		sTotals = total + " + " + value;
	}
	//subtract value and total
	public void subtract (int value) {
		total = total - value;
		sTotals = total + " - " + value;
		
	}
		//string
	public String toString () {
		return sTotals;
	}
//clear string and total
	public void clear() {
		total = 0;
		sTotals = "";

	}
}

