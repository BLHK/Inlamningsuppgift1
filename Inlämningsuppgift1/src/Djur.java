
public abstract class Djur implements IDjur{
	
	private String namn;
	private int vikt;
	
	Djur(){}
	
	Djur(String namn, int vikt){
		this.namn = namn;
		this.vikt = vikt;
	}
	
	public String getNamn(){
		return namn;
	}
	
	public int getVikt() {
		return vikt;
	}
	public double fåMat() {
		return vikt/10;
	}
	public String mat() {
		return "hundmat";
	}
}
