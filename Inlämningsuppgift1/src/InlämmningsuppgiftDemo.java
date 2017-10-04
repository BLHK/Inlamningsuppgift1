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
			JOptionPane.showMessageDialog(null, sixten.getNamn() + " ska få " + sixten.fåMat() + " gram " + sixten.mat());
		if(s.equals(dogge.getNamn()))
			JOptionPane.showMessageDialog(null, dogge.getNamn() + " ska få " + dogge.fåMat() + " gram " + dogge.mat());
		
		if(s.equals(hypno.getNamn()))
			JOptionPane.showMessageDialog(null, hypno.getNamn() + " ska få " + hypno.fåMat() + " gram " + hypno.mat());
		
		if(s.equals(venus.getNamn()))
			JOptionPane.showMessageDialog(null, venus.getNamn() + " ska få " + venus.fåMat() + " gram " + venus.mat());
		if(s.equals(ove.getNamn()))
			JOptionPane.showMessageDialog(null, ove.getNamn() + " ska få " + ove.fåMat() + " gram " + ove.mat());
		
		
	}
	
	public static void main(String[] args) {
		InlämmningsuppgiftDemo inl = new InlämmningsuppgiftDemo();
	}
}
