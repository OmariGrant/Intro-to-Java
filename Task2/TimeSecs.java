public class TimeSecs { 
// class name which must match filename
	public static void main (String [] args) {
	//default main class

//set input - seperating time into Hour, Minutes and seconds
int Hour = 22;
int Minutes = 56;
int Seconds = 44;

//process time and convert to seconds
int Hr = Hour * 3600;  //3600 seconds in one hour 60 (mins) * 60 (secs) = 3600 (secs)
int Mins = Minutes * 60;
int TotalSecs = Hr + Mins + Seconds;

//process string to put the time units together
String FullTime = Hour+":"+Minutes+":"+Seconds;

//out the total seconds after midnight
System.out.println(FullTime + " is " + TotalSecs + " seconds after midnight");
		
	}
}