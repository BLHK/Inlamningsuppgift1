import javax.swing.JOptionPane;

public class InlämmningsuppgiftDemo{
	
	InlämmningsuppgiftDemo(){
		Hund sixten = new Hund("Sixten", 5000);
		Hund dogge = new Hund("Dogge", 10000);
		Orm hypno = new Orm("Hypno", 1000);
		Katt venus = new Katt("Venus", 5000);
		Katt ove = new Katt("Ove", 3000);
		
		
		
		
		
		String s = JOptionPane.showInputDialog("Ange namn på ditt djur");
		
		if(s.equals(sixten.getNamn()))
			System.out.println(sixten.getNamn() + " ska få " + sixten.hundMat(sixten.getVikt(), 100) + " gram hundfoder");
		if(s.equals(dogge.getNamn()))
			System.out.println(dogge.getNamn() + " ska få " + dogge.hundMat(dogge.getVikt(), 100) + " gram hundfoder");
		
		if(s.equals(hypno.getNamn()))
			System.out.println(hypno.getNamn() + " ska få " + hypno.ormMat() + " gram orm mat");
		
		if(s.equals(venus.getNamn()))
			System.out.println(venus.getNamn() + " ska få " + venus.kattMat(venus.getVikt(), 100) + " gram kattmat");
		if(s.equals(ove.getNamn()))
			System.out.println(ove.getNamn() + " ska få " + ove.kattMat(ove.getVikt(), 100) + " gram kattmat");
		
		
		//System.out.println(sixten.getNamn());
		//System.out.println(sixten.getVikt());
	}
	
	public static void main(String[] args) {
		InlämmningsuppgiftDemo inl = new InlämmningsuppgiftDemo();
	}
}
