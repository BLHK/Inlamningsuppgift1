
public class Katt extends Djur {

	Katt(String namn, int vikt){
		super(namn, vikt);
	}
	@Override
	public double f�Mat() {			//Polymorf
		return super.getVikt()/150;
	}
	
	public String mat() { 
		return "kattmat";
	}
}
