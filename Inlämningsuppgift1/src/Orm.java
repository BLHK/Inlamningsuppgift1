
public class Orm extends Djur{
	
	Orm(String namn, int vikt){
		super(namn, vikt);
	}
	@Override
	public double fåMat() {		//Polymorf
		return 20;
	}
}
