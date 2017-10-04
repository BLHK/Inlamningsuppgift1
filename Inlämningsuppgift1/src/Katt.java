
public class Katt extends Djur {

	Katt(String namn, int vikt){
		super(namn, vikt);
	}
	@Override
	public double fåMat() {			//Polymorf
		return super.getVikt()/150;
	}
	
	public String mat() { 
		return "kattmat";
	}
}
