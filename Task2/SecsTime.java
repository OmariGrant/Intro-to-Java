public class SecsTime { // class name which must match filename
	public static void main (String [] args) {
	//default main class

//set input - seconds
int TotalSecs = 82604;

//process seconds and convert to time

int Hr = TotalSecs / 3600; // how many whole hours

int HrSecsLeft = TotalSecs - (Hr * 3600); // how many seconds are left after subtracting whole hours

int Minutes =  HrSecsLeft / 60; // Amount of seconds left after hours have been subtracted - this divided by 60 equals the minutes

int Secs = HrSecsLeft - (Minutes * 60); // This gives amount of seconds left after working out hours and minutes

// Amount of seconds is what is left after the whole hours in seconds have been subtracted to the amount of minutes in seconds 


//output the total seconds after midnight
System.out.println(TotalSecs + " Seconds after midnight is " + Hr + ":" + Minutes + ":" + Secs + " in 24 hour time");
		
	}
}