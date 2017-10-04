
public class Hund extends Djur {
	 
	Hund(String namn, int vikt){
		super(namn, vikt);
	}
	@Override
	public double fåMat() {				//Polymorf
		return super.getVikt()/100;
	}
}
