import javax.swing.JOptionPane;


public class week9Smallest { // class name which must match filename
	public static void main (String [] args) { //default main class
	
	int i; // set counter
	int j;
	int smallest = 9999; //set smallest 
	int smallest1;
	int [] x; //create array
	x = new int[10]; //set array with space for 10 ints
//populate values
	x[0] = 6;
	x[1] = 456;
	x[2] = 867;
	x[3] = 32;
	x[4] = 34;
	x[5] = 696;
	x[6] = 335;
	x[7] = 234;
	x[8] = 1;
	x[9] = 786;

	//for loop to count 
	for (i = 0; i < 10; i++) {
	//check whats smallest and set as variable
	if (x[i] < smallest){
		int y = x[i];
		smallest = y;
		smallest1 = i;	
	}
	
	
}


System.out.println(smallest + " Is smallest number ");


//for loop to count 
	for (i = 0; i < 10; i++) {
	//check whats smallest and set as variable
	if (x[i] == smallest){
		
		System.out.println("The position with the lowest value is " + i);
	
	}
	
	
}




}
}