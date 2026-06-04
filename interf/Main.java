package interf;

public class Main {
	public static void main(String[] args) {
		Intpayment i =new Googlepay() ;
			i.makepayment();
			Intpayment a =new Phonepay() ;
		     a.makepayment();
			Intpayment b =new Paytm() ;
			 b.makepayment();
		
		
		}
}


