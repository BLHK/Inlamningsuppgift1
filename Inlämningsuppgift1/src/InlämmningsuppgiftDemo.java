import javax.swing.JOptionPane;

public class Inl�mmningsuppgiftDemo{
	
	Inl�mmningsuppgiftDemo(){
		Hund sixten = new Hund("Sixten", 5000);
		Hund dogge = new Hund("Dogge", 10000);
		Orm hypno = new Orm("Hypno", 1000);
		Katt venus = new Katt("Venus", 5000);
		Katt ove = new Katt("Ove", 3000);
		
		
		
		
		
		String s = JOptionPane.showInputDialog("Ange namn p� ditt djur");
		
		if(s.equals(sixten.getNamn()))
			JOptionPane.showMessageDialog(null, sixten.getNamn() + " ska f� " + sixten.f�Mat() + " gram " + sixten.mat());
		if(s.equals(dogge.getNamn()))
			JOptionPane.showMessageDialog(null, dogge.getNamn() + " ska f� " + dogge.f�Mat() + " gram " + dogge.mat());
		
		if(s.equals(hypno.getNamn()))
			JOptionPane.showMessageDialog(null, hypno.getNamn() + " ska f� " + hypno.f�Mat() + " gram " + hypno.mat());
		
		if(s.equals(venus.getNamn()))
			JOptionPane.showMessageDialog(null, venus.getNamn() + " ska f� " + venus.f�Mat() + " gram " + venus.mat());
		if(s.equals(ove.getNamn()))
			JOptionPane.showMessageDialog(null, ove.getNamn() + " ska f� " + ove.f�Mat() + " gram " + ove.mat());
		
		
	}
	
	public static void main(String[] args) {
		Inl�mmningsuppgiftDemo inl = new Inl�mmningsuppgiftDemo();
	}
}
