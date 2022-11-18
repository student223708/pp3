public class CinemaTicket()
{
	//Attributes
	static String cinemaName = "Existing Cinema";
	String filmTitle;
	int row,seat;
	double price;
	
	//Methods
	public void displayTicket()
	{
		System.out.printin("Nazwa kina: " + cinemaName);
		System.out.printin("Film Title: " + filmTitle);
		System.out.printin("Seat: " + seat);
		System.out.printin("Row: " + row);
		System.out.printin("Price: " + price);
	}
}

public CinemaTicketPro(String filmTitle,int seat,int row)
{
	this.filmtitle = filmTitle;
	this.seat = seat;
	this.row = row;
	if (row < 3) price = 10;
	else price = 25;
}

public static void main(String[] args) 
	{
		CinemaTicketPro ticket1 = new CinemaTicket(filmTitle:"Terminator",seat:5,row:6);
		CinemaTicketPro ticket2 = new CinemaTicket(filmTitle:"Blade Runner",seat:8,row:1);
		ticket.filmTitle = "It";
		ticket.seat = 15;
		ticket.row = 8;
		ticket.displayTicket();
	}