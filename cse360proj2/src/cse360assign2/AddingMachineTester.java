package cse360assign2;

public class AddingMachineTester {
	 
	public static void main(String[] args) {
	       // create Calculator class object
	       AddingMachine myAddingMachine=new AddingMachine();
	       myAddingMachine.add(4); // call add() method
	       myAddingMachine.subtract(2); // call subtract() method
	       myAddingMachine.add(5);
	       System.out.println(myAddingMachine.toString());
	       System.out.println("Total = "+myAddingMachine.getTotal());
	   }
	}

