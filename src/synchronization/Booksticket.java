package synchronization;

class Booking {
	double total_seats = 10;

  void book_seats(int seats) {
		if (total_seats >= seats) {
			total_seats = total_seats - seats;
			System.out.println("Ticket is Confirmed");
			System.out.println("Remaing Seats" + total_seats);
		}
		 else {
			System.out.println("Sorry Ticket is not Confirmed");
			System.out.println("Remaining Seats" + total_seats);
		}
	}
}
	class One extends Thread {
		static Booking a;
		int seats;

		public void run() {
			a.book_seats(seats);
		}
	
	public class Booksticket {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a=new Booking();
		One o = new One();
		o.seats = 10;
		o.start();
		One o1 = new One();
		o1.seats= 2;
		o1.start();
		}
	}
}