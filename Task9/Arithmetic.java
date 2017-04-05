import javax.swing.JOptionPane;
public class Arithmetic {
    public static void main(String[] args) {
        int code = outputInstructions();
        switch (code) {
          case 1: add();
            break;
          case 2: subtract();
            break;
          case 3: multiply();
            break;
          case 4: divide();
            break;
          default: System.out.println("Invalid code entered");
            break;
        }
    }
    public static int outputInstructions() {
         String response = JOptionPane.showInputDialog(null, "Enter 1 to add, 2 to subtract, 3 to multiply, or 4 to divide");
         return Integer.parseInt(response);
    }
    public static void add() {
	int first = inputInteger("Enter first number");
	int second = inputInteger("Enter second number");
		// add one line of code here to do the addition
  int Total_add = first + second;
		// add a line of code to output the answer
  System.out.println("Answer: " + Total_add);
    }

    public static void subtract() {
		// add lines of code to declare variables and do the subtraction here
        int first = inputInteger("Enter first number");
        int second = inputInteger("Enter second number");
        int Total_sub = first - second;
		// add a line of code to output the answer
        System.out.println("Answer: " + Total_sub);
    }

    public static void multiply() {
		// add lines of code to declare variables and do the multiplication here
        int first = inputInteger("Enter first number");
        int second = inputInteger("Enter second number");
        int Total_mul = first - second;
		// add a line of code to output the answer
        System.out.println("Answer: " + Total_mul);
    }

    public static void divide() {
		// add lines of code to declare variables and do the division here
        int first = inputInteger("Enter first number");
        int second = inputInteger("Enter second number");
        int Total_div = first / second;
		// add a line of code to output the answer
        System.out.println("Answer: " + Total_div);
    }

    public static int inputInteger(String message) {
		String response = JOptionPane.showInputDialog(null, message);
		return Integer.parseInt(response);
    }}
