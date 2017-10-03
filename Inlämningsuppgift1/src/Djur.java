
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
	

	
	public int hundMat(int vikt, int mat) {
		return vikt / mat;
	}
	
	public int kattMat(int vikt, int mat) {
		return vikt / mat;
	}
	
	public int ormMat() {
		return 20;
	}
	
	
}
