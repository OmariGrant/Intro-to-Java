import javax.swing.JOptionPane;

public class Age {
	public static void main (String [] args) { 


int Age1;
int Age2;

//Inital input screen 
String Age1s = JOptionPane.showInputDialog(null,"Enter Age1");
String Age2s = JOptionPane.showInputDialog(null,"Enter Age2");
Age1 = Integer.parseInt(Age1s);
Age2 = Integer.parseInt(Age2s);

// add together two age inputs
int AgeT = Age1 + Age2;


while (AgeT < 80) { //while total age less than 80 do this 
	String Age1s1 = JOptionPane.showInputDialog(null, "Enter Age1");
	String Age2s1 = JOptionPane.showInputDialog(null, "Enter Age2");
	Age1 = Integer.parseInt(Age1s1);
	Age2 = Integer.parseInt(Age2s1);
	AgeT = Age1 + Age2 + AgeT;
}

if (AgeT > 100) { //if total age combined is above one hundred do this
	System.out.println("The combined ages add up to more than 100");
}
		
	}
}
