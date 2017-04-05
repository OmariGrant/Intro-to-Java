public class Task4 { // class name which must match filename
        public static void main (String [] args) {
        //default main class

        // set variables - input
        int x = 3;
        int y = 4;

// if x is equal to or greater than 4 do this
if (x >= 4) {
int newx = x-1; 
        if (newx >= 4) { // inner if statement after doing first calculation
        System.out.println("x is at least 4");
        System.out.println("x = " + newx + " y = " + y);
        } else {
                System.out.println("x is less than 4");
                System.out.println("x = " + newx + " y = " + y);
                }
}


// if x is less than 4 do this
if (x < 4) {
int newx = x+1;
        if (newx >= 4) { // inner if statement after doing first calculation
        System.out.println("x is at least 4");
        System.out.println("x = " + newx + " y = " + y);
        } else {
                System.out.println("x is less than 4");
                System.out.println("x = " + newx + " y = " + y);
                }

        } 

} // end main method
} // end class

