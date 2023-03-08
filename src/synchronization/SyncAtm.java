package synchronization;
class Attm {
	double total_amount = 20000;
	
	synchronized void trans_amount(double amount) {
		if (total_amount >= amount) {
			System.out.println("Withdraw Amount Succussfully");
			total_amount = (total_amount - amount);
			System.out.println("remaining Amount" + total_amount);
		} else {
			System.out.println("transaction unsuccessful");
			System.out.println("remaining Amount" + total_amount);
		}
	}
}

class Sync extends Thread {
	static Attm a;
	double amount;

	public void run() {
		a.trans_amount(amount);
	}

	public class SyncAtm {
		public static void main(String[] args) {
			a = new Attm();
			Sync s = new Sync();
			s.amount = (8000);
			s.start();
			Sync s1 = new Sync();
			s.amount = (8000);
			s.start();
		}
	}
}
