
public class Hund extends Djur {
	 
	Hund(String namn, int vikt){
		super(namn, vikt);
	}
	@Override
	public double f�Mat() {				//Polymorf
		return super.getVikt()/100;
	}
	
	//Kallar aldrig p� mat, finns redan i superklassen f�r denna klassen. (Dynamisk bindning)
}
