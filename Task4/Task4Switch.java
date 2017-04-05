public class Task4Switch { // class name which must match filename
        public static void main (String [] args) {
        //default main class

        // set variables - input
        int x = 3;
        int y = 4;
        int newx;
        char underfour;

// if x is equal to or greater than 4 do this
if (x >= 4) {
newx = x-1; 
return;
}
// if x is less than 4 do this
else if (x < 4) {
newx = x+1;
return;
        } 


        String xString;
        if (newx < 4) {
                underfour = 'y'; 
                return;
        } else {
                underfour = 'n';
                return;
        }


        switch (underfour) {
                case 'y': xString = "x is less than 4";
                break;
                case 'n': xString = "x is at least 4";
                break;
        }


                System.out.println(xString + "x = " + newx + " y = " + y);


} // end main method
} // end class

