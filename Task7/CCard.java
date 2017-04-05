public class CCard {
	public static void main (String [] args) { 


double Tleft = 500;
double MPayment = 100; 


for (int m = 1; m <= 12; m = m + 1) { 

	Tleft = (Tleft - 100);
	Tleft = Tleft + (Tleft * .1);



	String TheMonth; 
	switch (m) { // a swith for each month
		case 1: TheMonth = "Jan";
				break;
		case 2: TheMonth = "Feb";
				break;
		case 3: TheMonth = "Mar";
				break;
		case 4: TheMonth = "Apr";
				break;
		case 5: TheMonth = "May";
				break;
		case 6: TheMonth = "Jun";
				break;
		case 7: TheMonth = "Jul";
				break;
		case 8: TheMonth = "Aug";
				break;
		case 9: TheMonth = "Sep";
				break;
		case 10: TheMonth = "Oct";
				break;
		case 11: TheMonth = "Nov";
				break;
		case 12: TheMonth = "Dec";
				break;
		default: TheMonth = "Please restart program";
				break;
	}
	System.out.println("Month: " + TheMonth + " Payment no: " + m + " Outstanding balance: " + Tleft);
}



		
	}
}